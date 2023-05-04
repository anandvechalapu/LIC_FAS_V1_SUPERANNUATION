package com.lic.epgs.policy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policy.model.Policy;
import com.lic.epgs.policy.repository.GetPolicyDetailsRepository;

@Service
public class GetPolicyDetailsService {
    
    @Autowired
    private GetPolicyDetailsRepository getPolicyDetailsRepository;
    
    // Retrieve policy details by providing a valid policy ID
    public Policy getPolicyDetails(Long policyId) {
        return getPolicyDetailsRepository.getPolicyDetails(policyId);
    }
    
    // Check if policy ID exists
    public boolean existsByPolicyId(Long policyId) {
        return getPolicyDetailsRepository.existsByPolicyId(policyId);
    }
}