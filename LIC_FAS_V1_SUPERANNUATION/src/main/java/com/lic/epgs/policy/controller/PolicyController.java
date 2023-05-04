package com.lic.epgs.policy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.model.Policy;
import com.lic.epgs.policy.service.GetPolicyDetailsService;

@RestController
public class PolicyController {

    @Autowired
    private GetPolicyDetailsService getPolicyDetailsService;

    // Retrieve policy details by providing a valid policy ID
    @GetMapping("/policy/{policyId}")
    public ResponseEntity<Policy> getPolicyDetails(@PathVariable("policyId") Long policyId) {
        Policy policy = getPolicyDetailsService.getPolicyDetails(policyId);
        
        if(policy == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(policy);
    }
}