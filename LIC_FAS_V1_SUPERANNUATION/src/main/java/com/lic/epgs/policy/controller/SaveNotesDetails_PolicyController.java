package com.lic.epgs.policy.controller;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.service.SaveNotesDetails_PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveNotesDetails_PolicyController {

    @Autowired
    SaveNotesDetails_PolicyService saveNotesDetails_policyService;

    @PostMapping("/save-policy-notes")
    public PolicyResponseDto savePolicyNotes(@RequestParam Long policyId, @RequestParam String notes) {
        return saveNotesDetails_policyService.savePolicyNotes(policyId, notes);
    }
}