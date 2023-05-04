package com.lic.epgs.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.claim.repository.GetAllBathesClaimRepository;

@Service
public class GetAllBathesClaimService {

	@Autowired
	private GetAllBathesClaimRepository getAllBathesClaimRepository;
	
	public List<BatchDetailDto> getAllBathes() {
		return getAllBathesClaimRepository.getAllBathes();
	}
	
	public BatchDetailDto convertEntityToDto(BatchEntity entity) {
		return getAllBathesClaimRepository.convertEntityToDto(entity);
	}

}