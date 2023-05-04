package com.lic.epgs.claim.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim_mbr_service")
public class ClaimMbrService implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "batch_id")
    private Long batchId;

    @Column(name = "claim_id")
    private Long claimId;

    @Column(name = "service_id")
    private Long serviceId;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
    
}