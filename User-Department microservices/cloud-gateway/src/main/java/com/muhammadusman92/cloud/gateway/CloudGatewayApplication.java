package com.muhammadusman92.cloud.gateway;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

@SpringBootApplication
public class CloudGatewayApplication {


	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
//	@Bean
//	public Customizer<Resilience4JCircuitBreakerFactory> globalCustomConfiguration() {
//		TimeLimiterConfig timeLimiterConfig = TimeLimiterConfig.custom()
//				.timeoutDuration(Duration.ofSeconds(60))
//				.build();
//		CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
//				.failureRateThreshold(40)
//				.slowCallRateThreshold(40)
//				.permittedNumberOfCallsInHalfOpenState(1)
//				.maxWaitDurationInHalfOpenState(Duration.ofSeconds(10))
//				.slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
//				.waitDurationInOpenState(Duration.ofMillis(1000))
//				.slidingWindowSize(5)
//				.build();
//
//		return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
//				.timeLimiterConfig(timeLimiterConfig)
//				.circuitBreakerConfig(circuitBreakerConfig)
//				.build());
//	}

}
