# My Resume Blog

This is a Spring Boot application for my resume blog, using Thymeleaf for templating.

## Running Locally

To preview your blog locally, follow these steps:

### Prerequisites
- Java 17 or higher installed on your machine.
- Terminal/Command Prompt.

### Steps to Run

1. **Clone the repository** (if you haven't already):
   ```bash
   git clone <repository-url>
   cd my_resume
   ```

2. **Run using the Maven Wrapper**:
   On macOS or Linux:
   ```bash
   ./mvnw spring-boot:run
   ```
   On Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

3. **Preview in Browser**:
   Once the application starts successfully, open your browser and go to:
   [http://localhost:8080](http://localhost:8080)

### Building the Project
To build a JAR file:
```bash
./mvnw clean package
```
The JAR will be located in the `target/` directory. You can run it with:
```bash
java -jar target/my_resume-0.0.1-SNAPSHOT.jar
```

