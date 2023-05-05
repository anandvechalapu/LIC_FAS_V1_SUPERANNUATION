package com.lic.epgs.quotation.controller;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.service.RemoveDocumentByremoveDocumentIdQuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @Autowired
    private RemoveDocumentByremoveDocumentIdQuotationService removeDocumentByremoveDocumentIdQuotationService;

    @GetMapping("/{docId}/{quotationId}")
    public Quotation findByDocIdAndQuotationIdAndIsActiveTrue(@PathVariable String docId, @PathVariable String quotationId) {
        return removeDocumentByremoveDocumentIdQuotationService.findByDocIdAndQuotationIdAndIsActiveTrue(docId, quotationId);
    }

    @PostMapping("/{quotationId}")
    public List<Quotation> findAllByQuotationIdAndIsActiveTrue(@PathVariable String quotationId){
        return removeDocumentByremoveDocumentIdQuotationService.findAllByQuotationIdAndIsActiveTrue(quotationId);
    }

}