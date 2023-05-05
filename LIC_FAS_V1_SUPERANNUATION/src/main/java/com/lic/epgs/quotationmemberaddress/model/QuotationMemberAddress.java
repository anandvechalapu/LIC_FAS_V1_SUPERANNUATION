package com.lic.epgs.quotationmemberaddress.model; 

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "quotation_member_address")
public class QuotationMemberAddress {
 
 @Id
 @Column(name="quotation_member_id")
 private Long quotationMemberId; 
  
 @Column(name="address_line_1")
 private String addressLine1;
 
 @Column(name="address_line_2")
 private String addressLine2;
 
 @Column(name="city")
 private String city;
 
 @Column(name="state")
 private String state;
 
 @Column(name="zip_code")
 private String zipCode;
 
 @Column(name="country")
 private String country;
 
 public Long getQuotationMemberId() {
  return quotationMemberId;
 }
 
 public void setQuotationMemberId(Long quotationMemberId) {
  this.quotationMemberId = quotationMemberId;
 }
 
 public String getAddressLine1() {
  return addressLine1;
 }
 
 public void setAddressLine1(String addressLine1) {
  this.addressLine1 = addressLine1;
 }
 
 public String getAddressLine2() {
  return addressLine2;
 }
 
 public void setAddressLine2(String addressLine2) {
  this.addressLine2 = addressLine2;
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
 
 public String getZipCode() {
  return zipCode;
 }
 
 public void setZipCode(String zipCode) {
  this.zipCode = zipCode;
 }
 
 public String getCountry() {
  return country;
 }
 
 public void setCountry(String country) {
  this.country = country;
 }
 
}