# Stage 1: Build the application using Maven
# This section uses a temporary container with Java and Maven installed
# to compile your code and create the .war file.
FROM maven:3.8-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application on a Tomcat server
# This section takes the .war file from Stage 1 and puts it
# into a new, clean container that only has a Tomcat server.
FROM tomcat:9.0-jre11-slim
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Tell Docker that the server will run on port 8080
EXPOSE 8089

# This command starts the Tomcat server when the container launches
CMD ["catalina.sh", "run"]