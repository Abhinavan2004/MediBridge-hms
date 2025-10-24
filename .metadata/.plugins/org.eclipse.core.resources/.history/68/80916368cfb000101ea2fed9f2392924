# 1️⃣ Base image with Java and Tomcat
FROM tomcat:10.1-jdk17

# 2️⃣ Remove the default ROOT app
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# 3️⃣ Copy your WAR into Tomcat webapps
COPY target/hospital_management_system.war /usr/local/tomcat/webapps/ROOT.war

# 4️⃣ Expose port 8080 (Tomcat default)
EXPOSE 8089

# 5️⃣ Start Tomcat
CMD ["catalina.sh", "run"]
