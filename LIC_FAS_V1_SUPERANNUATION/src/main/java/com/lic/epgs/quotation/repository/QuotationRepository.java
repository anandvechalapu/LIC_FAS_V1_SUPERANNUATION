package com.lic.epgs.quotation.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.lic.epgs.quotation.controller.QuotationController; 

@Repository 
public interface QuotationRepository extends JpaRepository<QuotationController, Long> { 
    
    void uploadDocument(); 
    
    void saveDocument(); 
    
    void logStartEndUploadDocument(); 
    
    void handleExceptionsGracefully(); 
    
    void returnAppropriateErrorMessage(); 

}