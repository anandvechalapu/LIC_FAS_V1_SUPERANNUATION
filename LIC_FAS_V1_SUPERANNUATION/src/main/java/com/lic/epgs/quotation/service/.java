package com.lic.epgs.quotation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.quotation.dto.QuotationDto;

public interface GetQuotationQuotationRepository {
    List<QuotationDto> findAllQuotations();
    
    void deleteByQuotationNumber(String quotationNumber);
    
    void updateQuotation(String quotationNumber, String proposalNumber, String unitCode);
    
    void createQuotation(String quotationNumber, String proposalNumber, String unitCode);
}