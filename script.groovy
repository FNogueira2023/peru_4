def buildApp(){
    echo "building the app..."
    sh 'mvn clean install'
}

def deployApp(){
    echo "deploying version ${params.Version }"
}
return this
