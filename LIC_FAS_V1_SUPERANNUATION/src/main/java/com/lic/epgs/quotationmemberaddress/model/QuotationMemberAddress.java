package com.lic.epgs.quotationmemberaddress.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "quotation_member_address")
public class QuotationMemberAddress {

    @Id
    private Long quotationMemberAddressId;

    @NotNull
    private Long quotationMemberId;

    public Long getQuotationMemberAddressId() {
        return quotationMemberAddressId;
    }

    public void setQuotationMemberAddressId(Long quotationMemberAddressId) {
        this.quotationMemberAddressId = quotationMemberAddressId;
    }

    public Long getQuotationMemberId() {
        return quotationMemberId;
    }

    public void setQuotationMemberId(Long quotationMemberId) {
        this.quotationMemberId = quotationMemberId;
    }

}