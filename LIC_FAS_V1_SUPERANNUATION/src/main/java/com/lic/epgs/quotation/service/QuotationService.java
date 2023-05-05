package com.lic.epgs.quotation.service;

import com.lic.epgs.quotation.dto.CommonChallanDto;
import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.repository.QuotationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationService.class);

    @Autowired
    private QuotationRepository quotationRepository;

    public QuotationApiResponseDto getChellanNumber(CommonChallanDto commonChallanDto) {
        LOGGER.info("getChellanNumber method started");
        QuotationApiResponseDto response = quotationRepository.getChellanNumber(commonChallanDto);
        LOGGER.info("getChellanNumber method ended");
        return response;
    }
    
}