package com.lic.epgs.policy.service;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.PolicyBankTempEntity;
import com.lic.epgs.policy.repository.PolicyBankDetailsTempRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PolicyBankDetailsTempService {

    @Autowired
    private PolicyBankDetailsTempRepo policyBankDetailsTempRepo;

    @Transactional
    public PolicyResponseDto removeBankDetails(Long policyId, Long bankAccountId) {
        int result = policyBankDetailsTempRepo.removeBankDetails(policyId, bankAccountId);
        return PolicyResponseDto.builder().status(result == 1 ? "SUCCESS" : "FAILED").build();
    }
}