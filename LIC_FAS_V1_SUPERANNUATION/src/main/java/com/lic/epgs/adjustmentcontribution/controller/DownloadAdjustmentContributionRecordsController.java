package com.lic.epgs.adjustmentcontribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionRecord;
import com.lic.epgs.adjustmentcontribution.service.DownloadAdjustmentContributionRecordsService;

@RestController
@RequestMapping("/downloads")
public class DownloadAdjustmentContributionRecordsController {

    @Autowired
    private DownloadAdjustmentContributionRecordsService downloadAdjustmentContributionRecordsService;

    @GetMapping("/adjustmentContributionRecords")
    public ResponseEntity<AdjustmentContributionRecord> downloadAdjustmentContributionRecordsByBatchIdAndFileType(@RequestParam("batchId") String batchId, 
                                                                                                                @RequestParam("fileType") String fileType) {
        AdjustmentContributionRecord adjustmentContributionRecord = downloadAdjustmentContributionRecordsService.downloadAdjustmentContributionRecordsByBatchIdAndFileType(batchId, fileType);
        return ResponseEntity.ok(adjustmentContributionRecord);
    }

}