# Use a specific Maven image to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src /app/src

# Package the application
RUN mvn package -DskipTests

# Use a specific OpenJDK image to run the application
FROM eclipse-temurin:17.0.10_7-jre-jammy

# Set the working directory
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8040

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]