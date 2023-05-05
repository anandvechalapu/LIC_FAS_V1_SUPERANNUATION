package com.lic.epgs.quotation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.entity.QuotationTempEntity;
import com.lic.epgs.quotation.service.QuotationTempService;

@RestController
@RequestMapping("/quotations")
public class QuotationTempController {

    @Autowired
    private QuotationTempService quotationTempService;

    @PostMapping("/save")
    public QuotationTempEntity saveQuotationTemp(@RequestBody QuotationTempEntity quotationTemp) {
        return quotationTempService.saveQuotationTemp(quotationTemp);
    }

    @GetMapping("/find/{quotationId}")
    public Optional<QuotationTempEntity> findByQuotationId(@PathVariable Integer quotationId) {
        return quotationTempService.findByQuotationId(quotationId);
    }

}