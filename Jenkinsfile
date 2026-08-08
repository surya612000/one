@Library('devops-shared-library') _
pipeline {
    agent any
    tools {
        maven 'mymaven'
    }
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
                dockerBuild()
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
