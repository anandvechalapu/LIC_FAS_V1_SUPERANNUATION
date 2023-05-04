package com.lic.epgs.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "claim_approver_actions")
public class ClaimApproverActions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String code;
	private String description;
	private String isMandatory;
	private String status;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getIsMandatory() {
		return isMandatory;
	}
	
	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
		
}