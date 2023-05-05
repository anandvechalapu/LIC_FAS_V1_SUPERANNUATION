package com.lic.epgs.quotationmemberbankdetail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.service.QuotationMemberBankDetailService;

@RestController
@RequestMapping("/api/quotationmemberbankdetails")
public class QuotationMemberBankDetailController {
	
	@Autowired
	private QuotationMemberBankDetailService quotationMemberBankDetailService;
	
	@GetMapping("/")
	public List<QuotationMemberBankDetail> getAllQuotationMemberBankDetails(){
		return quotationMemberBankDetailService.getAllQuotationMemberBankDetails();
	}
	
	@GetMapping("/{bankId}")
	public Optional<QuotationMemberBankDetail> getQuotationMemberBankDetailById(@PathVariable Long bankId){
		return quotationMemberBankDetailService.getQuotationMemberBankDetailById(bankId);
	}
	
	@PostMapping("/")
	public QuotationMemberBankDetail saveQuotationMemberBankDetail(@RequestBody QuotationMemberBankDetail quotationMemberBankDetail) {
		return quotationMemberBankDetailService.saveQuotationMemberBankDetail(quotationMemberBankDetail);
	}
	
	@PutMapping("/{bankId}")
	public QuotationMemberBankDetail updateQuotationMemberBankDetail(@RequestBody QuotationMemberBankDetail quotationMemberBankDetail, @PathVariable Long bankId) {
		quotationMemberBankDetail.setBankId(bankId);
		return quotationMemberBankDetailService.saveQuotationMemberBankDetail(quotationMemberBankDetail);
	}
	
	@DeleteMapping("/{bankId}")
	public void deleteQuotationMemberBankDetailById(@PathVariable Long bankId) {
		quotationMemberBankDetailService.deleteQuotationMemberBankDetailById(bankId);
	}

}