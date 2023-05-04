package com.lic.epgs.common.controller;

import com.lic.epgs.model.MaritalStatus;
import com.lic.epgs.common.service.CommonMaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/common/maritalstatus")
public class CommonMaritalStatusController {

    @Autowired
    private CommonMaritalStatusService commonMaritalStatusService;

    @GetMapping("/status")
    public List<MaritalStatus> findByStatus(@RequestParam boolean status) {
        return commonMaritalStatusService.findByStatus(status);
    }

    @GetMapping("/code")
    public Optional<MaritalStatus> findByCode(@RequestParam String code) {
        return commonMaritalStatusService.findByCode(code);
    }

}