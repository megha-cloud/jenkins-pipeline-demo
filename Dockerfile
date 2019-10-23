FROM jboss/wildfly
ADD /target/pipeline-jenkins-demo*.war /opt/jboss/wildfly/standalone/deployments/
