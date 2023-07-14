def call(buildCodeStage) {
    sh """
        rm -rf node_modules
        npm install
    """
}


