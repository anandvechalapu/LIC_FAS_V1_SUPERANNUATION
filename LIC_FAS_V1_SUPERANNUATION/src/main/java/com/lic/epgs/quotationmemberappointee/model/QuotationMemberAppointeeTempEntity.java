package com.lic.epgs.quotationmemberappointee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuotationMemberAppointeeTempEntity {

    @Id
    private Long appointeeId;
    private Long quotationId;
    private Long memberId;
    private Long appointeeId;
    
    public Long getAppointeeId() {
        return appointeeId;
    }

    public void setAppointeeId(Long appointeeId) {
        this.appointeeId = appointeeId;
    }

    public Long getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Long quotationId) {
        this.quotationId = quotationId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

}