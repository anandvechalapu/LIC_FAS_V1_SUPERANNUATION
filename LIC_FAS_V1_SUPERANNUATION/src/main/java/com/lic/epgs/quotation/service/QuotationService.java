package com.lic.epgs.quotation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.repository.QuotationTempRepository;

@Service
public class QuotationService {
	
	@Autowired
	private QuotationTempRepository quotationTempRepository;

	public Optional<Quotation> getQuotationByStatus(String status) {
		return quotationTempRepository.findByStatus(status);
	}	

}