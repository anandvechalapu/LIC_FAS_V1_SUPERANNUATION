package com.lic.epgs.quotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_temp")
public class QuotationTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="quotation_no")
    private Long quotationNo;
    
    @Column(name="unit_office")
    private String unitOffice;
    
    @Column(name="quotation_status")
    private String quotationStatus;
    
    @Column(name="modified_by")
    private String modifiedBy;
    
    @Column(name="modified_on")
    private String modifiedOn;
    
    public QuotationTemp() {
        // default constructor
    }

    public Long getQuotationNo() {
        return quotationNo;
    }

    public void setQuotationNo(Long quotationNo) {
        this.quotationNo = quotationNo;
    }

    public String getUnitOffice() {
        return unitOffice;
    }

    public void setUnitOffice(String unitOffice) {
        this.unitOffice = unitOffice;
    }

    public String getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(String quotationStatus) {
        this.quotationStatus = quotationStatus;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}