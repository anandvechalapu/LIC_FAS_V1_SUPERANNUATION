package com.lic.epgs.quotationmember.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DownloadQuotationMemberController {

	@Id
	private Long batchId;

	private String fileType;

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}