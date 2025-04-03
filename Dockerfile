# Use Maven as both build and runtime image
FROM maven:3.8.6-eclipse-temurin-17 AS build
EXPOSE 8070

# Set the working directory inside the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the project using Maven (without running tests)
RUN mvn clean compile

# Use the same Maven image for the runtime stage
FROM maven:3.8.6-eclipse-temurin-17  # ✅ Keep Maven in the final image

# Set the working directory inside the container
WORKDIR /app

# Copy the built project from the build stage
COPY --from=build /app .  

# Run Cucumber tests when the container starts
ENTRYPOINT ["mvn", "test"]
