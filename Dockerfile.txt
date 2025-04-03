# Use an official Maven image as the base image
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the project using Maven (without running tests)
RUN mvn clean compile

# Use an official Java runtime image as the runtime base image
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the project from the build stage
COPY --from=build /app /app

# Run Cucumber tests when the container starts
ENTRYPOINT ["mvn", "test"]
