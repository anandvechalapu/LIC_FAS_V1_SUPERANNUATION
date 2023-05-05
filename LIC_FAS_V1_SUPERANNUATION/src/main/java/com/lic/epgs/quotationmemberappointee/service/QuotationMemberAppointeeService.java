package com.lic.epgs.quotationmemberappointee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmemberappointee.QuotationMemberAppointeeTempEntity;
import com.lic.epgs.quotationmemberappointee.repository.QuotationMemberAppointeeRepository;

@Service
public class QuotationMemberAppointeeService {

    @Autowired
    private QuotationMemberAppointeeRepository quotationMemberAppointeeRepository;

    public void deleteQuotationMemberAppointee(Long appointeeId) {
        quotationMemberAppointeeRepository.deleteQuotationMemberAppointee(appointeeId);
    }

    public QuotationMemberAppointeeTempEntity saveQuotationMemberAppointee(QuotationMemberAppointeeTempEntity quotationMemberAppointeeTempEntity) {
        return quotationMemberAppointeeRepository.save(quotationMemberAppointeeTempEntity);
    }

}