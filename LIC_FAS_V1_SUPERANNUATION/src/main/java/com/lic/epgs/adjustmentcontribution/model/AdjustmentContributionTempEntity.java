package com.lic.epgs.adjustmentcontribution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adjustment_contribution_temp")
public class AdjustmentContributionTempEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "batch_id")
  private String batchId;
  
  @Column(name = "total_contribution")
  private Double totalContribution;
  
  @Column(name = "employee_contribution")
  private Double employeeContribution;
  
  @Column(name = "employer_contribution")
  private Double employerContribution;
  
  @Column(name = "voluntary_contribution")
  private Double voluntaryContribution;
  
  @Column(name = "is_active")
  private Boolean isActive;
  
  public AdjustmentContributionTempEntity() {}
  
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
  
  public Double getTotalContribution() {
    return totalContribution;
  }
  
  public void setTotalContribution(Double totalContribution) {
    this.totalContribution = totalContribution;
  }
  
  public Double getEmployeeContribution() {
    return employeeContribution;
  }
  
  public void setEmployeeContribution(Double employeeContribution) {
    this.employeeContribution = employeeContribution;
  }
  
  public Double getEmployerContribution() {
    return employerContribution;
  }
  
  public void setEmployerContribution(Double employerContribution) {
    this.employerContribution = employerContribution;
  }
  
  public Double getVoluntaryContribution() {
    return voluntaryContribution;
  }
  
  public void setVoluntaryContribution(Double voluntaryContribution) {
    this.voluntaryContribution = voluntaryContribution;
  }
  
  public Boolean getIsActive() {
    return isActive;
  }
  
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
  
}