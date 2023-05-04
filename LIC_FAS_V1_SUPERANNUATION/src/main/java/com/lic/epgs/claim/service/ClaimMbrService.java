package com.lic.epgs.claim.service;

import com.lic.epgs.claim.model.ClaimMbr;
import com.lic.epgs.claim.repository.ClaimMbrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimMbrService {

    @Autowired
    private ClaimMbrRepository claimMbrRepository;

    public List<ClaimMbr> downloadClaimBulkRecords(String batchId, String fileType) {
        return claimMbrRepository.downloadClaimBulkRecords(batchId, fileType);
    }
}