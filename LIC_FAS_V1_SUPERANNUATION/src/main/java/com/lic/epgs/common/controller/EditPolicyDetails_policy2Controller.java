package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.EditPolicyDetails_policy2;
import com.lic.epgs.common.service.EditPolicyDetails_policy2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/policy")
public class EditPolicyDetails_policy2Controller {

    @Autowired
    private EditPolicyDetails_policy2Service editPolicyDetails_policy2Service;

    @GetMapping("/{policyId}")
    public Optional<EditPolicyDetails_policy2> getPolicyDetailsByPolicyId(@PathVariable String policyId){
        return editPolicyDetails_policy2Service.getPolicyDetailsByPolicyId(policyId);
    }

    @PostMapping
    public EditPolicyDetails_policy2 save(@RequestBody EditPolicyDetails_policy2 policy){
        return editPolicyDetails_policy2Service.save(policy);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        editPolicyDetails_policy2Service.deleteById(id);
    }

}