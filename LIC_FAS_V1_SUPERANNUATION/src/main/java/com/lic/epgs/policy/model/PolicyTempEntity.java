package com.lic.epgs.policy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_temp")
public class PolicyTempEntity {
	
	@Id
	private Long id;
	private String policyNumber;
	private String policyName;
	private String policyType;
	private byte[] policyContent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public byte[] getPolicyContent() {
		return policyContent;
	}
	public void setPolicyContent(byte[] policyContent) {
		this.policyContent = policyContent;
	}
	
	

}