package com.lic.epgs.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.dto.PolicyAddressDto;
import com.lic.epgs.policy.service.GetAddressListPolicy9Service;

@RestController
@RequestMapping("/policy")
public class GetAddressListPolicy9Controller {

	@Autowired
	private GetAddressListPolicy9Service getAddressListPolicy9Service;

	@GetMapping("/{policyId}/addresses")
	public List<PolicyAddressDto> getAddressList(@PathVariable Long policyId) {
		return getAddressListPolicy9Service.getAddressList(policyId);
	}

}