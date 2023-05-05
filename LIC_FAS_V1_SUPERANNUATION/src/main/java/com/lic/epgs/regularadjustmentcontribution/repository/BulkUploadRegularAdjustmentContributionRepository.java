package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;

@Repository
public interface BulkUploadRegularAdjustmentContributionRepository extends JpaRepository<BulkUploadRegularAdjustmentContribution, Long>  {
	
	@Query("SELECT b FROM BulkUploadRegularAdjustmentContribution b WHERE b.masterPolicyId = ?1 AND b.temporaryPolicyId = ?2 AND b.regularContributionId = ?3 AND b.unitCode = ?4")
	BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndRegularContributionIdAndUnitCode(String masterPolicyId, String temporaryPolicyId, String regularContributionId, String unitCode);
	
	@Query("SELECT b FROM BulkUploadRegularAdjustmentContribution b WHERE b.regularContributionId = ?1")
	BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId);
	
	@Query("SELECT b FROM BulkUploadRegularAdjustmentContribution b WHERE b.createdBy = ?1")
	BulkUploadRegularAdjustmentContribution findByCreatedBy(String createdBy);
	
	@Query("SELECT b FROM BulkUploadRegularAdjustmentContribution b WHERE b.fileName = ?1")
	BulkUploadRegularAdjustmentContribution findByFileName(String fileName);
	
	@Query("SELECT b FROM BulkUploadRegularAdjustmentContribution b WHERE b.isActive = ?1")
	BulkUploadRegularAdjustmentContribution findByIsActive(Boolean isActive);

}