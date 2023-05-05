package com.lic.epgs.quotation.service;

import java.util.List;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationSearchDto;
import com.lic.epgs.quotation.entity.QuotationTempEntity;
import com.lic.epgs.quotation.repository.SendToActuaryQuotationControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendToActuaryQuotationControllerService {

	@Autowired
	private SendToActuaryQuotationControllerRepository sendToActuaryQuotationControllerRepository;

	public QuotationApiResponseDto updateQuotationStatus(String quotationNo, String unitOffice, String quotationStatus, String modifiedBy, String modifiedOn) {
		return sendToActuaryQuotationControllerRepository.updateQuotationStatus(quotationNo, unitOffice, quotationStatus, modifiedBy, modifiedOn);
	}

}