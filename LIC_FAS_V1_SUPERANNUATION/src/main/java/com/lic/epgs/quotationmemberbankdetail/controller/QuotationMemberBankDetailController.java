package com.lic.epgs.quotationmemberbankdetail.controller;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;
import com.lic.epgs.quotationmemberbankdetail.service.QuotationMemberBankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotationMemberBankDetail")
public class QuotationMemberBankDetailController {

    @Autowired
    private QuotationMemberBankDetailService quotationMemberBankDetailService;

    @GetMapping("/{bankId}/{quotationMemberId}")
    public QuotationMemberBankDetail findByBankIdAndQuotationMemberId(@PathVariable Long bankId, @PathVariable Long quotationMemberId) {
        return quotationMemberBankDetailService.findByBankIdAndQuotationMemberId(bankId, quotationMemberId);
    }

}