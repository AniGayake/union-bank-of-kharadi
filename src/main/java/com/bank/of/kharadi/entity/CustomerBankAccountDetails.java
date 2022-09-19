package com.bank.of.kharadi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "bank_account_details")
public class CustomerBankAccountDetails {
	
	@Id
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "account_balance")
	private double accountBalance;
	
	@Column(name = "account_type")
	private String account_type;

	public CustomerBankAccountDetails() {
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	

}
