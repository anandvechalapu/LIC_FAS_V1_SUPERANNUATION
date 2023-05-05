package com.lic.epgs.quotationmemberappointee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberappointee.entity.QuotationMemberAppointeeTempEntity;
import com.lic.epgs.quotationmemberappointee.service.QuotationMemberAppointeeTempService;

@RestController
public class QuotationMemberAppointeeTempController {

	@Autowired
	private QuotationMemberAppointeeTempService quotationMemberAppointeeTempService;
	
	@GetMapping("/quotationmemberappointeetemp")
	public ResponseEntity<QuotationMemberAppointeeTempEntity> getQuotationMemberAppointeeTemp(@RequestParam Long appointeeId, @RequestParam Long quotationMemberId){
		Optional<QuotationMemberAppointeeTempEntity> quotationMemberAppointeeTemp = quotationMemberAppointeeTempService.findByAppointeeIdAndQuotationMemberId(appointeeId, quotationMemberId);
		if(quotationMemberAppointeeTemp.isPresent()) {
			return new ResponseEntity<QuotationMemberAppointeeTempEntity>(quotationMemberAppointeeTemp.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<QuotationMemberAppointeeTempEntity>(HttpStatus.NOT_FOUND);
		}
	}
	
}