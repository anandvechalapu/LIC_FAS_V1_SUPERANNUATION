package com.lic.epgs.common.controller;

import com.lic.epgs.common.dto.CommonExternalApiResponseDto;
import com.lic.epgs.common.service.CommonClaimMakerActionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonClaimMakerActionsController {

    @Autowired
    private CommonClaimMakerActionsService commonClaimMakerActionsService;

    @GetMapping("/claim-maker-actions")
    public CommonExternalApiResponseDto getClaimMakerActionsList() {
        return commonClaimMakerActionsService.getClaimMakerActionsList();
    }

}