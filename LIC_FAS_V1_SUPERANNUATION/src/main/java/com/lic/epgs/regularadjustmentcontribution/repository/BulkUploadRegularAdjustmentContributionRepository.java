package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;

@Repository
public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<BulkUploadRegularAdjustmentContribution, Long> {
	
	BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName);
	
	BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId);
	
	BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndUnitCode(String masterPolicyId, String unitCode);
	
	BulkUploadRegularAdjustmentContribution findByLicIdsAndMasterPolicyIdAndExistingClaims(String licIds, String masterPolicyId, String existingClaims);
	
	BulkUploadRegularAdjustmentContribution findBySuccessDataSetAndFailedDataSetAndErrorMessagesAndTransactionMessageAndTransactionStatus(String successDataSet, String failedDataSet, String errorMessages, String transactionMessage, String transactionStatus);
	
}