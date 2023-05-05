package com.lic.epgs.quotationmemberbankdetail.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.service.QuotationMemberBankDetailService;

@RestController
@RequestMapping("/quotationmemberbankdetails")
public class QuotationMemberBankDetailController {

	@Autowired
	private QuotationMemberBankDetailService service;
	
	@GetMapping("/{quotationMemberId}")
	public Optional<QuotationMemberBankDetail> getQuotationMemberBankDetail(@PathVariable Long quotationMemberId) {
		return service.getQuotationMemberBankDetail(quotationMemberId);
	}

}