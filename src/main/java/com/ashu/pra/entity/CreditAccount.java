package com.ashu.pra.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity(name="CreditAccount")
public class CreditAccount extends Account{
	
	private BigDecimal creditLimit;

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	

}
