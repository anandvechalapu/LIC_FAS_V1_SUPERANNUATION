package com.lic.epgs.quotation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.repository.QuotationRepository;

@Service
public class QuotationService {
	
	@Autowired
	private QuotationRepository quotationRepository;
	
	public Optional<Quotation> findByProposalNumber(String proposalNumber) {
		return quotationRepository.findByProposalNumber(proposalNumber);
	}

}