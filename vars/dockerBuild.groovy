def call (String image_name, String tag) {
    echo "Build Docker image..."
    sh 'docker build -t $image_name:$tag .'
}