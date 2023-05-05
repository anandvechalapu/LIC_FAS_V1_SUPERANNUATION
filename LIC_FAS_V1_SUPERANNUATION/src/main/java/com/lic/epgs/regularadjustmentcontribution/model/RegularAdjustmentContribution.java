package com.lic.epgs.regularadjustmentcontribution.model; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regular_adjustment_contribution")
public class RegularAdjustmentContribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String masterPolicyId;
    private String temporaryPolicyId;
    private String createdBy;
    private String regularContributionId;
    private String unitCode;
    private String fileName;
    private int totalCount;
    private boolean isActive;
    private String createdOn;
    private int successCount;
    private int failedCount;
    private String errorMessages;
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

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(int failedCount) {
        this.failedCount = failedCount;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
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