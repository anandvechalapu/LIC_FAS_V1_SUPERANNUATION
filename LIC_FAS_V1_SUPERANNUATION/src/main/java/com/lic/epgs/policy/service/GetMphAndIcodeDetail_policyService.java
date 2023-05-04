package com.lic.epgs.policy.service;

import com.lic.epgs.policy.dto.MphAndIcodeResponseDto;
import com.lic.epgs.policy.repository.GetMphAndIcodeDetail_policyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetMphAndIcodeDetail_policyService {

    @Autowired
    private GetMphAndIcodeDetail_policyRepository getMphAndIcodeDetail_policyRepository;

    public MphAndIcodeResponseDto getMphAndIcodeDetail(String policyNumber){
        return getMphAndIcodeDetail_policyRepository.getMphAndIcodeDetail(policyNumber);
    }

}