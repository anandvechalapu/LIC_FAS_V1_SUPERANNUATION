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

    public RegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        return regularAdjustmentContributionRepository.findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public void deleteByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        regularAdjustmentContributionRepository.deleteByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public void save(RegularAdjustmentContribution regularAdjustmentContribution) {
        regularAdjustmentContributionRepository.save(regularAdjustmentContribution);
    }

    public void createRegularAdjustmentContributionBatch(List<RegularAdjustmentContribution> regularAdjustmentContributions) {
        regularAdjustmentContributionRepository.saveAll(regularAdjustmentContributions);
    }

    public void populateSuccessDataSet(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        regularAdjustmentContributionRepository.populateSuccessDataSet(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public void populateFailedDataSet(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        regularAdjustmentContributionRepository.populateFailedDataSet(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public String generateErrorMessages(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        return regularAdjustmentContributionRepository.generateErrorMessages(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public String generateTransactionMessage(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        return regularAdjustmentContributionRepository.generateTransactionMessage(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public String generateTransactionStatus(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        return regularAdjustmentContributionRepository.generateTransactionStatus(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

}