package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.entity.RegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.repository.RegularAdjustmentContributionRepository;

@Service
public class RegularAdjustmentContributionService {

    @Autowired
    private RegularAdjustmentContributionRepository regularAdjustmentContributionRepository;

    public List<RegularAdjustmentContribution> getAllAdjustmentContributions() {
        return regularAdjustmentContributionRepository.findAll();
    }

    public RegularAdjustmentContribution getAdjustmentContributionById(Long id) {
        return regularAdjustmentContributionRepository.getOne(id);
    }

    public void saveAdjustmentContribution(RegularAdjustmentContribution regularAdjustmentContribution) {
        regularAdjustmentContributionRepository.save(regularAdjustmentContribution);
    }

    public void removeAdjustmentContributionBatch(Long batchId) {
        regularAdjustmentContributionRepository.removeAdjustmentContributionBatch(batchId);
    }

}