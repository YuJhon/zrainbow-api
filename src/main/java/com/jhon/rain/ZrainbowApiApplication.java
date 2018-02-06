package com.jhon.rain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan("com.jhon.rain.dao")
public class ZrainbowApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZrainbowApiApplication.class, args);
	}
}
