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
    @Column(name="quotation_id")
    private int quotationId;

    @Column(name="quotation_date")
    private String quotationDate;

    @Column(name="quotation_no")
    private String quotationNo;

    @Column(name="quotation_amount")
    private double quotationAmount;

    public int getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(int quotationId) {
        this.quotationId = quotationId;
    }

    public String getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(String quotationDate) {
        this.quotationDate = quotationDate;
    }

    public String getQuotationNo() {
        return quotationNo;
    }

    public void setQuotationNo(String quotationNo) {
        this.quotationNo = quotationNo;
    }

    public double getQuotationAmount() {
        return quotationAmount;
    }

    public void setQuotationAmount(double quotationAmount) {
        this.quotationAmount = quotationAmount;
    }

}