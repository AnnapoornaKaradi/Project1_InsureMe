pipeline {
	agent any 
	tools {
		maven 'M2_HOME'
	      }

	stages {

		stage("Pull the Project from GitHub"){
		steps{
			git 'https://github.com/AnnapoornaKaradi/Project1_InsureMe.git'
		     }
		  }

		stage('Build the application'){
		steps{
			echo 'cleaning..compiling..testing..packaging..'
			sh 'mvn clean package'
		     }
		  }	
   		stage('Publish HTML Report'){
		steps{
		      publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '/var/lib/jenkins/workspace/Project1-InsureMe/target/surefire-reports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
		  }
		}	
		stage('Containerize the application'){
		steps{
			echo 'Creating a docker image'
			sh 'docker build -t annapoornakaradi/project1_insureme .'
		    }
		} 
		stage('Pushing the image to dockerhub'){
		steps{
			 withCredentials([string(credentialsId: 'Docker_id', variable: 'dockerHubPassword',usernameVariable: 'dockerHubUser')]) {
			 sh 'docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
			 sh 'docker push annapoornakaradi/project1_insureme'
           }
}
