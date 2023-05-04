package com.lic.epgs.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.claim.model.ClaimMbr;
import com.lic.epgs.claim.repository.ClaimMbrRepository;

@Service
public class ClaimMbrService {

	@Autowired
	private ClaimMbrRepository claimMbrRepository;
	
	public List<ClaimMbr> getBatchAssociateData(String masterPolicyNo) {
		return claimMbrRepository.getBatchAssociateData(masterPolicyNo);
	}

}