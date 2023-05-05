package com.lic.epgs.quotation.model; 

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 

@Entity 
public class QuotationController { 
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id; 
    
    private String documentName; 
    
    private String documentType; 
    
    private String documentPath; 
    
    private String documentSize; 

    // Getters and Setters 

}