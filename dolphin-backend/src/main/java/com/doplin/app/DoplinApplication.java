package com.doplin.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.doplin.app.mapper")
public class DoplinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoplinApplication.class, args);
	}

}
