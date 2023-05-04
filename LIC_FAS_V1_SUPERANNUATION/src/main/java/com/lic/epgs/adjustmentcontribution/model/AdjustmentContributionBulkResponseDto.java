package com.lic.epgs.adjustmentcontribution.model; 

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class AdjustmentContributionBulkResponseDto implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private Long masterPolicyId;
 
    private Long tempPolicyId;
 
    private String createdBy;
 
    private String adjustmentContributionId;
 
    private String unitCode;
 
    private MultipartFile file;
 
    private List<String> alreadyUsedLicIdList;
 
    private List<String> errorList;
 
    private List<String> successList;
 
    private String transactionStatus;
 
    private String transactionMessage;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getMasterPolicyId() {
        return masterPolicyId;
    }
 
    public void setMasterPolicyId(Long masterPolicyId) {
        this.masterPolicyId = masterPolicyId;
    }
 
    public Long getTempPolicyId() {
        return tempPolicyId;
    }
 
    public void setTempPolicyId(Long tempPolicyId) {
        this.tempPolicyId = tempPolicyId;
    }
 
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public String getAdjustmentContributionId() {
        return adjustmentContributionId;
    }
 
    public void setAdjustmentContributionId(String adjustmentContributionId) {
        this.adjustmentContributionId = adjustmentContributionId;
    }
 
    public String getUnitCode() {
        return unitCode;
    }
 
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
 
    public MultipartFile getFile() {
        return file;
    }
 
    public void setFile(MultipartFile file) {
        this.file = file;
    }
 
    public List<String> getAlreadyUsedLicIdList() {
        return alreadyUsedLicIdList;
    }
 
    public void setAlreadyUsedLicIdList(List<String> alreadyUsedLicIdList) {
        this.alreadyUsedLicIdList = alreadyUsedLicIdList;
    }
 
    public List<String> getErrorList() {
        return errorList;
    }
 
    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
 
    public List<String> getSuccessList() {
        return successList;
    }
 
    public void setSuccessList(List<String> successList) {
        this.successList = successList;
    }
 
    public String getTransactionStatus() {
        return transactionStatus;
    }
 
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
 
    public String getTransactionMessage() {
        return transactionMessage;
    }
 
    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }
}