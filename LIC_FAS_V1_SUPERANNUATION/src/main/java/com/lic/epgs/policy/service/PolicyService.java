package com.lic.epgs.policy.service;

import java.util.List;

import com.lic.epgs.policy.dto.PolicyBankDto;
import com.lic.epgs.policy.model.Policy;
import com.lic.epgs.policy.repository.PolicyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public List<PolicyBankDto> getBankList(Long policyId) {
        return policyRepository.getBankList(policyId);
    }

}