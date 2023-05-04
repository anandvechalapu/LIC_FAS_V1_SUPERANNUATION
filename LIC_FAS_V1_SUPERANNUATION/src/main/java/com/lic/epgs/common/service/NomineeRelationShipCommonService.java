package com.lic.epgs.common.service;

import com.lic.epgs.common.model.NomineeRelationShipCommon;
import com.lic.epgs.common.repository.NomineeRelationShipCommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomineeRelationShipCommonService {

    @Autowired
    private NomineeRelationShipCommonRepository nomineeRelationShipCommonRepository;

    public List<NomineeRelationShipCommon> getAllByStatusTrue(){
        return nomineeRelationShipCommonRepository.findByStatusTrue();
    }

}