package com.lic.epgs.quotationmemberbankdetail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.repository.QuotationMemberBankDetailRepository;

@Service
public class QuotationMemberBankDetailService {
	
	@Autowired
	private QuotationMemberBankDetailRepository quotationMemberBankDetailRepository;
	
	public List<QuotationMemberBankDetail> getAllQuotationMemberBankDetails(){
		return quotationMemberBankDetailRepository.findAll();
	}
	
	public Optional<QuotationMemberBankDetail> getQuotationMemberBankDetailById(Long bankId){
		return quotationMemberBankDetailRepository.findById(bankId);
	}
	
	public QuotationMemberBankDetail saveQuotationMemberBankDetail(QuotationMemberBankDetail quotationMemberBankDetail) {
		return quotationMemberBankDetailRepository.save(quotationMemberBankDetail);
	}
	
	public void deleteQuotationMemberBankDetailById(Long bankId) {
		quotationMemberBankDetailRepository.deleteById(bankId);
	}

}