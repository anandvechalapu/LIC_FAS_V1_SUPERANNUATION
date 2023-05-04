//Spring Boot Service Class
package com.lic.epgs.common.service;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.entity.CommonStatusEntity;
import com.lic.epgs.common.repository.CommonStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonStatusService {

    @Autowired
    private CommonStatusRepository commonStatusRepository;

    public CommonResponseDto getCommonStatus() {
        return commonStatusRepository.getCommonStatus();
    }
    
    public List<CommonStatusEntity> findAll(){
        return commonStatusRepository.findAll();
    }

}