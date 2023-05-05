package com.lic.epgs.quotationmemberappointee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmemberappointee.model.QuotationMemberAppointeeTempEntity;
import com.lic.epgs.quotationmemberappointee.service.QuotationMemberAppointeeService;

@RestController
@RequestMapping("/quotationMemberAppointee")
public class QuotationMemberAppointeeController {

    @Autowired
    private QuotationMemberAppointeeService quotationMemberAppointeeService;

    @DeleteMapping("/delete")
    public void deleteQuotationMemberAppointee(Long appointeeId) {
        quotationMemberAppointeeService.deleteQuotationMemberAppointee(appointeeId);
    }

    @PostMapping("/save")
    public QuotationMemberAppointeeTempEntity saveQuotationMemberAppointee(@RequestBody @Valid QuotationMemberAppointeeTempEntity quotationMemberAppointeeTempEntity) {
        return quotationMemberAppointeeService.saveQuotationMemberAppointee(quotationMemberAppointeeTempEntity);
    }

}