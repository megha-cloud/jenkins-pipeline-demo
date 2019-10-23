FROM jboss/wildfly

EXPOSE 8585

ADD /target/pipeline-jenkins-demo*.war /opt/jboss/wildfly/standalone/deployments/
