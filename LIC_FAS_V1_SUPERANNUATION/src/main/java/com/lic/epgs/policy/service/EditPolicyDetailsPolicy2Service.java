package com.lic.epgs.policy.service;

import com.lic.epgs.policy.model.Policy;
import com.lic.epgs.policy.repository.EditPolicyDetailsPolicy2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditPolicyDetailsPolicy2Service {

    private EditPolicyDetailsPolicy2Repository editPolicyDetailsPolicy2Repository;

    @Autowired
    public EditPolicyDetailsPolicy2Service(EditPolicyDetailsPolicy2Repository editPolicyDetailsPolicy2Repository) {
        this.editPolicyDetailsPolicy2Repository = editPolicyDetailsPolicy2Repository;
    }

    public Policy getPolicyDetailsByPolicyId(Long policyId) {
        return editPolicyDetailsPolicy2Repository.getPolicyDetailsByPolicyId(policyId);
    }

    public Policy save(Policy policy) {
        return editPolicyDetailsPolicy2Repository.save(policy);
    }

    public void delete(Policy policy) {
        editPolicyDetailsPolicy2Repository.delete(policy);
    }

}