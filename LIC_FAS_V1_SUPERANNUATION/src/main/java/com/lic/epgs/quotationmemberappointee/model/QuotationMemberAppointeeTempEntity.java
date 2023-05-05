package com.lic.epgs.quotationmemberappointee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_member_appointee_temp")
public class QuotationMemberAppointeeTempEntity {

	@Id
	private Long id;
	private Long appointeeId;
	private Long quotationMemberId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppointeeId() {
		return appointeeId;
	}

	public void setAppointeeId(Long appointeeId) {
		this.appointeeId = appointeeId;
	}

	public Long getQuotationMemberId() {
		return quotationMemberId;
	}

	public void setQuotationMemberId(Long quotationMemberId) {
		this.quotationMemberId = quotationMemberId;
	}

}