package com.lic.epgs.quotationmemberbankdetail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.repository.GetQuotationMemberBankDetailsRepository;

@Service
public class QuotationMemberBankDetailService {

	@Autowired
	private GetQuotationMemberBankDetailsRepository repository;
	
	public Optional<QuotationMemberBankDetail> getQuotationMemberBankDetail(Long quotationMemberId){
		return repository.findByQuotationMemberId(quotationMemberId);
	}

}