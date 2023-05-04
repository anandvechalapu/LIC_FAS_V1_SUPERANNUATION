package com.lic.epgs.claim.repository;

import com.lic.epgs.claim.model.ClaimMbr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimMbrRepository extends JpaRepository<ClaimMbr, Long> {

    @Query(value = "SELECT * FROM claimmbr WHERE batch_id = :batchId and file_type = :fileType", nativeQuery = true)
    List<ClaimMbr> downloadClaimBulkRecords(@Param("batchId") String batchId, @Param("fileType") String fileType);

}