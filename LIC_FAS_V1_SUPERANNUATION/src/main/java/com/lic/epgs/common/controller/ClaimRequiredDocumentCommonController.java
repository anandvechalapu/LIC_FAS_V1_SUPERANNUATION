package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.ClaimRequiredDocumentCommon;
import com.lic.epgs.common.service.ClaimRequiredDocumentCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimRequiredDocumentCommonController {

    @Autowired
    private ClaimRequiredDocumentCommonService claimRequiredDocumentCommonService;

    @GetMapping("/getClaimRequiredDocumentsByCodeAndIsmandatoryAndStatus")
    public List<ClaimRequiredDocumentCommon> getClaimRequiredDocumentsByCodeAndIsmandatoryAndStatus(@RequestParam String code, @RequestParam String ismandatory, @RequestParam String status) {
        return claimRequiredDocumentCommonService.getClaimRequiredDocumentsByCodeAndIsmandatoryAndStatus(code, ismandatory, status);
    }

}