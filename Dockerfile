FROM tomcat

EXPOSE 8080

ADD /target/maven-git-test*.jar /usr/local/tomcat/webapps/
