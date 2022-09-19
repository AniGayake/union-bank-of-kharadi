package com.bank.of.kharadi.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

	@Id
	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "first_name")
	private String firstNameString;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	
	public CustomerDetails() {
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber() {
		this.accountNumber=generateAccountNumber();
		
	}
	public String getFirstNameString() {
		return firstNameString;
	}
	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String generateAccountNumber() {
		 Random rnd = new Random();
		    long number = rnd.nextLong(999999L);
		    
		    String accountNumberString = "5013";
		    return accountNumberString + String.format("%6d", number);
		   
	}
	

}
