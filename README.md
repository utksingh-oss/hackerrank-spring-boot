## Spring Boot

- Configuring a Spring MVC application using Spring Boot is straightforward due to its ability to autoconfigure
  components
- The entry point of a Spring Boot application is the class annotated with `@SpringBootApplication.`
    - `@Configuration`: Indicates the class contains Spring configuration.
    - `@EnableAutoConfiguration`: Enables Spring Boot's autoconfiguration.
    - `@ComponentScan`: Scans the base package for components

```java

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

### Dependency Injection

- Dependency Injection is a design pattern where Spring manages the dependencies (objects) of a class, allowing better
  decoupling of components.

### Inversion of Control

- IoC refers to the concept where the control of object creation and lifecycle management is handled by the Spring
  container instead of manually managing it in the code.
- How IoC Works in Spring:
    - Spring Boot automatically detects classes annotated with `@Component`,`@Service`, `@Repository`, or `@Controller`
      and creates their instances (beans).
    - These beans are stored in the **ApplicationContext**, and their dependencies are injected as needed.

### Spring Container

- The **ApplicationContext** is the Spring container that manages the lifecycle of beans, their configuration, and their
  dependencies.
- It is initialized automatically in a Spring Boot application.

### Advantages:

- **Decoupling**: Promotes loose coupling between components.
- **Scalability**: Easier to add or modify components without significant changes.
- **Maintainability**: Centralized management of dependencies.

### Spring Profiles

- In Spring Boot, you can configure an application to run in multiple environments (e.g., DEV, QA, PROD) using **Spring
  Profiles**
- Profiles allow you to define different configurations and beans that should be loaded depending on the environment in
  which the application is running.

#### Defining Profile

- You can define different properties for each environment by using profile-specific configuration files.
- These files can be named `application-{profile}.properties` or `application-{profile}.yml`, where {profile} is the
  name of your environment (e.g., dev, prod).
- **Default configuration (application.properties)**: This is the base configuration used across all environments unless
  overridden by a profile-specific configuration.
- Profile-specific configuration
    - application-dev.properties
    - application-prod.properties

#### Activate Profile

1. Using command line arguments

```shell
java -jar your-app.jar --spring.profiles.active=dev
```

2. Using application.properties

```properties
spring.profiles.active=dev
```

3. Using application.yml

```yml
spring:
  profiles:
    active: dev
```
4. Using Environment Variables
```shell
export SPRING_PROFILES_ACTIVE=dev
```

#### Multiple Profiles
- If you need to use multiple profiles at the same time, you can activate multiple profiles by separating them with a comma.
```shell
java -jar your-app.jar --spring.profiles.active=dev,prod
```

#### Profile Specific Beans

- In addition to configuration properties, you can define beans that are only loaded in specific profiles using the
  `@Profile` annotation

***

### Autoconfiguration Report
- In Spring Boot, auto-configuration is a powerful feature that helps automatically configure various components based on the dependencies available in the project. 
- Sometimes, it’s useful to view which auto-configuration classes Spring Boot has applied to your application in order to understand how different components are configured and to troubleshoot any issues.
- You can generate an auto-configuration report in Spring Boot to inspect how Spring Boot's auto-configuration mechanism is working behind the scenes.

#### Steps to generate Auto-Configure Report
- You can enable the auto-configuration report by setting the following property in the `application.properties` or `application.yml` file:
```properties
spring.autoconfigure.exclude= # Optionally exclude certain auto-configurations
spring.main.web-application-type=servlet  # or reactive
```
- Run the maven application with 
```shell
mvn spring-boot:run -Dspring-boot.run.arguments="--debug"
```
*** 
### Writing Unit Tests for the Program
- Spring Boot uses JUnit and Spring Test libraries to write unit and integration tests.
```xml
<dependencies>
  <!-- Spring Boot Test dependency -->
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
</dependencies>

```