package com.lic.epgs.adjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionTempEntity;

@Repository
public interface AdjustmentContributionTempRepository extends JpaRepository<AdjustmentContributionTempEntity, Long> {

  AdjustmentContributionTempEntity findByBatchIdAndIsActiveTrue(String batchId);
  
  void deleteByBatchIdAndIsActiveTrue(String batchId);
  
  void updateTotalContributionAndEmployeeContributionAndEmployerContributionAndVoluntaryContributionByBatchIdAndIsActiveTrue(String batchId, Double totalContribution, Double employeeContribution, Double employerContribution, Double voluntaryContribution);
  
  void updateIsActiveByBatchIdAndIsActiveTrue(String batchId, Boolean isActive);
  
}