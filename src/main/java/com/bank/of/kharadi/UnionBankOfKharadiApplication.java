package com.bank.of.kharadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bank.of.kharadi.entity.CustomerDetails;

@SpringBootApplication
public class UnionBankOfKharadiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnionBankOfKharadiApplication.class, args);
		CustomerDetails customerDetails= new CustomerDetails();
		customerDetails.generateAccountNumber();
	}

}