@Service
public class GetPolicyDetails_policyService {

    @Autowired
    private GetPolicyDetails_policyRepository getPolicyDetails_policyRepository;

    public PolicyResponseDto getPolicyDetails(Long policyId) {
        PolicyTempEntity policyTempEntity = new PolicyTempEntity();
        policyTempEntity = getPolicyDetails_policyRepository.findById(policyId);
        //map policyTempEntity to policyResponseDto
        PolicyResponseDto policyResponseDto = new PolicyResponseDto();
        return policyResponseDto;
    }
}

package com.lic.epgs.policy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.model.PolicyDto;
import com.lic.epgs.policy.model.PolicyResponseDto;
import com.lic.epgs.policy.service.SavePolicyDetails_policyService;
import com.lic.epgs.policy.service.GetPolicyDetails_policyService;

@RestController
public class PolicyController {

    @Autowired
    private SavePolicyDetails_policyService savePolicyDetails_policyService;

    @Autowired
    private GetPolicyDetails_policyService getPolicyDetails_policyService;

    @PostMapping("/policy/save")
    public PolicyResponseDto savePolicyDetails(@RequestBody PolicyDto policyDto) {
        return savePolicyDetails_policyService.savePolicyDetails(policyDto);
    }

    @GetMapping("/policy/{policyId}")
    public PolicyResponseDto getPolicyDetails(@PathVariable Long policyId) {
        return getPolicyDetails_policyService.getPolicyDetails(policyId);
    }

}