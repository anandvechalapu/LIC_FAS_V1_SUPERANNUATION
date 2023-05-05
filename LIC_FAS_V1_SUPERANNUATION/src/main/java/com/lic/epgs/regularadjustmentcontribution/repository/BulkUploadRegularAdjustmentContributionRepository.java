package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;

public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<BulkUploadRegularAdjustmentContribution, Long> {
    BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName);
    BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndLICIdsAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String LICIds, String createdBy, String regularContributionId, String unitCode, String fileName);
    BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndUnitCodeAndFileName(String masterPolicyId, String unitCode, String fileName);
    BulkUploadRegularAdjustmentContribution findByRegularContributionIdAndFileName(String regularContributionId, String fileName);
    BulkUploadRegularAdjustmentContribution findBySuccessDataAndFailedDataAndErrorMessagesAndTransactionMessageAndTransactionStatus(List<String> successData, List<String> failedData, List<String> errorMessages, String transactionMessage, String transactionStatus);
}