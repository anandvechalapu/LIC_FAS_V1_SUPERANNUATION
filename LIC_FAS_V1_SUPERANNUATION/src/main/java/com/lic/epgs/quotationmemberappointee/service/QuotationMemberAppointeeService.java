package com.lic.epgs.quotationmemberappointee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmemberappointee.model.QuotationMemberAppointee;
import com.lic.epgs.quotationmemberappointee.repository.QuotationMemberAppointeeRepository;

@Service
public class QuotationMemberAppointeeService {
	
	@Autowired
	private QuotationMemberAppointeeRepository quotationMemberAppointeeRepository;
	
	public List<QuotationMemberAppointee> getQuotationMemberAppointeesByQuotationMemberId(Long quotationMemberId) {
		return quotationMemberAppointeeRepository.getQuotationMemberAppointeesByQuotationMemberId(quotationMemberId);
	}

}