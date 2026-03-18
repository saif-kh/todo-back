# Use a slim Java image
FROM openjdk:17-jdk-slim
# Set working directory
WORKDIR /app
# Copy the built JAR (ensure your build tool places it here)
COPY target/*.jar app.jar
# Expose the port your app runs on
EXPOSE 8080
# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]