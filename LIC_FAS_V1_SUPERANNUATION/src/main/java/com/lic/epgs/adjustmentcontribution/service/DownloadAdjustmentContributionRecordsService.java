package com.lic.epgs.adjustmentcontribution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionRecord;
import com.lic.epgs.adjustmentcontribution.repository.DownloadAdjustmentContributionRecordsRepository;

@Service
public class DownloadAdjustmentContributionRecordsService {

    @Autowired
    private DownloadAdjustmentContributionRecordsRepository downloadAdjustmentContributionRecordsRepository;

    // Service method to download adjustment contribution records based on batch ID and file type in CSV format
    public AdjustmentContributionRecord downloadAdjustmentContributionRecordsByBatchIdAndFileType(String batchId, String fileType) {
        return downloadAdjustmentContributionRecordsRepository.downloadAdjustmentContributionRecordsByBatchIdAndFileType(batchId, fileType);
    }
}