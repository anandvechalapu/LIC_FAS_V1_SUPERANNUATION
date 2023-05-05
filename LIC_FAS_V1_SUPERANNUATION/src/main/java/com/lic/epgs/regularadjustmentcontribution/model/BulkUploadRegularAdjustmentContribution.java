package com.lic.epgs.regularadjustmentcontribution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BulkUploadRegularAdjustmentContribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String masterPolicyId;
    
    private String temporaryPolicyId;
    
    private String createdBy;
    
    private String regularContributionId;
    
    private String unitCode;
    
    private String fileName;
    
    private Integer totalCount;
    
    private Boolean isActive;
    
    private Long createdOn;
    
    private Integer successCount;
    
    private Integer failedCount;
    
    private String transactionMessage;
    
    private String transactionStatus;
    
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

}