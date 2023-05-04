package com.lic.epgs.common.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Table(name = "claim_commutation_calc_common")
public class ClaimCommutationCalcCommon implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
 
    @Column(name = "status")
    private Boolean status;
 
    @ManyToOne
    private Policy policy;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public Boolean getStatus() {
        return status;
    }
 
    public void setStatus(Boolean status) {
        this.status = status;
    }
 
    public Policy getPolicy() {
        return policy;
    }
 
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}