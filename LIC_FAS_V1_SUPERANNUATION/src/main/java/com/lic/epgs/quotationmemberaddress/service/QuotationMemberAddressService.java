package com.lic.epgs.quotationmemberaddress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.quotationmemberaddress.model.QuotationMemberAddress;
import com.lic.epgs.quotationmemberaddress.repository.QuotationMemberAddressRepository;

@Service
public class QuotationMemberAddressService {

	@Autowired
	private QuotationMemberAddressRepository quotationMemberAddressRepository;

	@Transactional
	public void deleteQuotationMemberAddress(Long addressId) {
		quotationMemberAddressRepository.deleteQuotationMemberAddress(addressId);
	}

	public QuotationMemberAddress saveQuotationMemberAddress(QuotationMemberAddress quotationMemberAddress) {
		return quotationMemberAddressRepository.save(quotationMemberAddress);
	}

	public QuotationMemberAddress getQuotationMemberAddress(Long addressId) {
		return quotationMemberAddressRepository.findById(addressId).orElse(null);
	}

}