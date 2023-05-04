package com.lic.epgs.policy.controller;

import com.lic.epgs.policy.model.Policy;
import com.lic.epgs.policy.service.EditPolicyDetailsPolicy2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/epgs/policies/policy2")
public class EditPolicyDetailsPolicy2Controller {

    private EditPolicyDetailsPolicy2Service editPolicyDetailsPolicy2Service;

    @Autowired
    public EditPolicyDetailsPolicy2Controller(EditPolicyDetailsPolicy2Service editPolicyDetailsPolicy2Service) {
        this.editPolicyDetailsPolicy2Service = editPolicyDetailsPolicy2Service;
    }

    @GetMapping("/{policyId}")
    public Policy getPolicyDetailsByPolicyId(@PathVariable Long policyId) {
        return editPolicyDetailsPolicy2Service.getPolicyDetailsByPolicyId(policyId);
    }

    @PostMapping
    public Policy save(@RequestBody Policy policy) {
        return editPolicyDetailsPolicy2Service.save(policy);
    }

    @DeleteMapping
    public void delete(@RequestBody Policy policy) {
        editPolicyDetailsPolicy2Service.delete(policy);
    }

}