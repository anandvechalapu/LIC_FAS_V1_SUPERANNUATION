package com.lic.epgs.common.repository;

import com.lic.epgs.common.dto.CommonExternalApiDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimDocumentStatusCommonRepository extends JpaRepository<CommonExternalApiDto, Long> {

    @Query("SELECT c FROM CommonExternalApiDto c WHERE c.status = true")
    List<CommonExternalApiDto> findAllActiveClaimDocumentStatuses();
}