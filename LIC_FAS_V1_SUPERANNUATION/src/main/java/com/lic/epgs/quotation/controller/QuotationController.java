package com.lic.epgs.quotation.controller; 

import com.lic.epgs.quotation.model.QuotationController; 
import com.lic.epgs.quotation.service.QuotationService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController 
@RequestMapping("/quotation") 
public class QuotationController { 

    @Autowired 
    private QuotationService quotationService; 

    @PostMapping("/upload") 
    public void uploadDocument(@RequestBody QuotationController quotationController) { 
        quotationService.uploadDocument(); 
    } 

    @PostMapping("/save") 
    public void saveDocument(@RequestBody QuotationController quotationController) { 
        quotationService.saveDocument(); 
    } 

    @PostMapping("/logStartEnd") 
    public void logStartEndUploadDocument(@RequestBody QuotationController quotationController) { 
        quotationService.logStartEndUploadDocument(); 
    } 

    @PostMapping("/handleExceptions") 
    public void handleExceptionsGracefully(@RequestBody QuotationController quotationController) { 
        quotationService.handleExceptionsGracefully(); 
    } 

    @PostMapping("/returnErrorMessage") 
    public void returnAppropriateErrorMessage(@RequestBody QuotationController quotationController) { 
        quotationService.returnAppropriateErrorMessage(); 
    } 

}