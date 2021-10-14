package com.common.mod2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.common"})
public class Mod2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mod2Application.class, args);
	}

}
