# Read Me First
The following was discovered as part of building this project:

* Spring Cloud Gateway requires Spring WebFlux, your choice of Spring Web has been replaced accordingly.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/#build-image)
* [Azure Actuator](https://aka.ms/spring/docs/actuator)
* [Azure PostgreSQL support](https://aka.ms/spring/msdocs/postgresql)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/docs/3.1.5/reference/html/features.html#features.testing.testcontainers)
* [Testcontainers RabbitMQ Module Reference Guide](https://java.testcontainers.org/modules/rabbitmq/)
* [Testcontainers GCloud Module Reference Guide](https://java.testcontainers.org/modules/gcloud/)
* [Testcontainers Vault Module Reference Guide](https://java.testcontainers.org/modules/vault/)
* [Testcontainers Kafka Modules Reference Guide](https://java.testcontainers.org/modules/kafka/)
* [Testcontainers Oracle-XE Module Reference Guide](https://java.testcontainers.org/modules/databases/oraclexe/)
* [Testcontainers Postgres Module Reference Guide](https://java.testcontainers.org/modules/databases/postgres/)
* [Testcontainers MS SQL Server Module Reference Guide](https://java.testcontainers.org/modules/databases/mssqlserver/)
* [Spring Modulith](https://docs.spring.io/spring-modulith/docs/current/reference/html/)
* [Hilla](https://hilla.dev/)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.security)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.security.oauth2.client)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.liquibase)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#data.nosql.redis)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#messaging.amqp)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#messaging.kafka)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/$3.1.5/reference/htmlsingle/index.html#web.graphql)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/index.html#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#messaging.websockets)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#howto.batch)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.email)
* [Quartz Scheduler](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.quartz)
* [Timefold Solver](https://timefold.ai/docs/timefold-solver/latest/quickstart/spring-boot/spring-boot-quickstart#springBootJavaQuickStart)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator)
* [Sentry](https://docs.sentry.io/platforms/java/)
* [Datadog](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator.metrics.export.datadog)
* [Prometheus](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator.metrics.export.prometheus)
* [Dynatrace](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/index.html#actuator.metrics.export.dynatrace)
* [Testcontainers](https://java.testcontainers.org/)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/html5/)
* [Contract Verifier](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/)
* [Contract Stub Runner](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/index.html#features-stub-runner)
* [Function](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)
* [Task](https://docs.spring.io/spring-cloud-task/docs/current/reference/html/)
* [Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [Azure Key Vault](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#secret-management)
* [Spring Cloud Azure developer guide](https://aka.ms/spring/msdocs/developer-guide)
* [Azure Active Directory](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#spring-security-with-azure-active-directory)
* [Azure Storage](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#resource-handling)
* [Azure Cosmos DB](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#spring-data-support)
* [GCP Messaging](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-pubsub)
* [GCP Support](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html)
* [GCP Storage](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-storage)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#data.nosql.ldap)
* [Okta Spring Boot documentation](https://github.com/okta/okta-spring-boot#readme)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.reactive)

### Guides
The following guides illustrate how to use some features concretely:

* [Next Steps with Hilla](https://hilla.dev/docs/react/start/quick/#coming-from-spring-initializr)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Getting Started with Sentry](https://docs.sentry.io/platforms/java/guides/spring-boot/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Read Secrets from Azure Key Vault in a Spring Boot Application](https://aka.ms/spring/msdocs/keyvault)
* [Securing Spring Boot Applications with Azure Key Vault Certificates](https://aka.ms/spring/msdocs/keyvault/certificates)
* [Deploying a Spring Boot app to Azure](https://spring.io/guides/gs/spring-boot-for-azure/)
* [Securing a Java Web App with the Spring Boot Starter for Azure Active Directory](https://aka.ms/spring/msdocs/aad)
* [How to use the Spring Boot starter for Azure Storage](https://aka.ms/spring/msdocs/storage)
* [How to use Spring Boot Starter with Azure Cosmos DB SQL API](https://aka.ms/spring/msdocs/cosmos)
* [GCP Pub/Sub Sample](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-pubsub-sample)
* [GCP Samples](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples)
* [GCP Storage](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-storage-resource-sample)
* [Okta-Hosted Login Page Example](https://github.com/okta/samples-java-spring/tree/master/okta-hosted-login)
* [Custom Login Page Example](https://github.com/okta/samples-java-spring/tree/master/custom-login)
* [Okta Spring Security Resource Server Example](https://github.com/okta/samples-java-spring/tree/master/resource-server)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Timetabling sample. Assign lessons to timeslots and rooms to produce a better schedule for teachers and students](https://github.com/TimefoldAI/timefold-quickstarts/tree/stable/technology/java-spring-boot)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples)
* [Azure Key Vault Sample](https://aka.ms/spring/samples/latest/keyvault)
* [Azure Samples](https://aka.ms/spring/samples)
* [Azure Active Directory Sample](https://aka.ms/spring/samples/latest/aad)
* [Azure Storage Sample](https://aka.ms/spring/samples/latest/storage)
* [Azure Cosmos DB Sample](https://aka.ms/spring/samples/latest/cosmos)

## OAuth 2.0 and OIDC with Okta

If you don't have a free Okta developer account, you can create one with [the Okta CLI](https://cli.okta.com):

```bash
$ okta register
```

Then, register your Spring Boot app on Okta using:

```bash
$ okta apps create
```

Select **Web** > **Okta Spring Boot Starter** and accept the default redirect URIs.

