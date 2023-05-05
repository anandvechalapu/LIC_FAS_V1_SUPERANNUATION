package com.lic.epgs.quotation.service;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.repository.RemoveDocumentByremoveDocumentIdQuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoveDocumentByremoveDocumentIdQuotationService {

    @Autowired
    private RemoveDocumentByremoveDocumentIdQuotationRepository removeDocumentByremoveDocumentIdQuotationRepository;

    public Quotation findByDocIdAndQuotationIdAndIsActiveTrue(String docId, String quotationId){
        return removeDocumentByremoveDocumentIdQuotationRepository.findByDocIdAndQuotationIdAndIsActiveTrue(docId, quotationId);
    }

    public List<Quotation> findAllByQuotationIdAndIsActiveTrue(String quotationId){
        return removeDocumentByremoveDocumentIdQuotationRepository.findAllByQuotationIdAndIsActiveTrue(quotationId);
    }

}