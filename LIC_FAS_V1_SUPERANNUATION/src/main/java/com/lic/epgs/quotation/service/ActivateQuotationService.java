package com.lic.epgs.quotation.service; 

import com.lic.epgs.quotation.dto.QuotationApiResponseDto; 
import com.lic.epgs.quotation.dto.QuotationDto; 
import com.lic.epgs.quotation.repository.ActivateQuotationRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

@Service 
public class ActivateQuotationService { 
 
   @Autowired 
   ActivateQuotationRepository activateQuotationRepository; 
 
   public QuotationApiResponseDto activateQuotation(QuotationDto quotationDto){ 
      return activateQuotationRepository.activateQuotation(quotationDto); 
   } 

}