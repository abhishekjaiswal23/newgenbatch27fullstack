# Multi-stage Dockerfile for compiling and running a plain Java project
# Build stage
FROM openjdk:17-jdk-slim AS build
WORKDIR /app

# Copy source files
COPY src /app/src

# Collect all .java files and compile into /app/out
RUN find src -name "*.java" > sources.txt && mkdir -p out && javac -d out @sources.txt

# Runtime stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/out /app/out

# Default command: run the Main class (assumes src/Main.java is the application's entrypoint)
ENTRYPOINT ["java", "-cp", "out", "Main"]

