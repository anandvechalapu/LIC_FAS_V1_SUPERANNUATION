package com.lic.epgs.adjustmentcontribution.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.adjustmentcontribution.entity.AdjustmentContributionTempEntity;
import com.lic.epgs.adjustmentcontribution.service.AdjustmentContributionService;

@RestController
@RequestMapping("/adjustmentcontribution")
public class AdjustmentContributionController {

    @Autowired
    private AdjustmentContributionService adjustmentContributionService;
    
    @GetMapping("/get")
    public Optional<AdjustmentContributionTempEntity> getByBatchIdAndIsActiveTrue(@RequestParam("batchId") String batchId) {
        return adjustmentContributionService.findByBatchIdAndIsActiveTrue(batchId);
    }

}