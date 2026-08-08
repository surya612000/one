
pipeline {
    agent any
    stages {
        stage ("Checkout Code") {
            steps {
                checkoutCode()
            }
        }
        stage ("Maven Build") {
            steps {
                mavenBuild()
            }
        }
        stage ("Docker Build") {
            steps {
                script {
                    def image_name = "shaikmustafa/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerBuild(image_name, tag)
                }
            }
        }
        stage ("Docker Push") {
            steps {
                script {
                    def image_name = "shaikmustafa/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerPush(image_name, tag)
                }
            }
        }
    }
}
