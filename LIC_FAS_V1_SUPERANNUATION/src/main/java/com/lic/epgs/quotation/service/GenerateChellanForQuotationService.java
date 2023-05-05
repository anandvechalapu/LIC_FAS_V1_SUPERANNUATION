package com.lic.epgs.quotation.service;

import com.lic.epgs.quotation.model.CommonChallanDto;
import com.lic.epgs.quotation.model.QuotationApiResponseDto;
import com.lic.epgs.quotation.repository.GenerateChellanForQuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateChellanForQuotationService {

    @Autowired
    private GenerateChellanForQuotationRepository generateChellanForQuotationRepository;

    public QuotationApiResponseDto generateChellanForQuotation(CommonChallanDto commonChallanDto) {
        return generateChellanForQuotationRepository.generateChellanForQuotation(commonChallanDto);
    }
}