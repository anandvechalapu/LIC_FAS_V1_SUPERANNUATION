package com.lic.epgs.quotation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuotationDto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String quotationNumber;
    private String proposalNumber;
    private String unitCode;
    
    public QuotationDto() {
    }
    
    public QuotationDto(String quotationNumber, String proposalNumber, String unitCode) {
        this.quotationNumber = quotationNumber;
        this.proposalNumber = proposalNumber;
        this.unitCode = unitCode;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getQuotationNumber() {
        return quotationNumber;
    }
    
    public void setQuotationNumber(String quotationNumber) {
        this.quotationNumber = quotationNumber;
    }
    
    public String getProposalNumber() {
        return proposalNumber;
    }
    
    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }
    
    public String getUnitCode() {
        return unitCode;
    }
    
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

}