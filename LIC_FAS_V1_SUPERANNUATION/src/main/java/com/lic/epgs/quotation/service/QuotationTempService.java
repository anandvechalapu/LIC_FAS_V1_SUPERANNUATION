package com.lic.epgs.quotation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.entity.QuotationTempEntity;
import com.lic.epgs.quotation.repository.QuotationTempRepository;

@Service
public class QuotationTempService {

    @Autowired
    private QuotationTempRepository quotationTempRepository;

    public QuotationTempEntity saveQuotationTemp(QuotationTempEntity quotationTemp) {
        return quotationTempRepository.save(quotationTemp);
    }

    public Optional<QuotationTempEntity> findByQuotationId(Integer quotationId) {
        return quotationTempRepository.findByQuotationId(quotationId);
    }

}