package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.repository.ClaimCommutationCalcCommonRepository;
import com.lic.epgs.model.ClaimCommutationCalcCommon;

@Service
public class ClaimCommutationCalcCommonService {
    
    @Autowired
    ClaimCommutationCalcCommonRepository claimCommutationCalcCommonRepository;
    
    public List<ClaimCommutationCalcCommon> getActiveClaimCommutationCalcCommons() {
        return claimCommutationCalcCommonRepository.findActiveClaimCommutationCalcCommons();
    }
}