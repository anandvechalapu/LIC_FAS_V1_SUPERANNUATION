package com.lic.epgs.policy.controller;

import java.util.List;

import com.lic.epgs.policy.dto.PolicyBankDto;
import com.lic.epgs.policy.service.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/{policyId}/banklist")
    public List<PolicyBankDto> getBankList(@PathVariable Long policyId) {
        return policyService.getBankList(policyId);
    }

}