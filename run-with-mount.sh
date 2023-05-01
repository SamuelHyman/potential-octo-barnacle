# Description: Run the application with a mounted secrets directory
# Modify your JVM arguments to include -Dspring.config.additional-location=/c/Users/samuel/projects/demo2/mount/etc/secrets/
# Update your secret value, make it configuration text such as the following:
# spring.datasource.url=jdbc:mysql://localhost:3306/demo2?useSSL=false
# spring.datasource.username=secret
# spring.datasource.password=secret
mvn spring-boot:run -Dspring.config.additional-location=/c/Users/samuel/projects/demo2/mount/etc/secrets/

