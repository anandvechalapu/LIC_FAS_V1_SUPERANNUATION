package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.model.RegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.repository.RegularAdjustmentContributionRepository;

@Service
public class RegularAdjustmentContributionService {

    @Autowired
    private RegularAdjustmentContributionRepository regularAdjustmentContributionRepository;

    public List<RegularAdjustmentContribution> getAllRegularAdjustmentContributions() {
        return regularAdjustmentContributionRepository.findAll();
    }

    public RegularAdjustmentContribution findByMasterPolicyId(String masterPolicyId) {
        return regularAdjustmentContributionRepository.findByMasterPolicyId(masterPolicyId);
    }

    public RegularAdjustmentContribution findByTemporaryPolicyId(String temporaryPolicyId) {
        return regularAdjustmentContributionRepository.findByTemporaryPolicyId(temporaryPolicyId);
    }

    public RegularAdjustmentContribution findByCreatedBy(String createdBy) {
        return regularAdjustmentContributionRepository.findByCreatedBy(createdBy);
    }

    public RegularAdjustmentContribution findByRegularContributionId(String regularContributionId) {
        return regularAdjustmentContributionRepository.findByRegularContributionId(regularContributionId);
    }

    public RegularAdjustmentContribution findByUnitCode(String unitCode) {
        return regularAdjustmentContributionRepository.findByUnitCode(unitCode);
    }

    public RegularAdjustmentContribution findByFileName(String fileName) {
        return regularAdjustmentContributionRepository.findByFileName(fileName);
    }

    public RegularAdjustmentContribution findByTotalCount(int totalCount) {
        return regularAdjustmentContributionRepository.findByTotalCount(totalCount);
    }

    public RegularAdjustmentContribution findByIsActive(boolean isActive) {
        return regularAdjustmentContributionRepository.findByIsActive(isActive);
    }

    public RegularAdjustmentContribution findByCreatedOn(String createdOn) {
        return regularAdjustmentContributionRepository.findByCreatedOn(createdOn);
    }

    public RegularAdjustmentContribution findBySuccessCount(int successCount) {
        return regularAdjustmentContributionRepository.findBySuccessCount(successCount);
    }

    public RegularAdjustmentContribution findByFailedCount(int failedCount) {
        return regularAdjustmentContributionRepository.findByFailedCount(failedCount);
    }

    public RegularAdjustmentContribution findByErrorMessages(String errorMessages) {
        return regularAdjustmentContributionRepository.findByErrorMessages(errorMessages);
    }

    public RegularAdjustmentContribution findByTransactionMessage(String transactionMessage) {
        return regularAdjustmentContributionRepository.findByTransactionMessage(transactionMessage);
    }

    public RegularAdjustmentContribution findByTransactionStatus(String transactionStatus) {
        return regularAdjustmentContributionRepository.findByTransactionStatus(transactionStatus);
    }

}