package com.lic.epgs.quotation.repository; 

import com.lic.epgs.quotation.dto.QuotationApiResponseDto; 
import com.lic.epgs.quotation.dto.QuotationDto; 

public interface ActivateQuotationRepository { 

  QuotationApiResponseDto activateQuotation(QuotationDto quotationDto); 

}

package com.lic.epgs.quotation.controller;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationDto;
import com.lic.epgs.quotation.service.ActivateQuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotationController {

    @Autowired
    ActivateQuotationService activateQuotationService;

    @PostMapping("/activateQuotation")
    public QuotationApiResponseDto activateQuotation(@RequestBody QuotationDto quotationDto) {
        return activateQuotationService.activateQuotation(quotationDto);
    }
}