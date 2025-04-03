# Use Maven image to build the project
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy project files
COPY . .

# Build the project using Maven (without running tests)
RUN mvn clean package -DskipTests

# Debugging: List files after build (optional)
RUN ls -l /app/target

# Use a minimal Java runtime image for running the application
FROM eclipse-temurin:17-jre

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar


# Expose the application port
EXPOSE 8070

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
