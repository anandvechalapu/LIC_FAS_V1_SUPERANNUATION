package com.lic.epgs.quotation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.entity.Quotation;
import com.lic.epgs.quotation.repository.QuotationTempRepository;

@Service
public class QuotationTempService {

    @Autowired
    private QuotationTempRepository quotationTempRepository;

    public Optional<Quotation> getQuotationById(int id) {
        return quotationTempRepository.findById(id);
    }

    public Quotation saveQuotation(Quotation quotation) {
        return quotationTempRepository.save(quotation);
    }
}