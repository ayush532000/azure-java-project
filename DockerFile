# Use a base image with Java pre-installed
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the host into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "demo.jar"]
