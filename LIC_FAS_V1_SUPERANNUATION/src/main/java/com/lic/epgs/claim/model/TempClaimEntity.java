package com.lic.epgs.claim.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "temp_claim_entity")
public class TempClaimEntity {
	
	@Id
	private Long batchId;
	private String associateName;
	private String associateId;
	private String associateCode;
	private String associateStatus;
	private String associateType;
	
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public String getAssociateCode() {
		return associateCode;
	}
	public void setAssociateCode(String associateCode) {
		this.associateCode = associateCode;
	}
	public String getAssociateStatus() {
		return associateStatus;
	}
	public void setAssociateStatus(String associateStatus) {
		this.associateStatus = associateStatus;
	}
	public String getAssociateType() {
		return associateType;
	}
	public void setAssociateType(String associateType) {
		this.associateType = associateType;
	}
	
	

}