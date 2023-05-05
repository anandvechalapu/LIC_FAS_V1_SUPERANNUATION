package com.lic.epgs.quotation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.service.QuotationService;

@RestController
@RequestMapping("/quotation")
public class QuotationController {
	
	@Autowired
	private QuotationService quotationService;
	
	@GetMapping("/{status}")
	public Optional<Quotation> getQuotationByStatus(@PathVariable String status) {
		return quotationService.getQuotationByStatus(status);
	}

}