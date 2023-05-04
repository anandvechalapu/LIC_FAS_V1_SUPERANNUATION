package com.lic.epgs.common.service;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.repository.ClaimDocumentStatusCommonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimDocumentStatusCommonService {
    @Autowired
    private ClaimDocumentStatusCommonRepository claimDocumentStatusCommonRepository;

    public List<CommonExternalApiDto> findAllActiveClaimDocumentStatuses() {
        return claimDocumentStatusCommonRepository.findAllActiveClaimDocumentStatuses();
    }
}