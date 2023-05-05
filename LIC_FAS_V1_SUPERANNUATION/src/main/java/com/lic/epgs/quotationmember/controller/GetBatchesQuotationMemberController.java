package com.lic.epgs.quotationmember.controller;

import com.lic.epgs.quotationmember.model.Batch;
import com.lic.epgs.quotationmember.service.GetBatchesQuotationMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetBatchesQuotationMemberController {

    @Autowired
    GetBatchesQuotationMemberService getBatchesQuotationMemberService;

    @GetMapping("/getBatches")
    public List<Batch> getBatches(@RequestParam String quotationId) {
        return getBatchesQuotationMemberService.getBatches(quotationId);
    }

    @GetMapping("/getBatchDetails")
    public Batch getBatchDetails(@RequestParam String batchId) {
        return getBatchesQuotationMemberService.getBatchDetails(batchId);
    }
}