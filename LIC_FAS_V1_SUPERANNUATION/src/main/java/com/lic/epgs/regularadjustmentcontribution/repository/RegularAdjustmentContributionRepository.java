package com.lic.epgs.regularadjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.regularadjustmentcontribution.entity.RegularAdjustmentContribution;

@Repository
public interface RegularAdjustmentContributionRepository extends JpaRepository<RegularAdjustmentContribution, Long> {

    @Query(value = "DELETE FROM regular_adjustment_contribution WHERE batch_id = ?1", nativeQuery = true)
    void removeAdjustmentContributionBatch(Long batchId);

}