package com.lic.epgs.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.entity.TempClaimEntity;

@Repository
public interface GetBatchAssociateDataRepository extends JpaRepository<TempClaimEntity, Long> {

    ClaimResponseDto getBatchAssociateData(Long batchId);

}