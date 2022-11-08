package com.hr.lockmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockmanagerApplication.class, args);
	}

	private static final String LOCK_NAME = "lock";

	@Bean(destroyMethod = "destroy")
	public RedisLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory) {
		return new RedisLockRegistry(redisConnectionFactory, LOCK_NAME);
	}

}
