pipeline {
    agent any
    stages {
        stage('SonarQube Report') {
            steps {
                withSonarQubeEnv('SonarQube7'){
                    sh 'mvn clean sonar:sonar -Dsonar.host.url=http://52.167.120.79:9000 -Dsonar.projectKey="pipelineDemo1" -Dsonar.sources=src/main/java -Dsonar.java.binaries=.'
                }
            }
        } 
        stage('Maven Build') {
            steps {
                 sh 'mvn clean package'
            }
        }
        stage('Junit with JOCOCO') {
            steps {
               step([$class: 'JacocoPublisher', 
                    execPattern: 'target/*.exec',
                    classPattern: 'target/classes',
                    sourcePattern: '**/src/*/java',
                    exclusionPattern: 'src/test*'
               ])
            }
        }
        stage('Artifactory Upload'){
            steps {
                rtUpload (
                    serverId: 'Artifactoty 6.13',
                    spec: '''{
                        "files": [
                         {
                            "pattern": "/var/lib/jenkins/workspace/jenkins-pipeline-demo/target/pipeline-jenkins-demo*.war",
                            "target": "jenkins-maven-project-snapshot/"
                         }
                        ]
                    }''', failNoOp: true
                )
            }
        }
        
        stage('Building Docker Image & Pushing To DockerHub'){
            steps{
                script{
                    docker.withRegistry('https://registry.hub.docker.com','dockerhub'){
                        myImage=docker.build("megha8docker/pipeline-demo-repo:3.0")
                        myImage.push()
                    }    
                }
            } 
            
        }
    }
}
