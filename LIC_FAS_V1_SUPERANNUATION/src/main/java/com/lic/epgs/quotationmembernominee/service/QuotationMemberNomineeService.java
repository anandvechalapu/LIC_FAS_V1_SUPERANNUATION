package com.lic.epgs.quotationmembernominee.service;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNominee;
import com.lic.epgs.quotationmembernominee.repository.QuotationMemberNomineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationMemberNomineeService {

    @Autowired
    QuotationMemberNomineeRepository quotationMemberNomineeRepository;

    public void deleteQuotationMemberNominee(Long nomineeId) {
        quotationMemberNomineeRepository.deleteQuotationMemberNominee(nomineeId);
    }

    public QuotationMemberNominee saveQuotationMemberNominee(QuotationMemberNominee quotationMemberNominee) {
        return quotationMemberNomineeRepository.save(quotationMemberNominee);
    }

}