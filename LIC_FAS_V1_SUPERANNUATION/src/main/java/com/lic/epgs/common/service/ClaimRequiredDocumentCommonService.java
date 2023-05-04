package com.lic.epgs.common.service;

import com.lic.epgs.common.model.ClaimRequiredDocumentCommon;
import com.lic.epgs.common.repository.ClaimRequiredDocumentCommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimRequiredDocumentCommonService {

    @Autowired
    private ClaimRequiredDocumentCommonRepository claimRequiredDocumentCommonRepository;

    public List<ClaimRequiredDocumentCommon> getClaimRequiredDocumentsByCodeAndIsmandatoryAndStatus(String code, String ismandatory, String status) {
        return claimRequiredDocumentCommonRepository.findByCodeAndIsmandatoryAndStatus(code, ismandatory, status);
    }

}