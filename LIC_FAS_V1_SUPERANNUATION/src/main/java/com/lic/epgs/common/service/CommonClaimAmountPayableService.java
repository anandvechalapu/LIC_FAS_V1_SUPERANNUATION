package com.lic.epgs.common.service;

import com.lic.epgs.common.entity.CommonClaimAmountPayableEntity;
import com.lic.epgs.common.repository.CommonClaimAmountPayableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonClaimAmountPayableService {

    @Autowired
    private CommonClaimAmountPayableRepository commonClaimAmountPayableRepository;

    public List<CommonClaimAmountPayableEntity> retrieveAll(){
        return commonClaimAmountPayableRepository.findAll();
    }
}