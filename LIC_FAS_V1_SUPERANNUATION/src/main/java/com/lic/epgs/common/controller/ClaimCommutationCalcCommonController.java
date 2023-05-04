package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.ClaimCommutationCalcCommon;
import com.lic.epgs.common.service.ClaimCommutationCalcCommonService;

@RestController
@RequestMapping("/claimCommutationCalcCommons")
public class ClaimCommutationCalcCommonController {
 
    @Autowired
    ClaimCommutationCalcCommonService claimCommutationCalcCommonService;
    
    @GetMapping
    public List<ClaimCommutationCalcCommon> getActiveClaimCommutationCalcCommons(){
        return claimCommutationCalcCommonService.getActiveClaimCommutationCalcCommons();
    }
}