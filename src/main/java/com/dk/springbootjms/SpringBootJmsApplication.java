package com.dk.springbootjms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class SpringBootJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsApplication.class, args);
	}

}