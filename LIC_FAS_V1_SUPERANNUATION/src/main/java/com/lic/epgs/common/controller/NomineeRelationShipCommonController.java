package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.NomineeRelationShipCommon;
import com.lic.epgs.common.service.NomineeRelationShipCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common/nominee-relation-ship")
public class NomineeRelationShipCommonController {

    @Autowired
    private NomineeRelationShipCommonService nomineeRelationShipCommonService;

    @GetMapping("/all")
    public ResponseEntity<List<NomineeRelationShipCommon>> getAllByStatusTrue(){
        List<NomineeRelationShipCommon> nomineeRelationShipCommonList = nomineeRelationShipCommonService.getAllByStatusTrue();
        return ResponseEntity.ok(nomineeRelationShipCommonList);
    }

}