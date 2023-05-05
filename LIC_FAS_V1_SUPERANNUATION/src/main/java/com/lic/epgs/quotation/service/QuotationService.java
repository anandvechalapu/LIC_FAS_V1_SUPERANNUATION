package com.lic.epgs.quotation.service;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationDto;
import com.lic.epgs.quotation.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuotationService {

    @Autowired
    private QuotationRepository quotationRepository;

    public QuotationApiResponseDto saveQuotation(QuotationDto quotationDto) {
        return quotationRepository.saveQuotation(quotationDto);
    }

    public boolean isActivePolicy(String proposalNumber) {
        return quotationRepository.isActivePolicy(proposalNumber);
    }

    public boolean isMaxLimitExceeded(String quotationNumber) {
        return quotationRepository.isMaxLimitExceeded(quotationNumber);
    }

    public Optional<QuotationDto> findById(Long id) {
        return quotationRepository.findById(id);
    }

}