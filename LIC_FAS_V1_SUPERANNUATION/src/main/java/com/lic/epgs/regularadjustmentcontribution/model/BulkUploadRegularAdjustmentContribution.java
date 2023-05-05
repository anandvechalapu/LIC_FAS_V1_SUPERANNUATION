package com.lic.epgs.regularadjustmentcontribution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bulk_upload_regular_adjustment_contributions")
public class BulkUploadRegularAdjustmentContribution {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@Column(name="master_policy_id")
    private String masterPolicyId;
	
	@Column(name="temporary_policy_id")
    private String temporaryPolicyId;
	
	@Column(name="regular_contribution_id")
    private String regularContributionId;
	
	@Column(name="unit_code")
    private String unitCode;
	
	@Column(name="policy_name")
    private String policyName;
	
	@Column(name="adjustment_code")
    private String adjustmentCode;
	
	@Column(name="adjustment_amount")
    private Double adjustmentAmount;
	
	@Column(name="created_by")
    private String createdBy;
	
	@Column(name="file_name")
    private String fileName;
	
	@Column(name="is_active")
    private Boolean isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMasterPolicyId() {
		return masterPolicyId;
	}

	public void setMasterPolicyId(String masterPolicyId) {
		this.masterPolicyId = masterPolicyId;
	}

	public String getTemporaryPolicyId() {
		return temporaryPolicyId;
	}

	public void setTemporaryPolicyId(String temporaryPolicyId) {
		this.temporaryPolicyId = temporaryPolicyId;
	}

	public String getRegularContributionId() {
		return regularContributionId;
	}

	public void setRegularContributionId(String regularContributionId) {
		this.regularContributionId = regularContributionId;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getAdjustmentCode() {
		return adjustmentCode;
	}

	public void setAdjustmentCode(String adjustmentCode) {
		this.adjustmentCode = adjustmentCode;
	}

	public Double getAdjustmentAmount() {
		return adjustmentAmount;
	}

	public void setAdjustmentAmount(Double adjustmentAmount) {
		this.adjustmentAmount = adjustmentAmount;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}