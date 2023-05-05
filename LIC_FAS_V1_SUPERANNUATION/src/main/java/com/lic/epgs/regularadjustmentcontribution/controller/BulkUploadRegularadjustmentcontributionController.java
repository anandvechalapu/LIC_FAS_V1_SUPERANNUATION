package com.lic.epgs.regularadjustmentcontribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularadjustmentcontribution;
import com.lic.epgs.regularadjustmentcontribution.service.BulkUploadRegularadjustmentcontributionService;

@RestController
public class BulkUploadRegularadjustmentcontributionController {

	@Autowired
	private BulkUploadRegularadjustmentcontributionService bulkUploadRegularadjustmentcontributionService;

	@GetMapping("/findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode")
	public ResponseEntity<List<BulkUploadRegularadjustmentcontribution>> findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode(
			@RequestParam String masterPolicyId, @RequestParam String temporaryPolicyId,
			@RequestParam String createdBy, @RequestParam String regularContributionId,
			@RequestParam String unitCode) {
		return new ResponseEntity<>(
				bulkUploadRegularadjustmentcontributionService
						.findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCode(
								masterPolicyId, temporaryPolicyId, createdBy, regularContributionId, unitCode),
				HttpStatus.OK);
	}

	@GetMapping("/findByLicIdsAndMasterPolicyIdAndUnitCode")
	public ResponseEntity<List<BulkUploadRegularadjustmentcontribution>> findByLicIdsAndMasterPolicyIdAndUnitCode(
			@RequestParam List<String> licIds, @RequestParam String masterPolicyId, @RequestParam String unitCode) {
		return new ResponseEntity<>(
				bulkUploadRegularadjustmentcontributionService.findByLicIdsAndMasterPolicyIdAndUnitCode(licIds,
						masterPolicyId, unitCode),
				HttpStatus.OK);
	}

	@GetMapping("/findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn")
	public ResponseEntity<List<BulkUploadRegularadjustmentcontribution>> findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn(
			@RequestParam List<String> licIds, @RequestParam String masterPolicyId, @RequestParam String unitCode,
			@RequestParam List<String> status) {
		return new ResponseEntity<>(
				bulkUploadRegularadjustmentcontributionService
						.findByLicIdsAndMasterPolicyIdAndUnitCodeAndStatusIn(licIds, masterPolicyId, unitCode, status),
				HttpStatus.OK);
	}

	@GetMapping("/findByRegularContributionId")
	public ResponseEntity<BulkUploadRegularadjustmentcontribution> findByRegularContributionId(
			@RequestParam String regularContributionId) {
		return new ResponseEntity<>(
				bulkUploadRegularadjustmentcontributionService.findByRegularContributionId(regularContributionId),
				HttpStatus.OK);
	}

	@GetMapping("/findByBatchId")
	public ResponseEntity<List<BulkUploadRegularadjustmentcontribution>> findByBatchId(@RequestParam String batchId) {
		return new ResponseEntity<>(
				bulkUploadRegularadjustmentcontributionService.findByBatchId(batchId), HttpStatus.OK);
	}

}