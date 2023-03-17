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
    }

   		stage("Publish HTML Report"){
		 	echo "publishing HTML Reports..."
			publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '/var/lib/jenkins/workspace/Project1-InsureMe/target/sure			    fire-reports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
		      
		}	

}
