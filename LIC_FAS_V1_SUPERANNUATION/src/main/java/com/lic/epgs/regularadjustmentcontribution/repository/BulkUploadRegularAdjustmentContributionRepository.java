import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.regularadjustmentcontribution.model.RegularAdjustmentContribution;

public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<RegularAdjustmentContribution, Long> {

    List<RegularAdjustmentContribution> findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName);

    List<RegularAdjustmentContribution> findByMasterPolicyIdAndUnitCodeAndLICIdsIn(String masterPolicyId, String unitCode, List<Long> LICIds);

    List<RegularAdjustmentContribution> findByMasterPolicyIdAndUnitCodeAndClaimStatusIn(String masterPolicyId, String unitCode, List<String> claimStatus);

    List<RegularAdjustmentContribution> findByRegularContributionId(String regularContributionId);

    List<RegularAdjustmentContribution> findBySuccessDataSetAndStatus(List<RegularAdjustmentContribution> successDataSet, String status);

    List<RegularAdjustmentContribution> findByFailedDataSetAndStatus(List<RegularAdjustmentContribution> failedDataSet, String status);

    RegularAdjustmentContribution save(RegularAdjustmentContribution regularAdjustmentContribution);
    
}