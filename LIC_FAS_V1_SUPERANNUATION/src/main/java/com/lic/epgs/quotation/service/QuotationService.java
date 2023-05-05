package com.lic.epgs.quotation.service; 

import com.lic.epgs.quotation.controller.QuotationController; 
import com.lic.epgs.quotation.repository.QuotationRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

@Service 
public class QuotationService { 

    @Autowired 
    private QuotationRepository quotationRepository; 

    public void uploadDocument() { 
        quotationRepository.uploadDocument(); 
    } 

    public void saveDocument() { 
        quotationRepository.saveDocument(); 
    } 

    public void logStartEndUploadDocument() { 
        quotationRepository.logStartEndUploadDocument(); 
    } 

    public void handleExceptionsGracefully() { 
        quotationRepository.handleExceptionsGracefully(); 
    } 

    public void returnAppropriateErrorMessage() { 
        quotationRepository.returnAppropriateErrorMessage(); 
    } 

}