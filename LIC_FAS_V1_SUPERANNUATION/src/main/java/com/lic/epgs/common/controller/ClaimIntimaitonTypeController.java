package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.ClaimIntimaitonType;
import com.lic.epgs.common.service.ClaimIntimaitonTypeService;

@RestController
@RequestMapping("/claimIntimaitonTypes")
public class ClaimIntimaitonTypeController {
	
	@Autowired
	private ClaimIntimaitonTypeService claimIntimaitonTypeService;
	
	@GetMapping("/all")
	public List<ClaimIntimaitonType> getAllClaimIntimaitonTypes() {
		return claimIntimaitonTypeService.getAllClaimIntimaitonTypes();
	}
	
	@GetMapping("/{code}")
	public ClaimIntimaitonType getClaimIntimaitonTypeByCode(@PathVariable String code) {
		return claimIntimaitonTypeService.getClaimIntimaitonTypeByCode(code);
	}
	
	@GetMapping("/mandatory")
	public List<ClaimIntimaitonType> getMandatoryClaimIntimaitonTypes() {
		return claimIntimaitonTypeService.getMandatoryClaimIntimaitonTypes();
	}
	
	@GetMapping("/active")
	public List<ClaimIntimaitonType> getActiveClaimIntimaitonTypes() {
		return claimIntimaitonTypeService.getActiveClaimIntimaitonTypes();
	}
	
}