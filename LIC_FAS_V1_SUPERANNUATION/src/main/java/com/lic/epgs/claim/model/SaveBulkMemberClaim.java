package com.lic.epgs.claim.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SaveBulkMemberClaim")
public class SaveBulkMemberClaim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "batch_id")
	private String batchId;

	@Column(name = "policy_id")
	private String policyId;

	@Column(name = "membership_id")
	private String membershipId;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "unit_code")
	private String unitCode;
	
	@Column(name = "success_count")
	private int successCount;

	@Column(name = "failure_count")
	private int failureCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public int getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}

	public int getFailureCount() {
		return failureCount;
	}

	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}

}