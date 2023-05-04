package com.lic.epgs.common.service;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.dto.CommonExternalApiResponseDto;
import com.lic.epgs.common.entity.CommonClaimMakerActionsEntity;
import com.lic.epgs.common.repository.CommonClaimMakerActionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonClaimMakerActionsService {

    @Autowired
    private CommonClaimMakerActionsRepository commonClaimMakerActionsRepository;

    //method for getting a list of claim maker actions in the form of a CommonExternalApiResponseDto object
    public CommonExternalApiResponseDto getClaimMakerActionsList() {
        List<CommonClaimMakerActionsEntity> claimMakerActionsList = commonClaimMakerActionsRepository.findAllActiveClaimMakerActions();
        CommonExternalApiDto commonExternalApiDto = new CommonExternalApiDto();
        commonExternalApiDto.setData(claimMakerActionsList);
        CommonExternalApiResponseDto commonExternalApiResponseDto = new CommonExternalApiResponseDto();
        commonExternalApiResponseDto.setResponse(commonExternalApiDto);
        return commonExternalApiResponseDto;
    }

}