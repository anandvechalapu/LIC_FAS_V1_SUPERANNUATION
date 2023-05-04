package com.lic.epgs.adjustmentcontribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionTempEntity;
import com.lic.epgs.adjustmentcontribution.service.AdjustmentContributionTempService;

@RestController
public class AdjustmentContributionTempController {
  
  @Autowired
  private AdjustmentContributionTempService adjustmentContributionTempService;
  
  @GetMapping("/adjustment-contribution-temp/{batchId}")
  public AdjustmentContributionTempEntity getAdjustmentContributionTemp(@PathVariable String batchId) {
    return adjustmentContributionTempService.findByBatchIdAndIsActiveTrue(batchId).orElse(null);
  }
  
  @PutMapping("/adjustment-contribution-temp/{batchId}/delete")
  public void deleteAdjustmentContributionTemp(@PathVariable String batchId) {
    adjustmentContributionTempService.deleteByBatchIdAndIsActiveTrue(batchId);
  }
  
  @PutMapping("/adjustment-contribution-temp/{batchId}/update")
  public void updateAdjustmentContributionTemp(@PathVariable String batchId, @RequestParam Double totalContribution, @RequestParam Double employeeContribution, @RequestParam Double employerContribution, @RequestParam Double voluntaryContribution) {
    adjustmentContributionTempService.updateTotalContributionAndEmployeeContributionAndEmployerContributionAndVoluntaryContributionByBatchIdAndIsActiveTrue(batchId, totalContribution, employeeContribution, employerContribution, voluntaryContribution);
  }
  
  @PutMapping("/adjustment-contribution-temp/{batchId}/status")
  public void updateAdjustmentContributionTempStatus(@PathVariable String batchId, @RequestParam Boolean isActive) {
    adjustmentContributionTempService.updateIsActiveByBatchIdAndIsActiveTrue(batchId, isActive);
  }
  
}