package com.lic.epgs.policy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyBankTemp {
    @Id
    private Long policyId;
    private Long bankAccountId;
    private boolean inactive;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }
}