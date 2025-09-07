# Command to run the container:
# docker build --tag park-project:latest .
# docker run --name park-project -p 8080:8080 --rm park-project:latest

FROM tomcat:9-jdk16
COPY build/libs/park-project.war /usr/local/tomcat/webapps/