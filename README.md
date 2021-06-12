## Overview

### Project

- java: 11
- build: gradle
- dependencies: web, jpa, h2, lombok, thymeleaf, configuration-processor

### Dependencies

```shell
> ./gradlew dependencies
```

<details><summary>CLICK ME</summary>
<p>

```shell
Starting a Gradle Daemon, 3 incompatible and 2 stopped Daemons could not be reused, use --status for details

> Task :dependencies

------------------------------------------------------------
Root project 'shop'
------------------------------------------------------------

annotationProcessor - Annotation processors and their dependencies for source set 'main'.
+--- org.springframework.boot:spring-boot-configuration-processor -> 2.5.1
\--- org.projectlombok:lombok -> 1.18.20

apiElements - API elements for main. (n)
No dependencies

archives - Configuration for archive artifacts. (n)
No dependencies

bootArchives - Configuration for Spring Boot archive artifacts. (n)
No dependencies

compileClasspath - Compile classpath for source set 'main'.
+--- org.springframework.boot:spring-boot-configuration-processor -> 2.5.1
+--- org.projectlombok:lombok -> 1.18.20
+--- org.springframework.boot:spring-boot-starter-data-jpa -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter-aop:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1
|    |    |    +--- org.springframework.boot:spring-boot:2.5.1
|    |    |    |    +--- org.springframework:spring-core:5.3.8
|    |    |    |    |    \--- org.springframework:spring-jcl:5.3.8
|    |    |    |    \--- org.springframework:spring-context:5.3.8
|    |    |    |         +--- org.springframework:spring-aop:5.3.8
|    |    |    |         |    +--- org.springframework:spring-beans:5.3.8
|    |    |    |         |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         \--- org.springframework:spring-expression:5.3.8
|    |    |    |              \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework.boot:spring-boot-autoconfigure:2.5.1
|    |    |    |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
|    |    |    +--- org.springframework.boot:spring-boot-starter-logging:2.5.1
|    |    |    |    +--- ch.qos.logback:logback-classic:1.2.3
|    |    |    |    |    +--- ch.qos.logback:logback-core:1.2.3
|    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.14.1
|    |    |    |    |    +--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    |    \--- org.apache.logging.log4j:log4j-api:2.14.1
|    |    |    |    \--- org.slf4j:jul-to-slf4j:1.7.30
|    |    |    |         \--- org.slf4j:slf4j-api:1.7.30
|    |    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    \--- org.yaml:snakeyaml:1.28
|    |    +--- org.springframework:spring-aop:5.3.8 (*)
|    |    \--- org.aspectj:aspectjweaver:1.9.6
|    +--- org.springframework.boot:spring-boot-starter-jdbc:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- com.zaxxer:HikariCP:4.0.3
|    |    |    \--- org.slf4j:slf4j-api:1.7.30
|    |    \--- org.springframework:spring-jdbc:5.3.8
|    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |         \--- org.springframework:spring-tx:5.3.8
|    |              +--- org.springframework:spring-beans:5.3.8 (*)
|    |              \--- org.springframework:spring-core:5.3.8 (*)
|    +--- jakarta.transaction:jakarta.transaction-api:1.3.3
|    +--- jakarta.persistence:jakarta.persistence-api:2.2.3
|    +--- org.hibernate:hibernate-core:5.4.32.Final
|    |    +--- org.jboss.logging:jboss-logging:3.4.1.Final -> 3.4.2.Final
|    |    +--- org.javassist:javassist:3.27.0-GA
|    |    +--- net.bytebuddy:byte-buddy:1.10.22
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.2.3.Final
|    |    +--- com.fasterxml:classmate:1.5.1
|    |    +--- org.dom4j:dom4j:2.1.3
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.1.2.Final
|    |    |    \--- org.jboss.logging:jboss-logging:3.3.2.Final -> 3.4.2.Final
|    |    \--- org.glassfish.jaxb:jaxb-runtime:2.3.1 -> 2.3.4
|    |         +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3
|    |         +--- org.glassfish.jaxb:txw2:2.3.4
|    |         \--- com.sun.istack:istack-commons-runtime:3.0.12
|    +--- org.springframework.data:spring-data-jpa:2.5.1
|    |    +--- org.springframework.data:spring-data-commons:2.5.1
|    |    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    |    +--- org.springframework:spring-orm:5.3.7 -> 5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework:spring-jdbc:5.3.8 (*)
|    |    |    \--- org.springframework:spring-tx:5.3.8 (*)
|    |    +--- org.springframework:spring-context:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-aop:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-tx:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    \--- org.springframework:spring-aspects:5.3.8
|         \--- org.aspectj:aspectjweaver:1.9.6
+--- org.springframework.boot:spring-boot-starter-thymeleaf -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.thymeleaf:thymeleaf-spring5:3.0.12.RELEASE
|    |    +--- org.thymeleaf:thymeleaf:3.0.12.RELEASE
|    |    |    +--- org.attoparser:attoparser:2.0.5.RELEASE
|    |    |    +--- org.unbescape:unbescape:1.1.6.RELEASE
|    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    \--- org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE
|         +--- org.thymeleaf:thymeleaf:3.0.11.RELEASE -> 3.0.12.RELEASE (*)
|         \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
\--- org.springframework.boot:spring-boot-starter-web -> 2.5.1
     +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
     +--- org.springframework.boot:spring-boot-starter-json:2.5.1
     |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
     |    +--- org.springframework:spring-web:5.3.8
     |    |    +--- org.springframework:spring-beans:5.3.8 (*)
     |    |    \--- org.springframework:spring-core:5.3.8 (*)
     |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3
     |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3
     |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3
     |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (c)
     |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (c)
     |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (c)
     |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3 (c)
     |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3 (c)
     |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3 (c)
     |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3
     |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
     |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
     |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3
     |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
     |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
     |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
     |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3
     |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (*)
     |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
     |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
     |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
     |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3
     |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
     |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
     |         \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
     +--- org.springframework.boot:spring-boot-starter-tomcat:2.5.1
     |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
     |    +--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
     |    +--- org.apache.tomcat.embed:tomcat-embed-el:9.0.46
     |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:9.0.46
     |         \--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
     +--- org.springframework:spring-web:5.3.8 (*)
     \--- org.springframework:spring-webmvc:5.3.8
          +--- org.springframework:spring-aop:5.3.8 (*)
          +--- org.springframework:spring-beans:5.3.8 (*)
          +--- org.springframework:spring-context:5.3.8 (*)
          +--- org.springframework:spring-core:5.3.8 (*)
          +--- org.springframework:spring-expression:5.3.8 (*)
          \--- org.springframework:spring-web:5.3.8 (*)

compileOnly - Compile only dependencies for source set 'main'. (n)
\--- org.projectlombok:lombok (n)

default - Configuration for default artifacts. (n)
No dependencies

developmentOnly - Configuration for development-only dependencies such as Spring Boot's DevTools.
No dependencies

implementation - Implementation only dependencies for source set 'main'. (n)
+--- org.springframework.boot:spring-boot-starter-data-jpa (n)
+--- org.springframework.boot:spring-boot-starter-thymeleaf (n)
\--- org.springframework.boot:spring-boot-starter-web (n)

productionRuntimeClasspath
+--- org.springframework.boot:spring-boot-starter-data-jpa -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter-aop:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1
|    |    |    +--- org.springframework.boot:spring-boot:2.5.1
|    |    |    |    +--- org.springframework:spring-core:5.3.8
|    |    |    |    |    \--- org.springframework:spring-jcl:5.3.8
|    |    |    |    \--- org.springframework:spring-context:5.3.8
|    |    |    |         +--- org.springframework:spring-aop:5.3.8
|    |    |    |         |    +--- org.springframework:spring-beans:5.3.8
|    |    |    |         |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         \--- org.springframework:spring-expression:5.3.8
|    |    |    |              \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework.boot:spring-boot-autoconfigure:2.5.1
|    |    |    |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
|    |    |    +--- org.springframework.boot:spring-boot-starter-logging:2.5.1
|    |    |    |    +--- ch.qos.logback:logback-classic:1.2.3
|    |    |    |    |    +--- ch.qos.logback:logback-core:1.2.3
|    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.14.1
|    |    |    |    |    +--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    |    \--- org.apache.logging.log4j:log4j-api:2.14.1
|    |    |    |    \--- org.slf4j:jul-to-slf4j:1.7.30
|    |    |    |         \--- org.slf4j:slf4j-api:1.7.30
|    |    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    \--- org.yaml:snakeyaml:1.28
|    |    +--- org.springframework:spring-aop:5.3.8 (*)
|    |    \--- org.aspectj:aspectjweaver:1.9.6
|    +--- org.springframework.boot:spring-boot-starter-jdbc:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- com.zaxxer:HikariCP:4.0.3
|    |    |    \--- org.slf4j:slf4j-api:1.7.30
|    |    \--- org.springframework:spring-jdbc:5.3.8
|    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |         \--- org.springframework:spring-tx:5.3.8
|    |              +--- org.springframework:spring-beans:5.3.8 (*)
|    |              \--- org.springframework:spring-core:5.3.8 (*)
|    +--- jakarta.transaction:jakarta.transaction-api:1.3.3
|    +--- jakarta.persistence:jakarta.persistence-api:2.2.3
|    +--- org.hibernate:hibernate-core:5.4.32.Final
|    |    +--- org.jboss.logging:jboss-logging:3.4.1.Final -> 3.4.2.Final
|    |    +--- org.javassist:javassist:3.27.0-GA
|    |    +--- net.bytebuddy:byte-buddy:1.10.22
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.2.3.Final
|    |    +--- com.fasterxml:classmate:1.5.1
|    |    +--- org.dom4j:dom4j:2.1.3
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.1.2.Final
|    |    |    \--- org.jboss.logging:jboss-logging:3.3.2.Final -> 3.4.2.Final
|    |    \--- org.glassfish.jaxb:jaxb-runtime:2.3.1 -> 2.3.4
|    |         +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3
|    |         +--- org.glassfish.jaxb:txw2:2.3.4
|    |         +--- com.sun.istack:istack-commons-runtime:3.0.12
|    |         \--- com.sun.activation:jakarta.activation:1.2.2
|    +--- org.springframework.data:spring-data-jpa:2.5.1
|    |    +--- org.springframework.data:spring-data-commons:2.5.1
|    |    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    |    +--- org.springframework:spring-orm:5.3.7 -> 5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework:spring-jdbc:5.3.8 (*)
|    |    |    \--- org.springframework:spring-tx:5.3.8 (*)
|    |    +--- org.springframework:spring-context:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-aop:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-tx:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    \--- org.springframework:spring-aspects:5.3.8
|         \--- org.aspectj:aspectjweaver:1.9.6
+--- org.springframework.boot:spring-boot-starter-thymeleaf -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.thymeleaf:thymeleaf-spring5:3.0.12.RELEASE
|    |    +--- org.thymeleaf:thymeleaf:3.0.12.RELEASE
|    |    |    +--- org.attoparser:attoparser:2.0.5.RELEASE
|    |    |    +--- org.unbescape:unbescape:1.1.6.RELEASE
|    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    \--- org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE
|         +--- org.thymeleaf:thymeleaf:3.0.11.RELEASE -> 3.0.12.RELEASE (*)
|         \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
+--- org.springframework.boot:spring-boot-starter-web -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- org.springframework:spring-web:5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:2.5.1
|    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:9.0.46
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:9.0.46
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    +--- org.springframework:spring-web:5.3.8 (*)
|    \--- org.springframework:spring-webmvc:5.3.8
|         +--- org.springframework:spring-aop:5.3.8 (*)
|         +--- org.springframework:spring-beans:5.3.8 (*)
|         +--- org.springframework:spring-context:5.3.8 (*)
|         +--- org.springframework:spring-core:5.3.8 (*)
|         +--- org.springframework:spring-expression:5.3.8 (*)
|         \--- org.springframework:spring-web:5.3.8 (*)
\--- com.h2database:h2 -> 1.4.200

runtimeClasspath - Runtime classpath of source set 'main'.
+--- org.springframework.boot:spring-boot-starter-data-jpa -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter-aop:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1
|    |    |    +--- org.springframework.boot:spring-boot:2.5.1
|    |    |    |    +--- org.springframework:spring-core:5.3.8
|    |    |    |    |    \--- org.springframework:spring-jcl:5.3.8
|    |    |    |    \--- org.springframework:spring-context:5.3.8
|    |    |    |         +--- org.springframework:spring-aop:5.3.8
|    |    |    |         |    +--- org.springframework:spring-beans:5.3.8
|    |    |    |         |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         \--- org.springframework:spring-expression:5.3.8
|    |    |    |              \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework.boot:spring-boot-autoconfigure:2.5.1
|    |    |    |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
|    |    |    +--- org.springframework.boot:spring-boot-starter-logging:2.5.1
|    |    |    |    +--- ch.qos.logback:logback-classic:1.2.3
|    |    |    |    |    +--- ch.qos.logback:logback-core:1.2.3
|    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.14.1
|    |    |    |    |    +--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    |    \--- org.apache.logging.log4j:log4j-api:2.14.1
|    |    |    |    \--- org.slf4j:jul-to-slf4j:1.7.30
|    |    |    |         \--- org.slf4j:slf4j-api:1.7.30
|    |    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    \--- org.yaml:snakeyaml:1.28
|    |    +--- org.springframework:spring-aop:5.3.8 (*)
|    |    \--- org.aspectj:aspectjweaver:1.9.6
|    +--- org.springframework.boot:spring-boot-starter-jdbc:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- com.zaxxer:HikariCP:4.0.3
|    |    |    \--- org.slf4j:slf4j-api:1.7.30
|    |    \--- org.springframework:spring-jdbc:5.3.8
|    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |         \--- org.springframework:spring-tx:5.3.8
|    |              +--- org.springframework:spring-beans:5.3.8 (*)
|    |              \--- org.springframework:spring-core:5.3.8 (*)
|    +--- jakarta.transaction:jakarta.transaction-api:1.3.3
|    +--- jakarta.persistence:jakarta.persistence-api:2.2.3
|    +--- org.hibernate:hibernate-core:5.4.32.Final
|    |    +--- org.jboss.logging:jboss-logging:3.4.1.Final -> 3.4.2.Final
|    |    +--- org.javassist:javassist:3.27.0-GA
|    |    +--- net.bytebuddy:byte-buddy:1.10.22
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.2.3.Final
|    |    +--- com.fasterxml:classmate:1.5.1
|    |    +--- org.dom4j:dom4j:2.1.3
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.1.2.Final
|    |    |    \--- org.jboss.logging:jboss-logging:3.3.2.Final -> 3.4.2.Final
|    |    \--- org.glassfish.jaxb:jaxb-runtime:2.3.1 -> 2.3.4
|    |         +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3
|    |         +--- org.glassfish.jaxb:txw2:2.3.4
|    |         +--- com.sun.istack:istack-commons-runtime:3.0.12
|    |         \--- com.sun.activation:jakarta.activation:1.2.2
|    +--- org.springframework.data:spring-data-jpa:2.5.1
|    |    +--- org.springframework.data:spring-data-commons:2.5.1
|    |    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    |    +--- org.springframework:spring-orm:5.3.7 -> 5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework:spring-jdbc:5.3.8 (*)
|    |    |    \--- org.springframework:spring-tx:5.3.8 (*)
|    |    +--- org.springframework:spring-context:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-aop:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-tx:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    \--- org.springframework:spring-aspects:5.3.8
|         \--- org.aspectj:aspectjweaver:1.9.6
+--- org.springframework.boot:spring-boot-starter-thymeleaf -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.thymeleaf:thymeleaf-spring5:3.0.12.RELEASE
|    |    +--- org.thymeleaf:thymeleaf:3.0.12.RELEASE
|    |    |    +--- org.attoparser:attoparser:2.0.5.RELEASE
|    |    |    +--- org.unbescape:unbescape:1.1.6.RELEASE
|    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    \--- org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE
|         +--- org.thymeleaf:thymeleaf:3.0.11.RELEASE -> 3.0.12.RELEASE (*)
|         \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
+--- org.springframework.boot:spring-boot-starter-web -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- org.springframework:spring-web:5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:2.5.1
|    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:9.0.46
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:9.0.46
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    +--- org.springframework:spring-web:5.3.8 (*)
|    \--- org.springframework:spring-webmvc:5.3.8
|         +--- org.springframework:spring-aop:5.3.8 (*)
|         +--- org.springframework:spring-beans:5.3.8 (*)
|         +--- org.springframework:spring-context:5.3.8 (*)
|         +--- org.springframework:spring-core:5.3.8 (*)
|         +--- org.springframework:spring-expression:5.3.8 (*)
|         \--- org.springframework:spring-web:5.3.8 (*)
\--- com.h2database:h2 -> 1.4.200

runtimeElements - Elements of runtime for main. (n)
No dependencies

runtimeOnly - Runtime only dependencies for source set 'main'. (n)
\--- com.h2database:h2 (n)

testAnnotationProcessor - Annotation processors and their dependencies for source set 'test'.
No dependencies

testCompileClasspath - Compile classpath for source set 'test'.
+--- org.springframework.boot:spring-boot-starter-data-jpa -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter-aop:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1
|    |    |    +--- org.springframework.boot:spring-boot:2.5.1
|    |    |    |    +--- org.springframework:spring-core:5.3.8
|    |    |    |    |    \--- org.springframework:spring-jcl:5.3.8
|    |    |    |    \--- org.springframework:spring-context:5.3.8
|    |    |    |         +--- org.springframework:spring-aop:5.3.8
|    |    |    |         |    +--- org.springframework:spring-beans:5.3.8
|    |    |    |         |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         \--- org.springframework:spring-expression:5.3.8
|    |    |    |              \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework.boot:spring-boot-autoconfigure:2.5.1
|    |    |    |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
|    |    |    +--- org.springframework.boot:spring-boot-starter-logging:2.5.1
|    |    |    |    +--- ch.qos.logback:logback-classic:1.2.3
|    |    |    |    |    +--- ch.qos.logback:logback-core:1.2.3
|    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.14.1
|    |    |    |    |    +--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    |    \--- org.apache.logging.log4j:log4j-api:2.14.1
|    |    |    |    \--- org.slf4j:jul-to-slf4j:1.7.30
|    |    |    |         \--- org.slf4j:slf4j-api:1.7.30
|    |    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    \--- org.yaml:snakeyaml:1.28
|    |    +--- org.springframework:spring-aop:5.3.8 (*)
|    |    \--- org.aspectj:aspectjweaver:1.9.6
|    +--- org.springframework.boot:spring-boot-starter-jdbc:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- com.zaxxer:HikariCP:4.0.3
|    |    |    \--- org.slf4j:slf4j-api:1.7.30
|    |    \--- org.springframework:spring-jdbc:5.3.8
|    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |         \--- org.springframework:spring-tx:5.3.8
|    |              +--- org.springframework:spring-beans:5.3.8 (*)
|    |              \--- org.springframework:spring-core:5.3.8 (*)
|    +--- jakarta.transaction:jakarta.transaction-api:1.3.3
|    +--- jakarta.persistence:jakarta.persistence-api:2.2.3
|    +--- org.hibernate:hibernate-core:5.4.32.Final
|    |    +--- org.jboss.logging:jboss-logging:3.4.1.Final -> 3.4.2.Final
|    |    +--- org.javassist:javassist:3.27.0-GA
|    |    +--- net.bytebuddy:byte-buddy:1.10.22
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.2.3.Final
|    |    +--- com.fasterxml:classmate:1.5.1
|    |    +--- org.dom4j:dom4j:2.1.3
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.1.2.Final
|    |    |    \--- org.jboss.logging:jboss-logging:3.3.2.Final -> 3.4.2.Final
|    |    \--- org.glassfish.jaxb:jaxb-runtime:2.3.1 -> 2.3.4
|    |         +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3
|    |         |    \--- jakarta.activation:jakarta.activation-api:1.2.2
|    |         +--- org.glassfish.jaxb:txw2:2.3.4
|    |         \--- com.sun.istack:istack-commons-runtime:3.0.12
|    +--- org.springframework.data:spring-data-jpa:2.5.1
|    |    +--- org.springframework.data:spring-data-commons:2.5.1
|    |    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    |    +--- org.springframework:spring-orm:5.3.7 -> 5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework:spring-jdbc:5.3.8 (*)
|    |    |    \--- org.springframework:spring-tx:5.3.8 (*)
|    |    +--- org.springframework:spring-context:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-aop:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-tx:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    \--- org.springframework:spring-aspects:5.3.8
|         \--- org.aspectj:aspectjweaver:1.9.6
+--- org.springframework.boot:spring-boot-starter-thymeleaf -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.thymeleaf:thymeleaf-spring5:3.0.12.RELEASE
|    |    +--- org.thymeleaf:thymeleaf:3.0.12.RELEASE
|    |    |    +--- org.attoparser:attoparser:2.0.5.RELEASE
|    |    |    +--- org.unbescape:unbescape:1.1.6.RELEASE
|    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    \--- org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE
|         +--- org.thymeleaf:thymeleaf:3.0.11.RELEASE -> 3.0.12.RELEASE (*)
|         \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
+--- org.springframework.boot:spring-boot-starter-web -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- org.springframework:spring-web:5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:2.5.1
|    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:9.0.46
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:9.0.46
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    +--- org.springframework:spring-web:5.3.8 (*)
|    \--- org.springframework:spring-webmvc:5.3.8
|         +--- org.springframework:spring-aop:5.3.8 (*)
|         +--- org.springframework:spring-beans:5.3.8 (*)
|         +--- org.springframework:spring-context:5.3.8 (*)
|         +--- org.springframework:spring-core:5.3.8 (*)
|         +--- org.springframework:spring-expression:5.3.8 (*)
|         \--- org.springframework:spring-web:5.3.8 (*)
\--- org.springframework.boot:spring-boot-starter-test -> 2.5.1
     +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
     +--- org.springframework.boot:spring-boot-test:2.5.1
     |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
     +--- org.springframework.boot:spring-boot-test-autoconfigure:2.5.1
     |    +--- org.springframework.boot:spring-boot:2.5.1 (*)
     |    +--- org.springframework.boot:spring-boot-test:2.5.1 (*)
     |    \--- org.springframework.boot:spring-boot-autoconfigure:2.5.1 (*)
     +--- com.jayway.jsonpath:json-path:2.5.0
     |    +--- net.minidev:json-smart:2.3 -> 2.4.7
     |    |    \--- net.minidev:accessors-smart:2.4.7
     |    |         \--- org.ow2.asm:asm:9.1
     |    \--- org.slf4j:slf4j-api:1.7.30
     +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3 (*)
     +--- org.assertj:assertj-core:3.19.0
     +--- org.hamcrest:hamcrest:2.2
     +--- org.junit.jupiter:junit-jupiter:5.7.2
     |    +--- org.junit:junit-bom:5.7.2
     |    |    +--- org.junit.jupiter:junit-jupiter:5.7.2 (c)
     |    |    +--- org.junit.jupiter:junit-jupiter-api:5.7.2 (c)
     |    |    +--- org.junit.jupiter:junit-jupiter-params:5.7.2 (c)
     |    |    \--- org.junit.platform:junit-platform-commons:1.7.2 (c)
     |    +--- org.junit.jupiter:junit-jupiter-api:5.7.2
     |    |    +--- org.junit:junit-bom:5.7.2 (*)
     |    |    +--- org.apiguardian:apiguardian-api:1.1.0
     |    |    +--- org.opentest4j:opentest4j:1.2.0
     |    |    \--- org.junit.platform:junit-platform-commons:1.7.2
     |    |         +--- org.junit:junit-bom:5.7.2 (*)
     |    |         \--- org.apiguardian:apiguardian-api:1.1.0
     |    \--- org.junit.jupiter:junit-jupiter-params:5.7.2
     |         +--- org.junit:junit-bom:5.7.2 (*)
     |         +--- org.apiguardian:apiguardian-api:1.1.0
     |         \--- org.junit.jupiter:junit-jupiter-api:5.7.2 (*)
     +--- org.mockito:mockito-core:3.9.0
     |    +--- net.bytebuddy:byte-buddy:1.10.20 -> 1.10.22
     |    +--- net.bytebuddy:byte-buddy-agent:1.10.20 -> 1.10.22
     |    \--- org.objenesis:objenesis:3.2
     +--- org.mockito:mockito-junit-jupiter:3.9.0
     |    \--- org.mockito:mockito-core:3.9.0 (*)
     +--- org.skyscreamer:jsonassert:1.5.0
     |    \--- com.vaadin.external.google:android-json:0.0.20131108.vaadin1
     +--- org.springframework:spring-core:5.3.8 (*)
     +--- org.springframework:spring-test:5.3.8
     |    \--- org.springframework:spring-core:5.3.8 (*)
     \--- org.xmlunit:xmlunit-core:2.8.2

testCompileOnly - Compile only dependencies for source set 'test'. (n)
No dependencies

testImplementation - Implementation only dependencies for source set 'test'. (n)
\--- org.springframework.boot:spring-boot-starter-test (n)

testRuntimeClasspath - Runtime classpath of source set 'test'.
+--- org.springframework.boot:spring-boot-starter-data-jpa -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter-aop:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1
|    |    |    +--- org.springframework.boot:spring-boot:2.5.1
|    |    |    |    +--- org.springframework:spring-core:5.3.8
|    |    |    |    |    \--- org.springframework:spring-jcl:5.3.8
|    |    |    |    \--- org.springframework:spring-context:5.3.8
|    |    |    |         +--- org.springframework:spring-aop:5.3.8
|    |    |    |         |    +--- org.springframework:spring-beans:5.3.8
|    |    |    |         |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    |         \--- org.springframework:spring-expression:5.3.8
|    |    |    |              \--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework.boot:spring-boot-autoconfigure:2.5.1
|    |    |    |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
|    |    |    +--- org.springframework.boot:spring-boot-starter-logging:2.5.1
|    |    |    |    +--- ch.qos.logback:logback-classic:1.2.3
|    |    |    |    |    +--- ch.qos.logback:logback-core:1.2.3
|    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.14.1
|    |    |    |    |    +--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    |    |    |    \--- org.apache.logging.log4j:log4j-api:2.14.1
|    |    |    |    \--- org.slf4j:jul-to-slf4j:1.7.30
|    |    |    |         \--- org.slf4j:slf4j-api:1.7.30
|    |    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    \--- org.yaml:snakeyaml:1.28
|    |    +--- org.springframework:spring-aop:5.3.8 (*)
|    |    \--- org.aspectj:aspectjweaver:1.9.6
|    +--- org.springframework.boot:spring-boot-starter-jdbc:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- com.zaxxer:HikariCP:4.0.3
|    |    |    \--- org.slf4j:slf4j-api:1.7.30
|    |    \--- org.springframework:spring-jdbc:5.3.8
|    |         +--- org.springframework:spring-beans:5.3.8 (*)
|    |         +--- org.springframework:spring-core:5.3.8 (*)
|    |         \--- org.springframework:spring-tx:5.3.8
|    |              +--- org.springframework:spring-beans:5.3.8 (*)
|    |              \--- org.springframework:spring-core:5.3.8 (*)
|    +--- jakarta.transaction:jakarta.transaction-api:1.3.3
|    +--- jakarta.persistence:jakarta.persistence-api:2.2.3
|    +--- org.hibernate:hibernate-core:5.4.32.Final
|    |    +--- org.jboss.logging:jboss-logging:3.4.1.Final -> 3.4.2.Final
|    |    +--- org.javassist:javassist:3.27.0-GA
|    |    +--- net.bytebuddy:byte-buddy:1.10.22
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.2.3.Final
|    |    +--- com.fasterxml:classmate:1.5.1
|    |    +--- org.dom4j:dom4j:2.1.3
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.1.2.Final
|    |    |    \--- org.jboss.logging:jboss-logging:3.3.2.Final -> 3.4.2.Final
|    |    \--- org.glassfish.jaxb:jaxb-runtime:2.3.1 -> 2.3.4
|    |         +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3
|    |         |    \--- jakarta.activation:jakarta.activation-api:1.2.2
|    |         +--- org.glassfish.jaxb:txw2:2.3.4
|    |         +--- com.sun.istack:istack-commons-runtime:3.0.12
|    |         \--- com.sun.activation:jakarta.activation:1.2.2
|    +--- org.springframework.data:spring-data-jpa:2.5.1
|    |    +--- org.springframework.data:spring-data-commons:2.5.1
|    |    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    |    +--- org.springframework:spring-orm:5.3.7 -> 5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    +--- org.springframework:spring-core:5.3.8 (*)
|    |    |    +--- org.springframework:spring-jdbc:5.3.8 (*)
|    |    |    \--- org.springframework:spring-tx:5.3.8 (*)
|    |    +--- org.springframework:spring-context:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-aop:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-tx:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-beans:5.3.7 -> 5.3.8 (*)
|    |    +--- org.springframework:spring-core:5.3.7 -> 5.3.8 (*)
|    |    \--- org.slf4j:slf4j-api:1.7.26 -> 1.7.30
|    \--- org.springframework:spring-aspects:5.3.8
|         \--- org.aspectj:aspectjweaver:1.9.6
+--- org.springframework.boot:spring-boot-starter-thymeleaf -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.thymeleaf:thymeleaf-spring5:3.0.12.RELEASE
|    |    +--- org.thymeleaf:thymeleaf:3.0.12.RELEASE
|    |    |    +--- org.attoparser:attoparser:2.0.5.RELEASE
|    |    |    +--- org.unbescape:unbescape:1.1.6.RELEASE
|    |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
|    \--- org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE
|         +--- org.thymeleaf:thymeleaf:3.0.11.RELEASE -> 3.0.12.RELEASE (*)
|         \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.30
+--- org.springframework.boot:spring-boot-starter-web -> 2.5.1
|    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:2.5.1
|    |    +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
|    |    +--- org.springframework:spring-web:5.3.8
|    |    |    +--- org.springframework:spring-beans:5.3.8 (*)
|    |    |    \--- org.springframework:spring-core:5.3.8 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.12.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.12.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.12.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.12.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:2.5.1
|    |    +--- jakarta.annotation:jakarta.annotation-api:1.3.5
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:9.0.46
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:9.0.46
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:9.0.46
|    +--- org.springframework:spring-web:5.3.8 (*)
|    \--- org.springframework:spring-webmvc:5.3.8
|         +--- org.springframework:spring-aop:5.3.8 (*)
|         +--- org.springframework:spring-beans:5.3.8 (*)
|         +--- org.springframework:spring-context:5.3.8 (*)
|         +--- org.springframework:spring-core:5.3.8 (*)
|         +--- org.springframework:spring-expression:5.3.8 (*)
|         \--- org.springframework:spring-web:5.3.8 (*)
+--- com.h2database:h2 -> 1.4.200
\--- org.springframework.boot:spring-boot-starter-test -> 2.5.1
     +--- org.springframework.boot:spring-boot-starter:2.5.1 (*)
     +--- org.springframework.boot:spring-boot-test:2.5.1
     |    \--- org.springframework.boot:spring-boot:2.5.1 (*)
     +--- org.springframework.boot:spring-boot-test-autoconfigure:2.5.1
     |    +--- org.springframework.boot:spring-boot:2.5.1 (*)
     |    +--- org.springframework.boot:spring-boot-test:2.5.1 (*)
     |    \--- org.springframework.boot:spring-boot-autoconfigure:2.5.1 (*)
     +--- com.jayway.jsonpath:json-path:2.5.0
     |    +--- net.minidev:json-smart:2.3 -> 2.4.7
     |    |    \--- net.minidev:accessors-smart:2.4.7
     |    |         \--- org.ow2.asm:asm:9.1
     |    \--- org.slf4j:slf4j-api:1.7.30
     +--- jakarta.xml.bind:jakarta.xml.bind-api:2.3.3 (*)
     +--- org.assertj:assertj-core:3.19.0
     +--- org.hamcrest:hamcrest:2.2
     +--- org.junit.jupiter:junit-jupiter:5.7.2
     |    +--- org.junit:junit-bom:5.7.2
     |    |    +--- org.junit.jupiter:junit-jupiter:5.7.2 (c)
     |    |    +--- org.junit.jupiter:junit-jupiter-api:5.7.2 (c)
     |    |    +--- org.junit.jupiter:junit-jupiter-engine:5.7.2 (c)
     |    |    +--- org.junit.jupiter:junit-jupiter-params:5.7.2 (c)
     |    |    +--- org.junit.platform:junit-platform-commons:1.7.2 (c)
     |    |    \--- org.junit.platform:junit-platform-engine:1.7.2 (c)
     |    +--- org.junit.jupiter:junit-jupiter-api:5.7.2
     |    |    +--- org.junit:junit-bom:5.7.2 (*)
     |    |    +--- org.apiguardian:apiguardian-api:1.1.0
     |    |    +--- org.opentest4j:opentest4j:1.2.0
     |    |    \--- org.junit.platform:junit-platform-commons:1.7.2
     |    |         +--- org.junit:junit-bom:5.7.2 (*)
     |    |         \--- org.apiguardian:apiguardian-api:1.1.0
     |    +--- org.junit.jupiter:junit-jupiter-params:5.7.2
     |    |    +--- org.junit:junit-bom:5.7.2 (*)
     |    |    +--- org.apiguardian:apiguardian-api:1.1.0
     |    |    \--- org.junit.jupiter:junit-jupiter-api:5.7.2 (*)
     |    \--- org.junit.jupiter:junit-jupiter-engine:5.7.2
     |         +--- org.junit:junit-bom:5.7.2 (*)
     |         +--- org.apiguardian:apiguardian-api:1.1.0
     |         +--- org.junit.platform:junit-platform-engine:1.7.2
     |         |    +--- org.junit:junit-bom:5.7.2 (*)
     |         |    +--- org.apiguardian:apiguardian-api:1.1.0
     |         |    +--- org.opentest4j:opentest4j:1.2.0
     |         |    \--- org.junit.platform:junit-platform-commons:1.7.2 (*)
     |         \--- org.junit.jupiter:junit-jupiter-api:5.7.2 (*)
     +--- org.mockito:mockito-core:3.9.0
     |    +--- net.bytebuddy:byte-buddy:1.10.20 -> 1.10.22
     |    +--- net.bytebuddy:byte-buddy-agent:1.10.20 -> 1.10.22
     |    \--- org.objenesis:objenesis:3.2
     +--- org.mockito:mockito-junit-jupiter:3.9.0
     |    +--- org.mockito:mockito-core:3.9.0 (*)
     |    \--- org.junit.jupiter:junit-jupiter-api:5.7.1 -> 5.7.2 (*)
     +--- org.skyscreamer:jsonassert:1.5.0
     |    \--- com.vaadin.external.google:android-json:0.0.20131108.vaadin1
     +--- org.springframework:spring-core:5.3.8 (*)
     +--- org.springframework:spring-test:5.3.8
     |    \--- org.springframework:spring-core:5.3.8 (*)
     \--- org.xmlunit:xmlunit-core:2.8.2

testRuntimeOnly - Runtime only dependencies for source set 'test'. (n)
No dependencies

(c) - dependency constraint
(*) - dependencies omitted (listed previously)

(n) - Not resolved (configuration is not meant to be resolved)

A web-based, searchable dependency report is available by adding the --scan option.

BUILD SUCCESSFUL in 9s
1 actionable task: 1 executed

```

</p>
</details>
