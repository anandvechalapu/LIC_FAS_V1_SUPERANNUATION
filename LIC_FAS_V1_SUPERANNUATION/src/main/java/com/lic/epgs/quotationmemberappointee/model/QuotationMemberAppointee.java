package com.lic.epgs.quotationmemberappointee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuotationMemberAppointee {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long quotationMemberId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String telephone;
    private String email;
    private String appointeeType;
    
    public QuotationMemberAppointee() {
        
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getQuotationMemberId() {
        return quotationMemberId;
    }
    public void setQuotationMemberId(Long quotationMemberId) {
        this.quotationMemberId = quotationMemberId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAppointeeType() {
        return appointeeType;
    }
    public void setAppointeeType(String appointeeType) {
        this.appointeeType = appointeeType;
    }
}