package com.pretest.kakaopay.springhousingfinance;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringHousingfinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHousingfinanceApplication.class, args);
	}

}
