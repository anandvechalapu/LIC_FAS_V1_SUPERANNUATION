package com.lic.epgs.policy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;
    
    private String policyName;
    private String policyType;
    private String policyNumber;
    private String policyHolderName;
    private String policyHolderAddress;
    private String policyPremium;
    
    public Policy() {
    }
    
    public Long getPolicyId() {
        return policyId;
    }
    
    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }
    
    public String getPolicyName() {
        return policyName;
    }
    
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    public String getPolicyType() {
        return policyType;
    }
    
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public String getPolicyHolderName() {
        return policyHolderName;
    }
    
    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }
    
    public String getPolicyHolderAddress() {
        return policyHolderAddress;
    }
    
    public void setPolicyHolderAddress(String policyHolderAddress) {
        this.policyHolderAddress = policyHolderAddress;
    }
    
    public String getPolicyPremium() {
        return policyPremium;
    }
    
    public void setPolicyPremium(String policyPremium) {
        this.policyPremium = policyPremium;
    }
}