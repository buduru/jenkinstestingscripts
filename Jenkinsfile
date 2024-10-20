
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/buduru/jenkinstestingscripts.git'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
