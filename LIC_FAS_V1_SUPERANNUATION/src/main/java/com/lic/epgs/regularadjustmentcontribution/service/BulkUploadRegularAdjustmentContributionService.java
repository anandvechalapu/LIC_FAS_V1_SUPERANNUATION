package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.repository.BulkUploadRegularAdjustmentContributionRepository;

@Service
public class BulkUploadRegularAdjustmentContributionService {

	@Autowired
	BulkUploadRegularAdjustmentContributionRepository bulkUploadRegularAdjustmentContributionRepository;
	
	public BulkUploadRegularAdjustmentContribution save(BulkUploadRegularAdjustmentContribution bulkUploadRegularAdjustmentContribution) {
		return bulkUploadRegularAdjustmentContributionRepository.save(bulkUploadRegularAdjustmentContribution);
	}
	
	public List<BulkUploadRegularAdjustmentContribution> findAll() {
		return bulkUploadRegularAdjustmentContributionRepository.findAll();
	}
	
	public Optional<BulkUploadRegularAdjustmentContribution> findById(Long id) {
		return bulkUploadRegularAdjustmentContributionRepository.findById(id);
	}
	
	public void delete(Long id) {
		bulkUploadRegularAdjustmentContributionRepository.deleteById(id);
	}
	
	public BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndRegularContributionIdAndUnitCode(String masterPolicyId, String temporaryPolicyId, String regularContributionId, String unitCode) {
		return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndTemporaryPolicyIdAndRegularContributionIdAndUnitCode(masterPolicyId, temporaryPolicyId, regularContributionId, unitCode);
	}
	
	public BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId) {
		return bulkUploadRegularAdjustmentContributionRepository.findByRegularContributionId(regularContributionId);
	}
	
	public BulkUploadRegularAdjustmentContribution findByCreatedBy(String createdBy) {
		return bulkUploadRegularAdjustmentContributionRepository.findByCreatedBy(createdBy);
	}
	
	public BulkUploadRegularAdjustmentContribution findByFileName(String fileName) {
		return bulkUploadRegularAdjustmentContributionRepository.findByFileName(fileName);
	}
	
	public BulkUploadRegularAdjustmentContribution findByIsActive(Boolean isActive) {
		return bulkUploadRegularAdjustmentContributionRepository.findByIsActive(isActive);
	}
	
}