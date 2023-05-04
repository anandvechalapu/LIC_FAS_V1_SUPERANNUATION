package com.lic.epgs.adjustmentcontribution.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionTempEntity;
import com.lic.epgs.adjustmentcontribution.repository.AdjustmentContributionTempRepository;

@Service
public class AdjustmentContributionTempService {
  
  @Autowired
  private AdjustmentContributionTempRepository adjustmentContributionTempRepository;
  
  public Optional<AdjustmentContributionTempEntity> findByBatchIdAndIsActiveTrue(String batchId) {
    return adjustmentContributionTempRepository.findByBatchIdAndIsActiveTrue(batchId);
  }
  
  public void deleteByBatchIdAndIsActiveTrue(String batchId) {
    adjustmentContributionTempRepository.deleteByBatchIdAndIsActiveTrue(batchId);
  }
  
  public void updateTotalContributionAndEmployeeContributionAndEmployerContributionAndVoluntaryContributionByBatchIdAndIsActiveTrue(String batchId, Double totalContribution, Double employeeContribution, Double employerContribution, Double voluntaryContribution) {
    adjustmentContributionTempRepository.updateTotalContributionAndEmployeeContributionAndEmployerContributionAndVoluntaryContributionByBatchIdAndIsActiveTrue(batchId, totalContribution, employeeContribution, employerContribution, voluntaryContribution);
  }
  
  public void updateIsActiveByBatchIdAndIsActiveTrue(String batchId, Boolean isActive) {
    adjustmentContributionTempRepository.updateIsActiveByBatchIdAndIsActiveTrue(batchId, isActive);
  }
  
}