package com.lic.epgs.quotationmembernominee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNomineeApiResponseDto;
import com.lic.epgs.quotationmembernominee.repository.GetQuotationMemberNomineeQuotationMemberNomineeControllerRepository;

@Service
public class GetQuotationMemberNomineeQuotationMemberNomineeControllerService {
	
	@Autowired
	private GetQuotationMemberNomineeQuotationMemberNomineeControllerRepository getQuotationMemberNomineeQuotationMemberNomineeControllerRepository;
	
	public Optional<QuotationMemberNomineeApiResponseDto> findByMemberIdAndNomineeId(Long memberId, Long nomineeId){
		return getQuotationMemberNomineeQuotationMemberNomineeControllerRepository.findByMemberIdAndNomineeId(memberId, nomineeId);
	}

}