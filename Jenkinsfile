pipeline {
	agent any 
	tools {
		maven 'M2_HOME'
	      }

	stages {

		stage("prepare the environment"){
		echo "initializing variable"
		}
		stage("checkout"){
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
}
