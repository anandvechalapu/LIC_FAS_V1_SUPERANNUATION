package com.lic.epgs.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.ClaimApproverActions;
import com.lic.epgs.common.repository.ClaimApproverActionsRepository;

@Service
public class ClaimApproverActionsService {
	
	@Autowired
	private ClaimApproverActionsRepository claimApproverActionsRepository;
	
	public List<ClaimApproverActions> findAll() {
		return claimApproverActionsRepository.findAll();
	}
	
	public Optional<ClaimApproverActions> findById(Long id) {
		return claimApproverActionsRepository.findById(id);
	}
	
	public Optional<ClaimApproverActions> findByCode(String code) {
		return claimApproverActionsRepository.findByCode(code);
	}
	
	public Optional<ClaimApproverActions> findByDescription(String description) {
		return claimApproverActionsRepository.findByDescription(description);
	}
	
	public Optional<ClaimApproverActions> findByIsMandatory(String isMandatory) {
		return claimApproverActionsRepository.findByIsMandatory(isMandatory);
	}
	
	public Optional<ClaimApproverActions> findByStatus(String status) {
		return claimApproverActionsRepository.findByStatus(status);
	}
	
	public List<ClaimApproverActions> findByIsMandatoryAndStatus(String isMandatory, String status) {
		return claimApproverActionsRepository.findByIsMandatoryAndStatus(isMandatory, status);
	}

}