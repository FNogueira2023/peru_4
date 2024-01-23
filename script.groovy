def buildApp(){
    echo "building the app..."
    sh 'clean install'
}

def deployApp(){
    echo "deploying version ${params.Version }"
}
return this
