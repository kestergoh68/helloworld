pipeline{
	agent any
	
	stages{
		//continued from JenkinsCI pipeline
		
		stage('Deploy'){
			steps{
				sh 'docker-compose up -d'
			}
		}
		
		//stage('Api Availability Test')
		//stage('Vulnerability Test')
		//stage('Load Test')
	}
}
