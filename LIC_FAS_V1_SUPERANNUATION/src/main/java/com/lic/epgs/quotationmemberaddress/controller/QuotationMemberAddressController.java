package com.lic.epgs.quotationmemberaddress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberaddress.model.QuotationMemberAddress;
import com.lic.epgs.quotationmemberaddress.service.QuotationMemberAddressService;

@RestController
@RequestMapping("/quotationmemberaddress")
public class QuotationMemberAddressController {

	@Autowired
	private QuotationMemberAddressService quotationMemberAddressService;

	@PostMapping
	public ResponseEntity<QuotationMemberAddress> saveQuotationMemberAddress(
			@RequestBody QuotationMemberAddress quotationMemberAddress) {
		return new ResponseEntity<>(quotationMemberAddressService.saveQuotationMemberAddress(quotationMemberAddress),
				HttpStatus.OK);
	}

	@GetMapping("/{addressId}")
	public ResponseEntity<QuotationMemberAddress> getQuotationMemberAddress(@PathVariable Long addressId) {
		return new ResponseEntity<>(quotationMemberAddressService.getQuotationMemberAddress(addressId), HttpStatus.OK);
	}

	@DeleteMapping("/{addressId}")
	public ResponseEntity<?> deleteQuotationMemberAddress(@PathVariable Long addressId) {
		quotationMemberAddressService.deleteQuotationMemberAddress(addressId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}