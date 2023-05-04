package com.lic.epgs.adjustmentcontribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionRecord;

@Repository
public interface DownloadAdjustmentContributionRecordsRepository extends JpaRepository<AdjustmentContributionRecord, Long> {
 
    // Method to download adjustment contribution records based on batch ID and file type in CSV format
    public AdjustmentContributionRecord downloadAdjustmentContributionRecordsByBatchIdAndFileType(String batchId, String fileType);
}