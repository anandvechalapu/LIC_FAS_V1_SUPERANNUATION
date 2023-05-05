package com.lic.epgs.quotationmemberaddress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressDto;
import com.lic.epgs.quotationmemberaddress.repository.GetQuotationMemberAddressesRepository;

@Service
public class GetQuotationMemberAddressesService {
    
    @Autowired
    private GetQuotationMemberAddressesRepository getQuotationMemberAddressesRepository;
    
    public QuotationMemberAddressApiResponseDto getAll(Long quotationMemberId) {
        
        List<QuotationMemberAddressDto> quotationMemberAddressDtos = getQuotationMemberAddressesRepository.getAll(quotationMemberId);
        
        QuotationMemberAddressApiResponseDto quotationMemberAddressApiResponseDto = new QuotationMemberAddressApiResponseDto();
        quotationMemberAddressApiResponseDto.setQuotationMemberAddressDtos(quotationMemberAddressDtos);
        return quotationMemberAddressApiResponseDto;
        
    }

}