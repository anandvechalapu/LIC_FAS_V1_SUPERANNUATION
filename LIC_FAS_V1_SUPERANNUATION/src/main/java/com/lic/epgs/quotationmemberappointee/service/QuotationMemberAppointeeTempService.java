package com.lic.epgs.quotationmemberappointee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.quotationmemberappointee.entity.QuotationMemberAppointeeTempEntity;
import com.lic.epgs.quotationmemberappointee.repository.QuotationMemberAppointeeTempRepository;

@Service
@Transactional
public class QuotationMemberAppointeeTempService {

	@Autowired
	private QuotationMemberAppointeeTempRepository quotationMemberAppointeeTempRepository;
	
	public Optional<QuotationMemberAppointeeTempEntity> findByAppointeeIdAndQuotationMemberId(Long appointeeId, Long quotationMemberId) {
		return quotationMemberAppointeeTempRepository.findByAppointeeIdAndQuotationMemberId(appointeeId, quotationMemberId);
	}

}