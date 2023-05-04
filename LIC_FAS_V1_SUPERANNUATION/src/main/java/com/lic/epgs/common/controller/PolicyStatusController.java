package com.lic.epgs.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.PolicyStatus;
import com.lic.epgs.common.service.PolicyStatusService;

@RestController
@RequestMapping("/policy-status")
public class PolicyStatusController {

    @Autowired 
    PolicyStatusService policyStatusService;

    @GetMapping("/{code}/{status}")
    public PolicyStatus findByCodeAndStatus(@PathVariable String code, @PathVariable String status) {
        return policyStatusService.findByCodeAndStatus(code, status);
    }

    @PostMapping("/{id}/{status}")
    public PolicyStatus findByIdAndStatus(@PathVariable Long id, @PathVariable String status, @RequestBody PolicyStatus policyStatus) {
        return policyStatusService.findByIdAndStatus(id, status);
    }

}