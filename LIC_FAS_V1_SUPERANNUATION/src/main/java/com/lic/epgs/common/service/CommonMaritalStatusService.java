package com.lic.epgs.common.service;

import com.lic.epgs.common.repository.CommonMaritalStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.model.MaritalStatus;

import java.util.List;
import java.util.Optional;

@Service
public class CommonMaritalStatusService {
    
    @Autowired
    private CommonMaritalStatusRepository commonMaritalStatusRepository;
    
    public List<MaritalStatus> findByStatus(boolean status) {
        return commonMaritalStatusRepository.findByStatus(status);
    }

    public Optional<MaritalStatus> findByCode(String code) {
        return commonMaritalStatusRepository.findByCode(code);
    }

}