package com.lic.epgs.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.repository.GetBatchAssociateDataRepository;

@Service
public class GetBatchAssociateDataService {

    @Autowired
    private GetBatchAssociateDataRepository getBatchAssociateDataRepository;

    public ClaimResponseDto getBatchAssociateData(Long batchId) {
        return getBatchAssociateDataRepository.getBatchAssociateData(batchId);
    }

}