package com.lic.epgs.common.controller;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.service.ClaimDocumentStatusCommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimDocumentStatusCommonController {

    @Autowired
    private ClaimDocumentStatusCommonService claimDocumentStatusCommonService;

    @GetMapping("/claim-document-status-common")
    public ResponseEntity<List<CommonExternalApiDto>> findAllActiveClaimDocumentStatuses() {
        List<CommonExternalApiDto> commonExternalApiDtos = claimDocumentStatusCommonService.findAllActiveClaimDocumentStatuses();
        return ResponseEntity.status(HttpStatus.OK).body(commonExternalApiDtos);
    }
}