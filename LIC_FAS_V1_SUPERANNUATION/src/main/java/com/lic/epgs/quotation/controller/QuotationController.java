package com.lic.epgs.quotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.dto.QuotationDto;
import com.lic.epgs.quotation.service.GetQuotationQuotationRepository;

@RestController
@RequestMapping("/quotations")
public class QuotationController {
    
    @Autowired
    private GetQuotationQuotationRepository quotationRepository;
    
    @GetMapping
    public List<QuotationDto> getAllQuotations() {
        return quotationRepository.findAllQuotations();
    }
    
    @DeleteMapping("/{quotationNumber}")
    public void deleteQuotation(@PathVariable String quotationNumber) {
        quotationRepository.deleteByQuotationNumber(quotationNumber);
    }
    
    @PutMapping
    public void updateQuotation(@RequestBody QuotationDto quotationDto) {
        quotationRepository.updateQuotation(quotationDto.getQuotationNumber(), quotationDto.getProposalNumber(), quotationDto.getUnitCode());
    }
    
    @PostMapping
    public void createQuotation(@RequestBody QuotationDto quotationDto) {
        quotationRepository.createQuotation(quotationDto.getQuotationNumber(), quotationDto.getProposalNumber(), quotationDto.getUnitCode());
    }
}