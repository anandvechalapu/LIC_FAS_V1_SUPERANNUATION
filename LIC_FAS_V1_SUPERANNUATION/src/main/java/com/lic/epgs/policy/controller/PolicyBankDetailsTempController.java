package com.lic.epgs.policy.controller;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.service.PolicyBankDetailsTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyBankDetailsTempController {

    @Autowired
    private PolicyBankDetailsTempService policyBankDetailsTempService;

    @DeleteMapping("/{policyId}/bankdetails/{bankAccountId}")
    public PolicyResponseDto removeBankDetails(@PathVariable Long policyId, @PathVariable Long bankAccountId) {
        return policyBankDetailsTempService.removeBankDetails(policyId, bankAccountId);
    }
}