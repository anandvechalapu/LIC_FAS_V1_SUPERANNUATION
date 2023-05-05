package com.lic.epgs.quotation.repository;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto; 
import com.lic.epgs.quotation.dto.QuotationDto; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository 
public interface ActivateQuotationRepository extends JpaRepository<QuotationDto, Long> {

   QuotationApiResponseDto activateQuotation(QuotationDto quotationDto); 

}