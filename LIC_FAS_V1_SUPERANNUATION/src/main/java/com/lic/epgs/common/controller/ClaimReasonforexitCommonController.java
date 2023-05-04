package com.lic.epgs.common.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.ClaimReasonforexitCommon;
import com.lic.epgs.common.service.ClaimReasonforexitCommonService;

@RestController
public class ClaimReasonforexitCommonController {
	
	@Autowired
	private ClaimReasonforexitCommonService claimReasonforexitCommonService;
	
	@GetMapping("/claimReasonforexitCommonOrderByCode")
	public List<ClaimReasonforexitCommon> findAllByOrderByCodeAsc(){
		return claimReasonforexitCommonService.findAllByOrderByCodeAsc();
	}
	
	@GetMapping("/claimReasonforexitCommon/{code}")
	public Optional<ClaimReasonforexitCommon> findByCode(@PathVariable String code){
		return claimReasonforexitCommonService.findByCode(code);
	}
	
	@GetMapping("/claimReasonforexitCommonByIsmandatoryTrueOrderByCode")
	public List<ClaimReasonforexitCommon> findAllByIsmandatoryTrueOrderByCodeAsc(){
		return claimReasonforexitCommonService.findAllByIsmandatoryTrueOrderByCodeAsc();
	}
	
	@GetMapping("/claimReasonforexitCommonByStatusTrueOrderByCode")
	public List<ClaimReasonforexitCommon> findAllByStatusTrueOrderByCodeAsc(){
		return claimReasonforexitCommonService.findAllByStatusTrueOrderByCodeAsc();
	}

}