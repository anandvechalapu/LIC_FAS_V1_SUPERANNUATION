//Spring Boot Controller Class
package com.lic.epgs.common.controller;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.entity.CommonStatusEntity;
import com.lic.epgs.common.service.CommonStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonStatusController {

    @Autowired
    private CommonStatusService commonStatusService;

    @GetMapping("/getCommonStatus")
    public CommonResponseDto getCommonStatus() {
        return commonStatusService.getCommonStatus();
    }

    @GetMapping("/findAll")
    public List<CommonStatusEntity> findAll() {
        return commonStatusService.findAll();
    }

}