package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularadjustmentcontribution;
import com.lic.epgs.regularadjustmentcontribution.repository.BulkUploadRegularadjustmentcontributionRepository;

@Service
public class BulkUploadRegularadjustmentcontributionService {

	@Autowired
	private BulkUploadRegularadjustmentcontributionRepository bulkUploadRegularadjustmentcontributionRepository;

	public List<BulkUploadRegularadjustmentcontribution> findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode(
			String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId,
			String unitCode) {
		return bulkUploadRegularadjustmentcontributionRepository
				.findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode(masterPolicyId,
						temporaryPolicyId, createdBy, regularContributionId, unitCode);
	}

	public List<BulkUploadRegularadjustmentcontribution> findByLicIdsAndMasterPolicyIdAndUnitCode(List<String> licIds,
			String masterPolicyId, String unitCode) {
		return bulkUploadRegularadjustmentcontributionRepository
				.findByLicIdsAndMasterPolicyIdAndUnitCode(licIds, masterPolicyId, unitCode);
	}

	public List<BulkUploadRegularadjustmentcontribution> findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn(
			List<String> licIds, String masterPolicyId, String unitCode, List<String> status) {
		return bulkUploadRegularadjustmentcontributionRepository
				.findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn(licIds, masterPolicyId, unitCode, status);
	}

	public BulkUploadRegularadjustmentcontribution findByRegularContributionId(String regularContributionId) {
		return bulkUploadRegularadjustmentcontributionRepository.findByRegularContributionId(regularContributionId);
	}

	public List<BulkUploadRegularadjustmentcontribution> findByBatchId(String batchId) {
		return bulkUploadRegularadjustmentcontributionRepository.findByBatchId(batchId);
	}

}