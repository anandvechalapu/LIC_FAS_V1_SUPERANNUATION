package com.lic.epgs.quotationmembernominee.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "quotation_member_nominee")
public class QuotationMemberNomineeApiResponseDto {

    private Long memberId;
    private Long nomineeId;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getNomineeId() {
        return nomineeId;
    }

    public void setNomineeId(Long nomineeId) {
        this.nomineeId = nomineeId;
    }
}