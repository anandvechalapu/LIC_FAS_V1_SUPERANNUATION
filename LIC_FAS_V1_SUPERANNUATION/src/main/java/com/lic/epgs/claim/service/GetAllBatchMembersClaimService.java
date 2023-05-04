package com.lic.epgs.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.claim.dto.ClaimSearchResponseDto;
import com.lic.epgs.claim.repository.GetAllBatchMembersClaimRepository;

@Service
public class GetAllBatchMembersClaimService {
	
	@Autowired
	private GetAllBatchMembersClaimRepository getAllBatchMembersClaimRepository;

	public List<ClaimSearchResponseDto> getAllBatchMembers() {
		return getAllBatchMembersClaimRepository.getAllBatchMembers();
	}

}