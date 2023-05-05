package com.lic.epgs.quotation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.service.QuotationService;

@RestController
public class QuotationController {
	
	@Autowired
	private QuotationService quotationService;
	
	@GetMapping("/quotations/{proposalNumber}")
	public ResponseEntity<Quotation> getQuotationByProposalNumber(@PathVariable String proposalNumber){
		Optional<Quotation> quotation = quotationService.findByProposalNumber(proposalNumber);
		if(quotation.isPresent()) {
			return ResponseEntity.ok(quotation.get());
		}
		return ResponseEntity.notFound().build();
	}

}