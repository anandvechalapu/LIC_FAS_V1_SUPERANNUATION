package com.lic.epgs.policy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.lic.epgs.policy.model.PolicyBankDto;
import com.lic.epgs.policy.model.PolicyBankTempEntity;
import com.lic.epgs.policy.model.PolicyResponseDto;
import com.lic.epgs.policy.repository.SaveBankDetails_policyRepository;

@Service
public class SaveBankDetails_policyService {

	@Autowired
	private SaveBankDetails_policyRepository saveBankDetails_policyRepository;

	public PolicyResponseDto saveBankDetails(PolicyBankDto policyBankDto) {

		Optional<PolicyBankTempEntity> policyBankTempEntity = saveBankDetails_policyRepository.findById(policyBankDto.getId());
		
		if (policyBankTempEntity.isPresent()) {
			PolicyBankTempEntity bankTempEntity = policyBankTempEntity.get();
			bankTempEntity.setBankAccountNumber(policyBankDto.getBankAccountNumber());
			bankTempEntity.setBankName(policyBankDto.getBankName());
			bankTempEntity.setIfscCode(policyBankDto.getIfscCode());
			bankTempEntity.setBankBranchAddress(policyBankDto.getBankBranchAddress());
			
			saveBankDetails_policyRepository.save(bankTempEntity);
			
			return new PolicyResponseDto(true, "Bank details updated successfully");
			
		} else {
			
			PolicyBankTempEntity bankTempEntity = new PolicyBankTempEntity();
			bankTempEntity.setBankAccountNumber(policyBankDto.getBankAccountNumber());
			bankTempEntity.setBankName(policyBankDto.getBankName());
			bankTempEntity.setIfscCode(policyBankDto.getIfscCode());
			bankTempEntity.setBankBranchAddress(policyBankDto.getBankBranchAddress());
			
			saveBankDetails_policyRepository.save(bankTempEntity);
			
			return new PolicyResponseDto(true, "Bank details saved successfully");
		}
	}

}