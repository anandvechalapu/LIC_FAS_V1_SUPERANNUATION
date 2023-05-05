package com.lic.epgs.quotation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotation.entity.CommonDocsTempEntity;

@Repository
public interface QuotationRepository extends JpaRepository<CommonDocsTempEntity, Long> {
    
    List<CommonDocsTempEntity> getDocumentDetails(Long quotationId);
}