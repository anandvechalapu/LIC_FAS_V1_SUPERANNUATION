package com.lic.epgs.policy.model;

import java.util.List;

public class PolicyAddressDto {

	private Long policyId;
	private List<Address> addresses;

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}