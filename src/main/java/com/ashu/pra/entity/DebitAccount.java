package com.ashu.pra.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity(name="DebitAccount")

public class DebitAccount extends Account{
	
	private BigDecimal overdraft;

	public BigDecimal getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(BigDecimal overdraft) {
		this.overdraft = overdraft;
	}
	
	

}
