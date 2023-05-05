package com.lic.epgs.quotationmemberaddress.service;

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressDto;
import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.entity.QuotationMemberAddressTempEntity;
import com.lic.epgs.quotationmemberaddress.repository.QuotationMemberAddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationMemberAddressService {

    @Autowired
    private QuotationMemberAddressRepository quotationMemberAddressRepository;

    @Autowired
    private ModelMapper modelMapper;

    public QuotationMemberAddressApiResponseDto saveQuotationMemberAddress(QuotationMemberAddressDto quotationMemberAddressDto) {
        return quotationMemberAddressRepository.saveQuotationMemberAddress(quotationMemberAddressDto);
    }

    public QuotationMemberAddressApiResponseDto getQuotationMemberAddress(Long quotationMemberAddressId, Long quotationMemberId) {
        return quotationMemberAddressRepository.getQuotationMemberAddress(quotationMemberAddressId, quotationMemberId);
    }

}