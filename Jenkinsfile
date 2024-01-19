def gv

pipeline {
    agent any
    
    stages {
        stage('Init') {
            steps {
                gv = load "script.groovy"
            }
       }

        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build commands here
                gv.buildApp()
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your testing commands here
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deployment commands here
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline succeeded! Notify or do something on success.'
        }
        failure {
            echo 'Pipeline failed! Notify or do something on failure.'
        }
    }
}
