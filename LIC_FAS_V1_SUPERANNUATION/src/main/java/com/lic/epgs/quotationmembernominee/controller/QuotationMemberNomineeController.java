package com.lic.epgs.quotationmembernominee.controller;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNominee;
import com.lic.epgs.quotationmembernominee.service.QuotationMemberNomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "quotationMemberNominee")
public class QuotationMemberNomineeController {

    @Autowired
    QuotationMemberNomineeService quotationMemberNomineeService;

    @DeleteMapping(value = "/{nomineeId}")
    public void deleteQuotationMemberNominee(@PathVariable Long nomineeId) {
        quotationMemberNomineeService.deleteQuotationMemberNominee(nomineeId);
    }

    @PostMapping
    public QuotationMemberNominee saveQuotationMemberNominee(@RequestBody QuotationMemberNominee quotationMemberNominee) {
        return quotationMemberNomineeService.saveQuotationMemberNominee(quotationMemberNominee);
    }

}