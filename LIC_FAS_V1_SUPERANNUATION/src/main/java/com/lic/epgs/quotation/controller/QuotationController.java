package com.lic.epgs.quotation.controller;

import com.lic.epgs.quotation.dto.CommonChallanDto;
import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.service.QuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotation")
public class QuotationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationController.class);

    @Autowired
    private QuotationService quotationService;

    @RequestMapping(value = "/getChellanNumber", method = RequestMethod.POST)
    public QuotationApiResponseDto getChellanNumber(@RequestBody CommonChallanDto commonChallanDto) {
        LOGGER.info("getChellanNumber method started");
        QuotationApiResponseDto response = quotationService.getChellanNumber(commonChallanDto);
        LOGGER.info("getChellanNumber method ended");
        return response;
    }
}