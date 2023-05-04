package com.lic.epgs.policy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.model.PolicyBankDto;
import com.lic.epgs.policy.model.PolicyResponseDto;
import com.lic.epgs.policy.service.SaveBankDetails_policyService;

@RestController
public class SaveBankDetails_policyController {
	
	@Autowired
	private SaveBankDetails_policyService saveBankDetails_policyService;
	
	@PostMapping("/saveBankDetails")
	public PolicyResponseDto saveBankDetails(@RequestBody PolicyBankDto policyBankDto) {
		return saveBankDetails_policyService.saveBankDetails(policyBankDto);
	}

}