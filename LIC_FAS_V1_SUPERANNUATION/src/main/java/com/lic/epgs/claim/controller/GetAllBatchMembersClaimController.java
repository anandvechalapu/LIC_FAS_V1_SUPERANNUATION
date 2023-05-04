package com.lic.epgs.claim.service;

import com.lic.epgs.claim.dto.ClaimSearchResponseDto;

public interface GetAllBatchMembersClaimService {
	
	public List<ClaimSearchResponseDto> getAllBatchMembers();

}

package com.lic.epgs.claim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.claim.dto.ClaimSearchResponseDto;
import com.lic.epgs.claim.service.GetAllBatchMembersClaimService;

@RestController
@RequestMapping("/claims")
public class GetAllBatchMembersClaimController {
	
	@Autowired
	private GetAllBatchMembersClaimService getAllBatchMembersClaimService;
	
	@GetMapping("/getAllBatchMembers")
	public List<ClaimSearchResponseDto> getAllBatchMembers(){
		return getAllBatchMembersClaimService.getAllBatchMembers();
	}

}