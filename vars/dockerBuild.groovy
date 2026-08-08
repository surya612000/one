def call (String image_name) {
    echo "Build Docker image..."
    sh 'docker build -t $image_name:latest .'
}
