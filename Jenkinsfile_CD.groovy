pipeline{
	agent any
	
	stages{
		stage('Checkout'){
			steps{
				//add credentialsId: 'your_credential' if required
                                git branch: 'main', url: 'https://github.com/kestergoh68/helloworld.git'
			}		
		}
		
		stage('Deploy'){
			steps{
				sh 'docker-compose up -d'
			}
		}
	}
}
