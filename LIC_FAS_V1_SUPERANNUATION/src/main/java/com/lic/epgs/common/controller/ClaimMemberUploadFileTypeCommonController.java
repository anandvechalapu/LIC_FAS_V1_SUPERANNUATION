package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.ClaimMemberUploadFileType;
import com.lic.epgs.common.service.ClaimMemberUploadFileTypeCommonService;

@RestController
@RequestMapping("/claimMemberUploadFileType")
public class ClaimMemberUploadFileTypeCommonController {

    @Autowired
    private ClaimMemberUploadFileTypeCommonService claimMemberUploadFileTypeCommonService;

    @GetMapping("/")
    public List<ClaimMemberUploadFileType> findAllByStatus() {
        return claimMemberUploadFileTypeCommonService.findAllByStatus();
    }

    @GetMapping("/{id}")
    public ClaimMemberUploadFileType findByIdAndStatus(@PathVariable Integer id) {
        return claimMemberUploadFileTypeCommonService.findByIdAndStatus(id);
    }

    @GetMapping("/code")
    public ClaimMemberUploadFileType findByCodeAndStatus(@RequestParam String code) {
        return claimMemberUploadFileTypeCommonService.findByCodeAndStatus(code);
    }

    @GetMapping("/description")
    public ClaimMemberUploadFileType findByDescriptionAndStatus(@RequestParam String description) {
        return claimMemberUploadFileTypeCommonService.findByDescriptionAndStatus(description);
    }

    @GetMapping("/isMandatory")
    public List<ClaimMemberUploadFileType> findAllByIsMandatoryAndStatus(@RequestParam Boolean isMandatory) {
        return claimMemberUploadFileTypeCommonService.findAllByIsMandatoryAndStatus(isMandatory);
    }
}