package com.lic.epgs.quotation.controller;

import com.lic.epgs.quotation.model.CommonChallanDto;
import com.lic.epgs.quotation.model.QuotationApiResponseDto;
import com.lic.epgs.quotation.service.GenerateChellanForQuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateChellanForQuotationController {

    @Autowired
    private GenerateChellanForQuotationService generateChellanForQuotationService;

    @PostMapping("/generateChellanForQuotation")
    public QuotationApiResponseDto generateChellanForQuotation(@RequestBody CommonChallanDto commonChallanDto) {
      return generateChellanForQuotationService.generateChellanForQuotation(commonChallanDto);
    }
}