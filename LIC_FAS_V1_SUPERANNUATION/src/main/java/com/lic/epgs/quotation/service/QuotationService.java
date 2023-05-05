package com.lic.epgs.quotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.entity.CommonDocsTempEntity;
import com.lic.epgs.quotation.repository.QuotationRepository;

@Service
public class QuotationService {
    
    @Autowired
    QuotationRepository quotationRepository;
    
    public List<CommonDocsTempEntity> getDocumentDetails(Long quotationId) {
        return quotationRepository.getDocumentDetails(quotationId);
    }
}