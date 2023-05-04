package com.lic.epgs.claim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BatchEntity {

    @Id
    private String batchId;

    @Column
    private String batchName;

    @Column
    private String batchDescription;

    @Column
    private String batchError;

    public BatchEntity() {
    }

    public BatchEntity(String batchId, String batchName, String batchDescription, String batchError) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.batchDescription = batchDescription;
        this.batchError = batchError;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchDescription() {
        return batchDescription;
    }

    public void setBatchDescription(String batchDescription) {
        this.batchDescription = batchDescription;
    }

    public String getBatchError() {
        return batchError;
    }

    public void setBatchError(String batchError) {
        this.batchError = batchError;
    }

}

package com.lic.epgs.claim.model;

public class BatchDetailDto {

    private String batchId;
    private String batchName;
    private String batchDescription;
    private String batchError;

    public BatchDetailDto() {
    }

    public BatchDetailDto(String batchId, String batchName, String batchDescription, String batchError) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.batchDescription = batchDescription;
        this.batchError = batchError;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchDescription() {
        return batchDescription;
    }

    public void setBatchDescription(String batchDescription) {
        this.batchDescription = batchDescription;
    }

    public String getBatchError() {
        return batchError;
    }

    public void setBatchError(String batchError) {
        this.batchError = batchError;
    }

}