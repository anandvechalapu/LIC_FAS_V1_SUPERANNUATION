package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.ClaimMemberUploadFileType;
import com.lic.epgs.common.repository.ClaimMemberUploadFileTypeCommonRepository;

@Service
public class ClaimMemberUploadFileTypeCommonService {

    @Autowired
    private ClaimMemberUploadFileTypeCommonRepository claimMemberUploadFileTypeCommonRepository;

    public List<ClaimMemberUploadFileType> findAllByStatus() {
        return claimMemberUploadFileTypeCommonRepository.findAllByStatus();
    }

    public ClaimMemberUploadFileType findByIdAndStatus(Integer id) {
        return claimMemberUploadFileTypeCommonRepository.findByIdAndStatus(id);
    }

    public ClaimMemberUploadFileType findByCodeAndStatus(String code) {
        return claimMemberUploadFileTypeCommonRepository.findByCodeAndStatus(code);
    }

    public ClaimMemberUploadFileType findByDescriptionAndStatus(String description) {
        return claimMemberUploadFileTypeCommonRepository.findByDescriptionAndStatus(description);
    }

    public List<ClaimMemberUploadFileType> findAllByIsMandatoryAndStatus(Boolean isMandatory) {
        return claimMemberUploadFileTypeCommonRepository.findAllByIsMandatoryAndStatus(isMandatory);
    }
}