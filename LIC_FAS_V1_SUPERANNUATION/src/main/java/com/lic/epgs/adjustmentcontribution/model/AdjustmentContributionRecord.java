package com.lic.epgs.adjustmentcontribution.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdjustmentContributionRecord {
 
    @Id
    private Long id;
    private String batchId;
    private String fileType;
    private String data;
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getBatchId() {
        return batchId;
    }
 
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
 
    public String getFileType() {
        return fileType;
    }
 
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
}