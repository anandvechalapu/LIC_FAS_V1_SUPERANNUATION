package com.lic.epgs.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.ClaimApproverActions;
import com.lic.epgs.common.service.ClaimApproverActionsService;

@RestController
@RequestMapping("/api/claimApproverActions")
public class ClaimApproverActionsController {
	
	@Autowired
	private ClaimApproverActionsService claimApproverActionsService;
	
	@GetMapping
	public Iterable<ClaimApproverActions> findAll() {
		return claimApproverActionsService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ClaimApproverActions> findById(@PathVariable Long id) {
		return claimApproverActionsService.findById(id);
	}
	
	@GetMapping("/code/{code}")
	public Optional<ClaimApproverActions> findByCode(@PathVariable String code) {
		return claimApproverActionsService.findByCode(code);
	}
	
	@GetMapping("/description/{description}")
	public Optional<ClaimApproverActions> findByDescription(@PathVariable String description) {
		return claimApproverActionsService.findByDescription(description);
	}
	
	@GetMapping("/isMandatory/{isMandatory}")
	public Optional<ClaimApproverActions> findByIsMandatory(@PathVariable String isMandatory) {
		return claimApproverActionsService.findByIsMandatory(isMandatory);
	}
	
	@GetMapping("/status/{status}")
	public Optional<ClaimApproverActions> findByStatus(@PathVariable String status) {
		return claimApproverActionsService.findByStatus(status);
	}
	
	@GetMapping("/isMandatory/{isMandatory}/status/{status}")
	public List<ClaimApproverActions> findByIsMandatoryAndStatus(@PathVariable String isMandatory, @PathVariable String status) {
		return claimApproverActionsService.findByIsMandatoryAndStatus(isMandatory, status);
	}

}