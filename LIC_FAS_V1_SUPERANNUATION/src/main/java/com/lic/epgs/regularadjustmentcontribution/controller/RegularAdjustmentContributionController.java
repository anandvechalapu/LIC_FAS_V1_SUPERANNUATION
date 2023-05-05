package com.lic.epgs.regularadjustmentcontribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.regularadjustmentcontribution.model.RegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.service.RegularAdjustmentContributionService;

@RestController
@RequestMapping("/regular-adjustment-contribution")
public class RegularAdjustmentContributionController {

    @Autowired
    private RegularAdjustmentContributionService regularAdjustmentContributionService;

    @GetMapping
    public List<RegularAdjustmentContribution> getAllRegularAdjustmentContributions() {
        return regularAdjustmentContributionService.getAllRegularAdjustmentContributions();
    }

    @GetMapping("/{masterPolicyId}")
    public RegularAdjustmentContribution findByMasterPolicyId(@PathVariable String masterPolicyId) {
        return regularAdjustmentContributionService.findByMasterPolicyId(masterPolicyId);
    }

    @GetMapping("/{temporaryPolicyId}")
    public RegularAdjustmentContribution findByTemporaryPolicyId(@PathVariable String temporaryPolicyId) {
        return regularAdjustmentContributionService.findByTemporaryPolicyId(temporaryPolicyId);
    }

    @GetMapping("/{createdBy}")
    public RegularAdjustmentContribution findByCreatedBy(@PathVariable String createdBy) {
        return regularAdjustmentContributionService.findByCreatedBy(createdBy);
    }

    @GetMapping("/{regularContributionId}")
    public RegularAdjustmentContribution findByRegularContributionId(@PathVariable String regularContributionId) {
        return regularAdjustmentContributionService.findByRegularContributionId(regularContributionId);
    }

    @GetMapping("/{unitCode}")
    public RegularAdjustmentContribution findByUnitCode(@PathVariable String unitCode) {
        return regularAdjustmentContributionService.findByUnitCode(unitCode);
    }

    @GetMapping("/{fileName}")
    public RegularAdjustmentContribution findByFileName(@PathVariable String fileName) {
        return regularAdjustmentContributionService.findByFileName(fileName);
    }

    @GetMapping("/{totalCount}")
    public RegularAdjustmentContribution findByTotalCount(@PathVariable int totalCount) {
        return regularAdjustmentContributionService.findByTotalCount(totalCount);
    }

    @GetMapping("/{isActive}")
    public RegularAdjustmentContribution findByIsActive(@PathVariable boolean isActive) {
        return regularAdjustmentContributionService.findByIsActive(isActive);
    }

    @GetMapping("/{createdOn}")
    public RegularAdjustmentContribution findByCreatedOn(@PathVariable String createdOn) {
        return regularAdjustmentContributionService.findByCreatedOn(createdOn);
    }

    @GetMapping("/{successCount}")
    public RegularAdjustmentContribution findBySuccessCount(@PathVariable int successCount) {
        return regularAdjustmentContributionService.findBySuccessCount(successCount);
    }

    @GetMapping("/{failedCount}")
    public RegularAdjustmentContribution findByFailedCount(@PathVariable int failedCount) {
        return regularAdjustmentContributionService.findByFailedCount(failedCount);
    }

    @GetMapping("/{errorMessages}")
    public RegularAdjustmentContribution findByErrorMessages(@PathVariable String errorMessages) {
        return regularAdjustmentContributionService.findByErrorMessages(errorMessages);
    }

    @GetMapping("/{transactionMessage}")
    public RegularAdjustmentContribution findByTransactionMessage(@PathVariable String transactionMessage) {
        return regularAdjustmentContributionService.findByTransactionMessage(transactionMessage);
    }

    @GetMapping("/{transactionStatus