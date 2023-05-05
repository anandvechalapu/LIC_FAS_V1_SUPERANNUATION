package com.lic.epgs.quotation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.entity.Quotation;
import com.lic.epgs.quotation.service.QuotationTempService;

@RestController
@RequestMapping("/quotation")
public class QuotationTempController {
    
    @Autowired
    private QuotationTempService quotationTempService;
    
    @GetMapping("/{id}")
    public Optional<Quotation> getQuotationById(@PathVariable("id") int id) {
        return quotationTempService.getQuotationById(id);
    }
    
    @PostMapping("/save")
    public Quotation saveQuotation(@RequestBody Quotation quotation) {
        return quotationTempService.saveQuotation(quotation);
    }
}