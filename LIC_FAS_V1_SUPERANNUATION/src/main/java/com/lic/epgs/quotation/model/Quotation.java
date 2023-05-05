}

package com.lic.epgs.quotation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quotations")
public class Quotation {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  private String mphCode;
  private String mphName;
  private String product;
  private String lineOfBusiness;
  private String proposalNumber;
  private String quotationStatus;
  private String createdOn;
  
  public Quotation() {}
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getMphCode() {
    return this.mphCode;
  }
  
  public void setMphCode(String mphCode) {
    this.mphCode = mphCode;
  }
  
  public String getMphName() {
    return this.mphName;
  }
  
  public void setMphName(String mphName) {
    this.mphName = mphName;
  }
  
  public String getProduct() {
    return this.product;
  }
  
  public void setProduct(String product) {
    this.product = product;
  }
  
  public String getLineOfBusiness() {
    return this.lineOfBusiness;
  }
  
  public void setLineOfBusiness(String lineOfBusiness) {
    this.lineOfBusiness = lineOfBusiness;
  }
  
  public String getProposalNumber() {
    return this.proposalNumber;
  }
  
  public void setProposalNumber(String proposalNumber) {
    this.proposalNumber = proposalNumber;
  }
  
  public String getQuotationStatus() {
    return this.quotationStatus;
  }
  
  public void setQuotationStatus(String quotationStatus) {
    this.quotationStatus = quotationStatus;
  }
  
  public String getCreatedOn() {
    return this.createdOn;
  }
  
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }
  
}