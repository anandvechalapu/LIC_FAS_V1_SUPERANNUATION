package com.lic.epgs.quotationmemberaddress.repository;

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressDto;
import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.entity.QuotationMemberAddressTempEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuotationMemberAddressRepository {

    @Autowired
    private QuotationMemberAddressTempRepository quotationMemberAddressTempRepository;

    @Autowired
    private ModelMapper modelMapper;

    public QuotationMemberAddressApiResponseDto saveQuotationMemberAddress(QuotationMemberAddressDto quotationMemberAddressDto) {
        QuotationMemberAddressTempEntity quotationMemberAddressTempEntity = modelMapper.map(quotationMemberAddressDto, QuotationMemberAddressTempEntity.class);
        QuotationMemberAddressTempEntity savedQuotationMemberAddressTempEntity = quotationMemberAddressTempRepository.save(quotationMemberAddressTempEntity);
        QuotationMemberAddressDto savedQuotationMemberAddressDto = modelMapper.map(savedQuotationMemberAddressTempEntity, QuotationMemberAddressDto.class);
        QuotationMemberAddressApiResponseDto quotationMemberAddressApiResponseDto = new QuotationMemberAddressApiResponseDto();
        if (savedQuotationMemberAddressTempEntity != null) {
            quotationMemberAddressApiResponseDto.setQuotationMemberAddressDto(savedQuotationMemberAddressDto);
            quotationMemberAddressApiResponseDto.setSuccess(true);
            quotationMemberAddressApiResponseDto.setMessage("success");
        } else {
            quotationMemberAddressApiResponseDto.setSuccess(false);
            quotationMemberAddressApiResponseDto.setMessage("error");
        }
        return quotationMemberAddressApiResponseDto;
    }

    public QuotationMemberAddressApiResponseDto getQuotationMemberAddress(Long quotationMemberAddressId, Long quotationMemberId) {
        QuotationMemberAddressTempEntity quotationMemberAddressTempEntity = quotationMemberAddressTempRepository.findByQuotationMemberAddressIdAndQuotationMemberId(quotationMemberAddressId, quotationMemberId);
        QuotationMemberAddressDto quotationMemberAddressDto = modelMapper.map(quotationMemberAddressTempEntity, QuotationMemberAddressDto.class);
        QuotationMemberAddressApiResponseDto quotationMemberAddressApiResponseDto = new QuotationMemberAddressApiResponseDto();
        if (quotationMemberAddressTempEntity != null) {
            quotationMemberAddressApiResponseDto.setQuotationMemberAddressDto(quotationMemberAddressDto);
            quotationMemberAddressApiResponseDto.setSuccess(true);
            quotationMemberAddressApiResponseDto.setMessage("success");
        } else {
            quotationMemberAddressApiResponseDto.setSuccess(false);
            quotationMemberAddressApiResponseDto.setMessage("error");
        }
        return quotationMemberAddressApiResponseDto;
    }
}