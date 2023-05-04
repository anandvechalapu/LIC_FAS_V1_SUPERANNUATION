package com.lic.epgs.claim.service;

import com.lic.epgs.claim.repository.SaveBulkMemberClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.claim.model.SaveBulkMemberClaim;

import java.util.List;

@Service
public class SaveBulkMemberClaimService {

	@Autowired
	private SaveBulkMemberClaimRepository saveBulkMemberClaimRepository;

	public SaveBulkMemberClaim findByPolicyIdAndCreatedByAndUnitCode(String policyId, String createdBy, String unitCode) {
		return saveBulkMemberClaimRepository.findByPolicyIdAndCreatedByAndUnitCode(policyId, createdBy, unitCode);
	}

	public List<SaveBulkMemberClaim> findByMembershipIdsAndPolicyId(List<String> membershipIds, String policyId) {
		return saveBulkMemberClaimRepository.findByMembershipIdsAndPolicyId(membershipIds, policyId);
	}

	public List<SaveBulkMemberClaim> findByMembershipIds(List<String> membershipIds) {
		return saveBulkMemberClaimRepository.findByMembershipIds(membershipIds);
	}

	public int updateSuccessCountAndFailureCountByBatchId(int successCount, int failureCount, String batchId) {
		return saveBulkMemberClaimRepository.updateSuccessCountAndFailureCountByBatchId(successCount, failureCount, batchId);
	}
 

}