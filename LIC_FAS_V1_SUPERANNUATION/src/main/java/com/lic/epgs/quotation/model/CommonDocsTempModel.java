package com.lic.epgs.quotation.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="common_docs_temp")
public class CommonDocsTempModel {
	
	private Long quotationId;
	private String documentName;
	private String documentType;
	private String documentUrl;
	
	public Long getQuotationId() {
		return quotationId;
	}
	public void setQuotationId(Long quotationId) {
		this.quotationId = quotationId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	
	

}