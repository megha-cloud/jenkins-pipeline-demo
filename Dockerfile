FROM tomcat

EXPOSE 8080

ADD /target/pipeline-jenkins-demo*.war /usr/local/tomcat/webapps/
