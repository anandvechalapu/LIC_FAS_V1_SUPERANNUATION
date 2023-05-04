package com.lic.epgs.policy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lic.epgs.policy.model.PolicyAddressTemp;

@Service
public interface PolicyAddressTempService {
	
	public List<PolicyAddressTemp> getAllPolicyAddressTemp();
	
	public PolicyAddressTemp getPolicyAddressTempById(Long id);

	public PolicyAddressTemp savePolicyAddressTemp(PolicyAddressTemp policyAddressTemp);

	public void deletePolicyAddressTempById(Long id);

}

package com.lic.epgs.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.model.PolicyAddressTemp;
import com.lic.epgs.policy.service.PolicyAddressTempService;

@RestController
@RequestMapping("/api")
public class PolicyAddressTempController {

	@Autowired
	private PolicyAddressTempService policyAddressTempService;
	
	@GetMapping("/policies/addresses")
	public List<PolicyAddressTemp> getAllPolicyAddressTemp(){
		return policyAddressTempService.getAllPolicyAddressTemp();
	}
	
	@GetMapping("/policies/addresses/{id}")
	public PolicyAddressTemp getPolicyAddressTempById(@PathVariable(value = "id") Long id){
		return policyAddressTempService.getPolicyAddressTempById(id);
	}
	
	@PostMapping("/policies/addresses")
	public PolicyAddressTemp savePolicyAddressTemp(@RequestBody PolicyAddressTemp policyAddressTemp){
		return policyAddressTempService.savePolicyAddressTemp(policyAddressTemp);
	}
	
	@DeleteMapping("/policies/addresses/{id}")
	public void deletePolicyAddressTemp(@PathVariable(value = "id") Long id){
		policyAddressTempService.deletePolicyAddressTempById(id);
	}
	
}