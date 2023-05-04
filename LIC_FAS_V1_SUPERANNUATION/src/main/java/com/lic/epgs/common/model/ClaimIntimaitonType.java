package com.lic.epgs.common.model;

import javax.persistence.*;

@Entity
@Table(name = "claim_intimaiton_type")
public class ClaimIntimaitonType {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "code")
    private String code;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "is_mandatory")
    private boolean isMandatory;
	
	@Column(name = "status")
    private boolean status;
	
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
	
	public boolean isMandatory() {
		return isMandatory;
	}
	
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}