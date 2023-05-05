package com.lic.epgs.regularadjustmentcontribution.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import com.lic.epgs.regularadjustmentcontribution.model.RegularAdjustmentContribution; 

@Repository
public interface RegularAdjustmentContributionRepository extends JpaRepository<RegularAdjustmentContribution, Long> {

    RegularAdjustmentContribution findByMasterPolicyId(String masterPolicyId);
    RegularAdjustmentContribution findByTemporaryPolicyId(String temporaryPolicyId);
    RegularAdjustmentContribution findByCreatedBy(String createdBy);
    RegularAdjustmentContribution findByRegularContributionId(String regularContributionId);
    RegularAdjustmentContribution findByUnitCode(String unitCode);
    RegularAdjustmentContribution findByFileName(String fileName);
    RegularAdjustmentContribution findByTotalCount(int totalCount);
    RegularAdjustmentContribution findByIsActive(boolean isActive);
    RegularAdjustmentContribution findByCreatedOn(String createdOn);
    RegularAdjustmentContribution findBySuccessCount(int successCount);
    RegularAdjustmentContribution findByFailedCount(int failedCount);
    RegularAdjustmentContribution findByErrorMessages(String errorMessages);
    RegularAdjustmentContribution findByTransactionMessage(String transactionMessage);
    RegularAdjustmentContribution findByTransactionStatus(String transactionStatus);
}