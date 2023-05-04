package com.lic.epgs.policy.controller;

import com.lic.epgs.policy.dto.MphAndIcodeResponseDto;
import com.lic.epgs.policy.service.GetMphAndIcodeDetail_policyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMphAndIcodeDetail_policyController {

    @Autowired
    private GetMphAndIcodeDetail_policyService getMphAndIcodeDetail_policyService;

    @GetMapping("/mphandicode/{policyNumber}")
    public MphAndIcodeResponseDto getMphAndIcodeDetail(@PathVariable String policyNumber) {
        return getMphAndIcodeDetail_policyService.getMphAndIcodeDetail(policyNumber);
    }

}