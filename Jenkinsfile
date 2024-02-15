
pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/VivekMaltare/SPE.git']])
                sh 'mvn clean install'
            }
        }
         stage('Run Tests') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }


        stage('Build docker image') {
            steps {
                script {
                    sh 'docker build -t vivekmaltare/spe_mini_project .'
                }
            }
        }

        stage('Push Docker image') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'DockerHubCreds', variable: 'Binding')]) {
                        sh 'docker login -u vivekmaltare -p ${Binding}'
                    }
                    sh 'docker push vivekmaltare/spe_mini_project'
                }
            }
        }
        stage('Stop and Remove Existing Container') {
                    steps {
                        script {
                            // Stop and remove existing container if it exists
                             sh 'docker stop JavaContainer || true'
                            sh 'docker rm -f JavaCalculator || true'
                        }
                    }
                }

         stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }
    }
}
