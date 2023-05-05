package com.lic.epgs.quotationmemberaddress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.service.GetQuotationMemberAddressesService;

@RestController
public class QuotationMemberAddressController {
    
    @Autowired
    private GetQuotationMemberAddressesService getQuotationMemberAddressesService;
    
    @GetMapping("/quotation-member-addresses/{quotationMemberId}")
    public QuotationMemberAddressApiResponseDto getAll(@PathVariable Long quotationMemberId) {
        return getQuotationMemberAddressesService.getAll(quotationMemberId);
    }

}