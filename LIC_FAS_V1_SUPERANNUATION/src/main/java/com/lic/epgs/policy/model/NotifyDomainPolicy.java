package com.lic.epgs.policy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotifyDomainPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer randomInteger;
	
	private String transactionStatus;
	
	private String transactionMessage;
	
	private Boolean zeroValueDeposit;
	
	private Long challanNumber;
	
	private String createdDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRandomInteger() {
		return randomInteger;
	}
	public void setRandomInteger(Integer randomInteger) {
		this.randomInteger = randomInteger;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionMessage() {
		return transactionMessage;
	}
	public void setTransactionMessage(String transactionMessage) {
		this.transactionMessage = transactionMessage;
	}
	public Boolean getZeroValueDeposit() {
		return zeroValueDeposit;
	}
	public void setZeroValueDeposit(Boolean zeroValueDeposit) {
		this.zeroValueDeposit = zeroValueDeposit;
	}
	public Long getChallanNumber() {
		return challanNumber;
	}
	public void setChallanNumber(Long challanNumber) {
		this.challanNumber = challanNumber;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
}