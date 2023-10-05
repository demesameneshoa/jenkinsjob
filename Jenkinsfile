pipeline {
    agent any

    tools {
        maven "3.9.5"
    }
    environment {
    DOCKERHUB_CREDENTIALS = credentials('d3a7b647-55ef-4593-9a17-df837bc3c01f')
    }
    stages {
        stage('Pull Git') {
            steps {
                git branch: 'main', url: 'https://github.com/demesameneshoa/jenkinsjob'
            }
        }
        stage('Maven Build'){
            steps {
                 sh "mvn clean install"
            }
        }
        stage('Docker Build'){
            steps{
                sh "docker build -t demesitguy/javahello ."
            }
        }
        stage('Docker Login') {
             steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('docker push') {
            steps {
                sh 'docker push demesitguy/javahello'
            }
        }
    }
}
