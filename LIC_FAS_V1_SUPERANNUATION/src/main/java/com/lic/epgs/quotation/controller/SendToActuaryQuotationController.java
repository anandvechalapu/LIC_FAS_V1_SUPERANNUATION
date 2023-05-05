package com.lic.epgs.quotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationSearchDto;
import com.lic.epgs.quotation.service.SendToActuaryQuotationControllerService;

@RestController
@RequestMapping("/quotations")
public class SendToActuaryQuotationController {

	@Autowired
	private SendToActuaryQuotationControllerService sendToActuaryQuotationControllerService;

	@PutMapping("/updateStatus")
	public QuotationApiResponseDto updateQuotationStatus(@RequestBody QuotationSearchDto quotationSearchDto) {
		return sendToActuaryQuotationControllerService.updateQuotationStatus(quotationSearchDto.getQuotationNo(), quotationSearchDto.getUnitOffice(),
				quotationSearchDto.getQuotationStatus(), quotationSearchDto.getModifiedBy(), quotationSearchDto.getModifiedOn());
	}
}