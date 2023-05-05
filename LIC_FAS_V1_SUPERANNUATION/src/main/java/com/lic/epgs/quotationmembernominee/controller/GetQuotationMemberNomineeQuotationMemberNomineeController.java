package com.lic.epgs.quotationmembernominee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNomineeApiResponseDto;
import com.lic.epgs.quotationmembernominee.service.GetQuotationMemberNomineeQuotationMemberNomineeControllerService;

@RestController
public class GetQuotationMemberNomineeQuotationMemberNomineeController {
	
	@Autowired
	private GetQuotationMemberNomineeQuotationMemberNomineeControllerService getQuotationMemberNomineeQuotationMemberNomineeControllerService;
	
	@GetMapping("/quotationMemberNominee/{memberId}/{nomineeId}")
	public Optional<QuotationMemberNomineeApiResponseDto> findByMemberIdAndNomineeId(@PathVariable Long memberId, @PathVariable Long nomineeId){
		return getQuotationMemberNomineeQuotationMemberNomineeControllerService.findByMemberIdAndNomineeId(memberId, nomineeId);
	}
}