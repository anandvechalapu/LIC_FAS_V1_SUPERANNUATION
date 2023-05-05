@Repository
package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularadjustmentcontribution;

public interface BulkUploadRegularadjustmentcontributionRepository extends JpaRepository<BulkUploadRegularadjustmentcontribution, Integer> {
    
    public List<BulkUploadRegularadjustmentcontribution> findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode);

    public List<BulkUploadRegularadjustmentcontribution> findByLicIdsAndMasterPolicyIdAndUnitCode(List<String> licIds, String masterPolicyId, String unitCode);

    public List<BulkUploadRegularadjustmentcontribution> findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn(List<String> licIds, String masterPolicyId, String unitCode, List<String> status);

    public BulkUploadRegularadjustmentcontribution findByRegularContributionId(String regularContributionId);

    public List<BulkUploadRegularadjustmentcontribution> findByBatchId(String batchId);

}