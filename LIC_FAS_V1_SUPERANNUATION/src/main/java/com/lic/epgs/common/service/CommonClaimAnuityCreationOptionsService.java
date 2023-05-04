package com.lic.epgs.common.service;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.common.model.CommonClaimAnuityCreationOptions;
import com.lic.epgs.common.repository.CommonClaimAnuityCreationOptionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonClaimAnuityCreationOptionsService {

    @Autowired
    private CommonClaimAnuityCreationOptionsRepository commonClaimAnuityCreationOptionsRepository;

    public List<CommonClaimAnuityCreationOptions> findAllByStatusTrue() {
        return commonClaimAnuityCreationOptionsRepository.findAllByStatusTrue();
    }

    public Optional<CommonClaimAnuityCreationOptions> findByIdAndStatusTrue(Long id) {
        return commonClaimAnuityCreationOptionsRepository.findByIdAndStatusTrue(id);
    }

    public Optional<CommonClaimAnuityCreationOptions> findByCodeAndStatusTrue(String code) {
        return commonClaimAnuityCreationOptionsRepository.findByCodeAndStatusTrue(code);
    }

    public Optional<CommonClaimAnuityCreationOptions> findByDescriptionAndStatusTrue(String description) {
        return commonClaimAnuityCreationOptionsRepository.findByDescriptionAndStatusTrue(description);
    }

    public Optional<CommonClaimAnuityCreationOptions> findByIsMandatoryAndStatusTrue(Boolean isMandatory) {
        return commonClaimAnuityCreationOptionsRepository.findByIsMandatoryAndStatusTrue(isMandatory);
    }

}