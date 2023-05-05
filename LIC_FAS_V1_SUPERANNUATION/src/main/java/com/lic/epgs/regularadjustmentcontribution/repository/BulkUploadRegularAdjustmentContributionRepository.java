package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;

public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<BulkUploadRegularAdjustmentContribution, Long> {
    BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, 
    String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName);
    
    BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndUnitCodeAndFileName(String masterPolicyId, String unitCode, String fileName);
    
    BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId);
    
    BulkUploadRegularAdjustmentContribution findBySuccessDataSetContainingAndFailedDataSetContaining(String successDataSet, String failedDataSet);
    
    BulkUploadRegularAdjustmentContribution findByTransactionMessageAndTransactionStatus(String transactionMessage,String transactionStatus);
    
    BulkUploadRegularAdjustmentContribution findByErrorMessagesContaining(String errorMessages);
}