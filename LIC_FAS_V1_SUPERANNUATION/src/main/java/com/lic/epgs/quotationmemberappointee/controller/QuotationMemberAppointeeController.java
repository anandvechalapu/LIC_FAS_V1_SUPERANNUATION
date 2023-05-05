package com.lic.epgs.quotationmemberappointee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberappointee.model.QuotationMemberAppointee;
import com.lic.epgs.quotationmemberappointee.service.QuotationMemberAppointeeService;

@RestController
@RequestMapping("/quotationmemberappointee")
public class QuotationMemberAppointeeController {
	
	@Autowired
	private QuotationMemberAppointeeService quotationMemberAppointeeService;
	
	@GetMapping("/{quotationMemberId}")
	public List<QuotationMemberAppointee> getQuotationMemberAppointeesByQuotationMemberId(@PathVariable Long quotationMemberId) {
		return quotationMemberAppointeeService.getQuotationMemberAppointeesByQuotationMemberId(quotationMemberId);
	}

}