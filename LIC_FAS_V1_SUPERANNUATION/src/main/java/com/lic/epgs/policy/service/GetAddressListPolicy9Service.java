package com.lic.epgs.policy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policy.dto.PolicyAddressDto;
import com.lic.epgs.policy.repository.GetAddressListPolicy9Repository;

@Service
public class GetAddressListPolicy9Service {

	@Autowired
	private GetAddressListPolicy9Repository getAddressListPolicy9Repository;

	public List<PolicyAddressDto> getAddressList(Long policyId) {
		return getAddressListPolicy9Repository.getAddressList(policyId);
	}

}