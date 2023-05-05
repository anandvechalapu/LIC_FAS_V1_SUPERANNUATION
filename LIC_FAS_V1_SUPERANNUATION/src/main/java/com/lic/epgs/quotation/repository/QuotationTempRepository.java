package com.lic.epgs.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotation.entity.QuotationTempEntity;

@Repository
public interface QuotationTempRepository extends JpaRepository<QuotationTempEntity, Integer> {

    QuotationTempEntity findByQuotationId(Integer quotationId);

    QuotationTempEntity save(QuotationTempEntity quotationTemp);

}