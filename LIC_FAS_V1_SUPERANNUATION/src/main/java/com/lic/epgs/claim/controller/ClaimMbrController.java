package com.lic.epgs.claim.controller;

import com.lic.epgs.claim.model.ClaimMbr;
import com.lic.epgs.claim.service.ClaimMbrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/claim-mbr")
public class ClaimMbrController {

    @Autowired
    private ClaimMbrService claimMbrService;

    @GetMapping("/download/{batchId}/{fileType}")
    public List<ClaimMbr> downloadClaimBulkRecords(@PathVariable String batchId,
                                                   @PathVariable String fileType) {
        return claimMbrService.downloadClaimBulkRecords(batchId, fileType);
    }
}