package com.lic.epgs.quotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.entity.CommonDocsTempEntity;
import com.lic.epgs.quotation.service.QuotationService;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @Autowired
    QuotationService quotationService;
    
    @GetMapping("/{quotationId}/document")
    public List<CommonDocsTempEntity> getDocumentDetails(@PathVariable Long quotationId) {
        return quotationService.getDocumentDetails(quotationId);
    }
    
}