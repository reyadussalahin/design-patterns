# How to contribute

### Project Structure
All design patterns are implemented in java and follows java conventions or best practices. `Gradle` has been used as a build tool and `Junit` has been used for unit testing. Each design pattern is considered as an independent subproject of `Gradle` build system. Below the project structure is given:
```
- <project-root>
 - <design-pattern-name>(gradle subproject)
  - src
   - main
    - java
     - com
      - reyadussalahin
       - <design-pattern-package-based-name>(note: it could expand into multiple dirs)
        - App.java(the driver class)
        - <design-pattern-related-classes>
   - test
    - java
     - com
      - reyadussalahin
       - <design-pattern-package-based-name>
        - AppTest.java
        - <design-pattern-related-test-classes>
```

### Design Pattern Directory and Package Based Naming conventions
Each design pattern must be named in lowercase letters. If a design pattern name is constructed of more than one word, then those words must be seperated by `-` and the package name would be seperated by `.` and expand into as many directories as necessary. An example could be `abstract-factory`, it's path would be: `<project-root>/abstractory-factory/src/main/java/com/reyadussalahin/abstract/factory/` and package name would be: `package com.reyadussalahin.abstract.factory`.

### Other kinds of resources
Store graphics and other kind of resources inside `<design-pattern-name>/etc/` directory.

### How to add a new Design Pattern that's not covered yet
1. Create directory for that design pattern.
2. Create necessary directory structure `<project-root>/<design-pattern-name>/src/main/java/com/reyadussalahin/<design-pattern-package-based-name>/` for design pattern related classes and `<project-root>/<design-pattern-name>/src/test/java/com/reyadussalahin/<design-pattern-package-based-name>/` for unit test related classes.
3. add `include <design-pattern-name>` to `settings.gradle` file.
4. create `build.gradle` file in the `<design-pattern-name>` directory i.e. `<design-pattern-name>/buid.gradle` and write the following:
```groovy
plugins {
    id 'design-patterns.java-common-conventions'
}

application {
    mainClass = 'com.reyadussalahin.<design-pattern-package-based-name>.App'
}
```
5. Now add design pattern related classes and use `App.java` to try them out, you may also want to write `unit tests`.

### Log and Printing in console
To log things use `@Slf4j`. Don't print to console, just log. The easy way to log:
```java
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Logging an info");
    }
}
```
Import `Lombok` to log easily, notice the `@Slf4j` annotation before class declaration. It's very very important. Use `log.info()` to log.

### How to run and do unit tests
1. Run the project as follows:
```bash
$ ./gradlew run
```
2. And to run unit tests:
```bash
$ ./gradlew test
```

### Gitignore
Ignore everything except the followings:
1. `buildSrc/` dir
2. `settings.gradle` file
3. unders the design-pattern directory `src/main` and `src/test`
  
Note: if unnecessary files are added contribution may not be added to repo.

### Example
Checkout the [strategy pattern](strategy/) example for file structures and package naming if you've problem understanding anything. It'll be crystal clear to you.

### IDE Support
This project is integratable to all kinds of IDE. Use you preferred environment to as your convenience.
