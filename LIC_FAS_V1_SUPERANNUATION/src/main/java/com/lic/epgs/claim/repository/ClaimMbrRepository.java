package com.lic.epgs.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.claim.model.ClaimMbr;

@Repository
public interface ClaimMbrRepository extends JpaRepository<ClaimMbr, Long> {

	@Query("SELECT c FROM ClaimMbr c WHERE c.masterPolicyNo = :masterPolicyNo")
	public List<ClaimMbr> getBatchAssociateData(String masterPolicyNo);

}