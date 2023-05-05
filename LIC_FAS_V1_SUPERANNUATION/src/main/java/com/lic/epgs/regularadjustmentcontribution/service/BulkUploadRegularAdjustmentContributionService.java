package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;

import com.lic.epgs.regularadjustmentcontribution.model.RegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.repository.BulkUploadRegularAdjustmentContributionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BulkUploadRegularAdjustmentContributionService {

    @Autowired
    private BulkUploadRegularAdjustmentContributionRepository bulkUploadRegularAdjustmentContributionRepository;

    public List<RegularAdjustmentContribution> findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName) {
        return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public List<RegularAdjustmentContribution> findByMasterPolicyIdAndUnitCodeAndLICIdsIn(String masterPolicyId, String unitCode, List<Long> LICIds) {
        return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndUnitCodeAndLICIdsIn(masterPolicyId, unitCode, LICIds);
    }

    public List<RegularAdjustmentContribution> findByMasterPolicyIdAndUnitCodeAndClaimStatusIn(String masterPolicyId, String unitCode, List<String> claimStatus) {
        return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndUnitCodeAndClaimStatusIn(masterPolicyId, unitCode, claimStatus);
    }

    public List<RegularAdjustmentContribution> findByRegularContributionId(String regularContributionId) {
        return bulkUploadRegularAdjustmentContributionRepository.findByRegularContributionId(regularContributionId);
    }

    public List<RegularAdjustmentContribution> findBySuccessDataSetAndStatus(List<RegularAdjustmentContribution> successDataSet, String status) {
        return bulkUploadRegularAdjustmentContributionRepository.findBySuccessDataSetAndStatus(successDataSet, status);
    }

    public List<RegularAdjustmentContribution> findByFailedDataSetAndStatus(List<RegularAdjustmentContribution> failedDataSet, String status) {
        return bulkUploadRegularAdjustmentContributionRepository.findByFailedDataSetAndStatus(failedDataSet, status);
    }

    public RegularAdjustmentContribution save(RegularAdjustmentContribution regularAdjustmentContribution) {
        return bulkUploadRegularAdjustmentContributionRepository.save(regularAdjustmentContribution);
    }

}