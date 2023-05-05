package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;

public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<BulkUploadRegularAdjustmentContribution, Long> {
 
    BulkUploadRegularAdjustmentContribution findByMasterPolicyId(String masterPolicyId);
    
    BulkUploadRegularAdjustmentContribution findByTemporaryPolicyId(String temporaryPolicyId);
    
    BulkUploadRegularAdjustmentContribution findByCreatedBy(String createdBy);
    
    BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId);
    
    BulkUploadRegularAdjustmentContribution findByUnitCode(String unitCode);
    
    BulkUploadRegularAdjustmentContribution findByFileName(String fileName);
    
    BulkUploadRegularAdjustmentContribution findByTotalCount(Integer totalCount);
    
    BulkUploadRegularAdjustmentContribution findByIsActive(Boolean isActive);
    
    BulkUploadRegularAdjustmentContribution findByCreatedOn(Long createdOn);
    
    BulkUploadRegularAdjustmentContribution findBySuccessCount(Integer successCount);
    
    BulkUploadRegularAdjustmentContribution findByFailedCount(Integer failedCount);
    
    BulkUploadRegularAdjustmentContribution findByTransactionMessage(String transactionMessage);
    
    BulkUploadRegularAdjustmentContribution findByTransactionStatus(String transactionStatus);
}