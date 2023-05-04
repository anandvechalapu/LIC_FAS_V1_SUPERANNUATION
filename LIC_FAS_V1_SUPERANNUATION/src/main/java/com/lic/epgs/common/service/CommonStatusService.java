package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.entity.CommonStatusEntity;
import com.lic.epgs.common.repository.CommonStatusRepository;

@Service
public class CommonStatusService {

    @Autowired
    private CommonStatusRepository commonStatusRepository;

    public List<CommonStatusEntity> getAllActiveCommonStatuses() {
        return commonStatusRepository.findAllByIsActive(true);
    }
    
}