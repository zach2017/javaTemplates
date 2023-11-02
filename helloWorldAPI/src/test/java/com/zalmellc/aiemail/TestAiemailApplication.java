package com.zalmellc.aiemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
/* 
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.containers.OracleContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.utility.DockerImageName;
*/

@TestConfiguration(proxyBeanMethods = false)
public class TestAiemailApplication {
/* 
	@Bean
	@ServiceConnection
	KafkaContainer kafkaContainer() {
		return new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"));
	}

	@Bean
	@ServiceConnection
	OracleContainer oracleContainer() {
		return new OracleContainer(DockerImageName.parse("gvenzl/oracle-xe:latest"));
	}

	@Bean
	@ServiceConnection
	PostgreSQLContainer<?> postgresContainer() {
		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
	}

	@Bean
	@ServiceConnection
	RabbitMQContainer rabbitContainer() {
		return new RabbitMQContainer(DockerImageName.parse("rabbitmq:latest"));
	}

	@Bean
	@ServiceConnection(name = "redis")
	GenericContainer<?> redisContainer() {
		return new GenericContainer<>(DockerImageName.parse("redis:latest")).withExposedPorts(6379);
	}

	@Bean
	@ServiceConnection
	MSSQLServerContainer<?> sqlServerContainer() {
		return new MSSQLServerContainer<>(DockerImageName.parse("mcr.microsoft.com/mssql/server:latest"));
	}
*/
	public static void main(String[] args) {
		SpringApplication.from(AiemailApplication::main).with(TestAiemailApplication.class).run(args);
	}

}
