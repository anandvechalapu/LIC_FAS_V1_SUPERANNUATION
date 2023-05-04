package com.lic.epgs.policy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NoteDTO {

	@Id
	private Long policyId;
	private String note;

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}