package com.lic.epgs.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.claim.model.ClaimMbr;

@Repository
public interface ClaimMbrRepository extends JpaRepository<ClaimMbr, Long> {

	@Query("SELECT mbr FROM ClaimMbr mbr WHERE mbr.masterPolicyNo = ?1")
	List<ClaimMbr> getBatchAssociateData(String masterPolicyNo);

}

package com.lic.epgs.claim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.claim.model.ClaimMbr;
import com.lic.epgs.claim.service.ClaimMbrService;

@RestController
@RequestMapping("/claimMbr")
public class ClaimMbrController {
	
	@Autowired
	private ClaimMbrService claimMbrService;
	
	@GetMapping("/{masterPolicyNo}")
	public List<ClaimMbr> getBatchAssociateData(@PathVariable String masterPolicyNo) {
		return claimMbrService.getBatchAssociateData(masterPolicyNo);
	}

}