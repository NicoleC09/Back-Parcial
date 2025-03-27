package com.ECICredit.back.eciCredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EciCredit {

	private List<Double> prices;

	public Double getTotalAmount(List<Double> prices){
		Double amount = 0.0;
		for(Double price:prices){
			amount += price;
		}
		return amount;
	}

	public static void main(String[] args) {
		SpringApplication.run(EciCredit.class, args);
	}

}