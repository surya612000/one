
pipeline {
    agent any
    stages {
        stage ("CheckoutCode") {
            steps {
                checkoutCode()
            }
        }
        stage ("MavenBuild") {
            steps {
                mavenBuild()
            }
        }
        stage ("DockerBuild") {
            steps {
                script {
                    def image_name = "shaikmustafa/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerBuild(image_name, tag)
                }
            }
        }
        stage ("DockerPush") {
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
