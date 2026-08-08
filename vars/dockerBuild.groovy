def call () {
    echo "Build Docker image..."
    sh 'docker build -t shaikmustafa/shared-jenkins:tag .'
}
