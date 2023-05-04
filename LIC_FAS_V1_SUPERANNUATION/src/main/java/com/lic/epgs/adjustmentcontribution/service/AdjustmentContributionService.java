package com.lic.epgs.adjustmentcontribution.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.adjustmentcontribution.entity.AdjustmentContributionTempEntity;
import com.lic.epgs.adjustmentcontribution.repository.AdjustmentContributionTempRepository;

@Service
public class AdjustmentContributionService {

    @Autowired
    private AdjustmentContributionTempRepository adjustmentContributionRepository;

    public Optional<AdjustmentContributionTempEntity> findByBatchIdAndIsActiveTrue(String batchId) {
        return adjustmentContributionRepository.findByBatchIdAndIsActiveTrue(batchId);
    }

}