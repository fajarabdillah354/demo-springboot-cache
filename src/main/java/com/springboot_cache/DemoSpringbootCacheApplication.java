package com.springboot_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoSpringbootCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootCacheApplication.class, args);
	}

}
