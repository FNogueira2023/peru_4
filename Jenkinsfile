pipeline{
    agent any

    tools{
// only maven,gradle,jdk
// name of the installation in jenkins
        maven "Maven 3.9.6"
    }

    parameters {
        string(name:"VERSION", defaultValue: "", description:"")
        choice(name:"VERSION", choices: ["1.0.0", "1.1.0", "1.2.0"], description:"")
        booleanParam(name: "executeTests", defaultValue: true, description:"")
    }

    environment {
        NEW_VERSION = "1.3.0"
//         credentials("id")
        SERVER_CREDENTIALS = credentials("docker_hub")
    }
    stages{

        stage("build"){
                steps{
                    echo "Build"
                    echo "The version ${NEW_VERSION}"
            }
        }

        stage("test"){
                    when{
                        expression {
                            BRANCH_NAME == 'dev' || BRANCH_NAME == 'test'
                        }
                        expression {
                            params.executeTests == true
                        }
                    }
                    steps{
                        echo "Test"
                    }
                }

        stage("deploy"){
                    steps{
                        echo "deploying version ${params.VERSION}"
//                         pasar credentials directo
                        // withCredentials([
                        //         usernamePassword(credentials: "docker_hub"), usernameVariable: USER, passwordVariable: PWD ])
                    }
                }

    }
    // post{
    //     always{
    //     //
    //     }
    //     failure{
    //     }

         // }
}
