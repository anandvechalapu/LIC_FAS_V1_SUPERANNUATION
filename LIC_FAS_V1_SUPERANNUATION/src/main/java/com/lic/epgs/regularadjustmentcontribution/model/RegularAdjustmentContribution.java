package com.lic.epgs.regularadjustmentcontribution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regular_adjustment_contribution")
public class RegularAdjustmentContribution {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "batch_id")
    private Long batchId;
    
    @Column(name = "adjustment_amount")
    private Double adjustmentAmount;
    
    @Column(name = "contribution_percentage")
    private Double contributionPercentage;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getBatchId() {
        return batchId;
    }
    
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
    
    public Double getAdjustmentAmount() {
        return adjustmentAmount;
    }
    
    public void setAdjustmentAmount(Double adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }
    
    public Double getContributionPercentage() {
        return contributionPercentage;
    }
    
    public void setContributionPercentage(Double contributionPercentage) {
        this.contributionPercentage = contributionPercentage;
    }
}