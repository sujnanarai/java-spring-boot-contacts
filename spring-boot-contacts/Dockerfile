FROM tomcat:8
# Take the war and copy to webapps of tomcat
ENV APP_CONTEXT=springcontacts
COPY target/*.war /usr/local/tomcat/webapps/${APP_CONTEXT}.war