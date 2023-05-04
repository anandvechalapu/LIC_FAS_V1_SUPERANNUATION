package com.lic.epgs.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.model.PolicyStatus;
import com.lic.epgs.common.repository.PolicyStatusApiRepository;

@Service
public class PolicyStatusService {

    @Autowired
    PolicyStatusApiRepository policyStatusApiRepository;

    public PolicyStatus findByCodeAndStatus(String code, String status) {
        return policyStatusApiRepository.findByCodeAndStatus(code, status);
    }
    
    public PolicyStatus findByIdAndStatus(Long id, String status) {
        return policyStatusApiRepository.findByIdAndStatus(id, status);
    }

}