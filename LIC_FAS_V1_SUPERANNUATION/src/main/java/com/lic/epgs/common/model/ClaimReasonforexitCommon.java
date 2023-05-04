package com.lic.epgs.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClaimReasonforexitCommon {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String code;
	
	private String description;
	
	private Boolean ismandatory;
	
	private Boolean status;

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

	public Boolean getIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(Boolean ismandatory) {
		this.ismandatory = ismandatory;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}