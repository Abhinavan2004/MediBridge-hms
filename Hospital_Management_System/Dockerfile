# 1️⃣ Base image with Java and Tomcat
FROM tomcat:10.1-jdk17

# 2️⃣ Remove default ROOT app
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# 3️⃣ Copy WAR file
COPY target/Hospital_Management_System.war /usr/local/tomcat/webapps/ROOT.war

# 4️⃣ Expose Tomcat's actual port
EXPOSE 8080

# 5️⃣ Start Tomcat
CMD ["catalina.sh", "run"]
