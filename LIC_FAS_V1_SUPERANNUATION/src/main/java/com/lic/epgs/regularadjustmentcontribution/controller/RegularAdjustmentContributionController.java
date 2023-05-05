package com.lic.epgs.regularadjustmentcontribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.regularadjustmentcontribution.entity.RegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.service.RegularAdjustmentContributionService;

@RestController
@RequestMapping("/regular-adjustment-contribution")
public class RegularAdjustmentContributionController {

    @Autowired
    private RegularAdjustmentContributionService regularAdjustmentContributionService;

    @GetMapping
    public List<RegularAdjustmentContribution> getAllAdjustmentContributions() {
        return regularAdjustmentContributionService.getAllAdjustmentContributions();
    }
    
    @GetMapping("/{id}")
    public RegularAdjustmentContribution getAdjustmentContributionById(@PathVariable Long id) {
        return regularAdjustmentContributionService.getAdjustmentContributionById(id);
    }

    @PostMapping
    public void saveAdjustmentContribution(@RequestBody RegularAdjustmentContribution regularAdjustmentContribution) {
        regularAdjustmentContributionService.saveAdjustmentContribution(regularAdjustmentContribution);
    }

    @GetMapping("/batch/{batchId}")
    public void removeAdjustmentContributionBatch(@PathVariable Long batchId) {
        regularAdjustmentContributionService.removeAdjustmentContributionBatch(batchId);
    }

}