package com.lic.epgs.claim.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.model.TempClaimEntity;

@Repository
public class GetBatchAssociateDataRepository {

	@Autowired
	private TempClaimEntity tempClaimEntity;
	
	public ClaimResponseDto getBatchAssociateData(Long batchId) {
		ClaimResponseDto claimResponseDto = new ClaimResponseDto();
		claimResponseDto.setAssociateCode(tempClaimEntity.getAssociateCode());
		claimResponseDto.setAssociateId(tempClaimEntity.getAssociateId());
		claimResponseDto.setAssociateName(tempClaimEntity.getAssociateName());
		claimResponseDto.setAssociateStatus(tempClaimEntity.getAssociateStatus());
		claimResponseDto.setAssociateType(tempClaimEntity.getAssociateType());
		return claimResponseDto;
	}

}

package com.lic.epgs.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.service.GetBatchAssociateDataService;

@RestController
@RequestMapping("/claim")
public class ClaimController {

	@Autowired
	private GetBatchAssociateDataService getBatchAssociateDataService;
	
	@GetMapping("/{batchId}")
	public ClaimResponseDto getBatchAssociateData(@PathVariable Long batchId){
		return getBatchAssociateDataService.getBatchAssociateData(batchId);
	}
	
}