package com.lic.epgs.quotationmemberaddress.controller;

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressDto;
import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.service.QuotationMemberAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotationMemberAddress")
public class QuotationMemberAddressController {

    @Autowired
    private QuotationMemberAddressService quotationMemberAddressService;

    @PostMapping("")
    public ResponseEntity<QuotationMemberAddressApiResponseDto> saveQuotationMemberAddress(@RequestBody QuotationMemberAddressDto quotationMemberAddressDto) {
        return new ResponseEntity<>(quotationMemberAddressService.saveQuotationMemberAddress(quotationMemberAddressDto), HttpStatus.CREATED);
    }

    @GetMapping("/{quotationMemberAddressId}/{quotationMemberId}")
    public ResponseEntity<QuotationMemberAddressApiResponseDto> getQuotationMemberAddress(@PathVariable("quotationMemberAddressId") Long quotationMemberAddressId,
                                                                                        @PathVariable("quotationMemberId") Long quotationMemberId) {
        return new ResponseEntity<>(quotationMemberAddressService.getQuotationMemberAddress(quotationMemberAddressId, quotationMemberId), HttpStatus.OK);
    }
}