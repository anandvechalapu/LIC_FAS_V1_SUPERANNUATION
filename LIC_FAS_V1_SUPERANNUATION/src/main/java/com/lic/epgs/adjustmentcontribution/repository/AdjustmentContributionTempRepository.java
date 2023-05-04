package com.lic.epgs.adjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.adjustmentcontribution.entity.AdjustmentContributionTempEntity;

@Repository
public interface AdjustmentContributionTempRepository extends JpaRepository<AdjustmentContributionTempEntity, Long> {

    AdjustmentContributionTempEntity findByBatchIdAndIsActiveTrue(String batchId);

}