package com.lic.epgs.common.repository;

import com.lic.epgs.common.entity.CommonClaimMakerActionsEntity;
import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.dto.CommonExternalApiResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonClaimMakerActionsRepository extends JpaRepository<CommonClaimMakerActionsEntity, Long> {

    @Query("SELECT c FROM CommonClaimMakerActionsEntity c WHERE c.status = true")
    List<CommonClaimMakerActionsEntity> findAllActiveClaimMakerActions();

    //method for getting a list of claim maker actions in the form of a CommonExternalApiResponseDto object
    public CommonExternalApiResponseDto getClaimMakerActionsList();

}