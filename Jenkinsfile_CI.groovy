pipeline{
	agent any
	stages{
		stage('Checkout Git'){
			steps{
				//add credentialsId: 'your_credential' if required
				git branch: 'main', url: 'https://github.com/kestergoh68/helloworld.git' 	
			}
			
		}
		
		stage('Compile'){
			steps{
				sh 'mvn clean install -DskipTests'
			}
		}

		stage('Test'){
			steps{
				parallel(
				    "unit test": {sh 'mvn test'},
				    "integration test": {sh 'Skipping'}
				)
			}
		}
		
		stage('Archive'){
			steps{
				sh 'docker build -t demo/helloworld .'
				sh 'docker save demo/helloworld:latest | gzip > helloworld_demo.tar.gz'
				sh 'git add helloworld_demo.tar.gz'
				sh 'git commit -m "Update helloworld image"'
				sh 'git push'
				sh 'rm -f helloworld_demo.tar.gz'
			}
		}
	}
}
