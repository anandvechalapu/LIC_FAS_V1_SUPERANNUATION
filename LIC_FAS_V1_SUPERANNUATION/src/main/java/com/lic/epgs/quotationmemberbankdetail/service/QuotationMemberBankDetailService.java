package com.lic.epgs.quotationmemberbankdetail.service;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.repository.QuotationMemberBankDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationMemberBankDetailService {

    @Autowired
    private QuotationMemberBankDetailRepository quotationMemberBankDetailRepository;

    public QuotationMemberBankDetail findByBankIdAndQuotationMemberId(Long bankId, Long quotationMemberId) {
        return quotationMemberBankDetailRepository.findByBankIdAndQuotationMemberId(bankId, quotationMemberId);
    }
}