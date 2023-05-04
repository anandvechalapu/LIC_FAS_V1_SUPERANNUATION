package com.lic.epgs.common.service;

import com.lic.epgs.common.model.EditPolicyDetails_policy2;
import com.lic.epgs.common.repository.EditPolicyDetails_policy2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EditPolicyDetails_policy2Service {

    @Autowired
    private EditPolicyDetails_policy2Repository editPolicyDetails_policy2Repository;

    public Optional<EditPolicyDetails_policy2> getPolicyDetailsByPolicyId(String policyId) {
        return editPolicyDetails_policy2Repository.findByPolicyId(policyId);
    }

    public EditPolicyDetails_policy2 save(EditPolicyDetails_policy2 policy) {
        return editPolicyDetails_policy2Repository.save(policy);
    }

    public void deleteById(Long id) {
        editPolicyDetails_policy2Repository.deleteById(id);
    }
}