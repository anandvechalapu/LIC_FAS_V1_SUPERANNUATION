package com.lic.epgs.quotationmember.controller;

import com.lic.epgs.quotationmember.model.QuotationMember;
import com.lic.epgs.quotationmember.service.RemoveQuotationMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotationMember")
public class QuotationMemberController {

    @Autowired
    private RemoveQuotationMemberService removeQuotationMemberService;

    @PostMapping("/removeQuotationMember")
    public void removeQuotationMember(@RequestBody QuotationMember quotationMember) {
        removeQuotationMemberService.removeQuotationMember(quotationMember.getBatchId(), quotationMember.getQuotationId());
    }

    @PostMapping("/calculateAndSaveUpdatedQuotation")
    public void calculateAndSaveUpdatedQuotation(@RequestBody QuotationMember quotationMember) {
        removeQuotationMemberService.calculateAndSaveUpdatedQuotation(quotationMember.getBatchId(), quotationMember.getQuotationId());
    }

    @PostMapping("/returnErrorMessage")
    public String returnErrorMessage(@RequestBody QuotationMember quotationMember) {
        return removeQuotationMemberService.returnErrorMessage(quotationMember.getBatchId(), quotationMember.getQuotationId());
    }
}