package com.lic.epgs.regularadjustmentcontribution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BulkUploadRegularAdjustmentContribution {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String masterPolicyId;
    private String temporaryPolicyId;
    private String createdBy;
    private String regularContributionId;
    private String unitCode;
    private String fileName;
    private String successDataSet;
    private String failedDataSet;
    private String transactionMessage;
    private String transactionStatus;
    private String errorMessages;
    
    // Getters and Setters
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
    public String getSuccessDataSet() {
        return successDataSet;
    }
    public void setSuccessDataSet(String successDataSet) {
        this.successDataSet = successDataSet;
    }
    public String getFailedDataSet() {
        return failedDataSet;
    }
    public void setFailedDataSet(String failedDataSet) {
        this.failedDataSet = failedDataSet;
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
    public String getErrorMessages() {
        return errorMessages;
    }
    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }
}