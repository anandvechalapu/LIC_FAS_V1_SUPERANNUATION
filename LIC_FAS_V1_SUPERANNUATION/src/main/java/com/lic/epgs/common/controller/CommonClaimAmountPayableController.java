package com.lic.epgs.common.controller;

import com.lic.epgs.common.entity.CommonClaimAmountPayableEntity;
import com.lic.epgs.common.service.CommonClaimAmountPayableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonClaimAmountPayableController {

    @Autowired
    private CommonClaimAmountPayableService commonClaimAmountPayableService;

    @GetMapping("/common/claim/amount/payable")
    public List<CommonClaimAmountPayableEntity> getAll(){
        return commonClaimAmountPayableService.retrieveAll();
    }

}