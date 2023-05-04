package com.lic.epgs.claim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.claim.model.BatchDetailDto;
import com.lic.epgs.claim.service.GetAllBathesClaimService;

@RestController
@RequestMapping("/claim")
public class GetAllBathesClaimController {
	
	@Autowired
	private GetAllBathesClaimService getAllBathesClaimService;
	
	@GetMapping("/batches")
	public List<BatchDetailDto> getAllBathes(){
		return getAllBathesClaimService.getAllBathes();
	}

}