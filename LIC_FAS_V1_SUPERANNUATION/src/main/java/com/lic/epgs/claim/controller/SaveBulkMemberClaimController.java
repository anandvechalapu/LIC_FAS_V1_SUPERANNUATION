package com.lic.epgs.claim.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.claim.model.SaveBulkMemberClaim;
import com.lic.epgs.claim.service.SaveBulkMemberClaimService;

@RestController
@RequestMapping("/claims")
public class SaveBulkMemberClaimController {

	@Autowired
	private SaveBulkMemberClaimService saveBulkMemberClaimService;

	@PostMapping(value = "/findByPolicyIdAndCreatedByAndUnitCode")
	public ResponseEntity<SaveBulkMemberClaim> findByPolicyIdAndCreatedByAndUnitCode(@Valid @RequestBody SaveBulkMemberClaim saveBulkMemberClaim) {

		SaveBulkMemberClaim claim = saveBulkMemberClaimService.findByPolicyIdAndCreatedByAndUnitCode(saveBulkMemberClaim.getPolicyId(),
				saveBulkMemberClaim.getCreatedBy(), saveBulkMemberClaim.getUnitCode());
		return new ResponseEntity<>(claim, HttpStatus.OK);
	}

	@PostMapping(value = "/findByMembershipIdsAndPolicyId")
	public ResponseEntity<List<SaveBulkMemberClaim>> findByMembershipIdsAndPolicyId(@Valid @RequestBody SaveBulkMemberClaim saveBulkMemberClaim) {

		List<SaveBulkMemberClaim> claimList = saveBulkMemberClaimService.findByMembershipIdsAndPolicyId(saveBulkMemberClaim.getMembershipIds(),
				saveBulkMemberClaim.getPolicyId());
		return new ResponseEntity<>(claimList, HttpStatus.OK);
	}

	@PostMapping(value = "/findByMembershipIds")
	public ResponseEntity<List<SaveBulkMemberClaim>> findByMembershipIds(@Valid @RequestBody SaveBulkMemberClaim saveBulkMemberClaim) {

		List<SaveBulkMemberClaim> claimList = saveBulkMemberClaimService.findByMembershipIds(saveBulkMemberClaim.getMembershipIds());
		return new ResponseEntity<>(claimList, HttpStatus.OK);
	}

	@PostMapping(value = "/updateSuccessCountAndFailureCountByBatchId")
	public ResponseEntity<Integer> updateSuccessCountAndFailureCountByBatchId(@Valid @RequestBody SaveBulkMemberClaim saveBulkMemberClaim) {

		int count = saveBulkMemberClaimService.updateSuccessCountAndFailureCountByBatchId(saveBulkMemberClaim.getSuccessCount(),
				saveBulkMemberClaim.getFailureCount(), saveBulkMemberClaim.getBatchId());
		return new ResponseEntity<>(count, HttpStatus.OK);
	}

}