def gv

pipeline {
    agent any

    parameters {
        choice(name: "VERSION", choices: ["1.0.1","1.0.2","1.0.3"],description: "")
    }
    
    stages {
        stage('Init') {
            steps {
                script {
                        gv = load "script.groovy"
                }
            }
       }

        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build commands here
                script {
                    gv.buildApp()
                }
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

                script{
                    gv.deployApp()
                }
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
