package com.lic.epgs.quotation.repository;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationSearchDto;
import com.lic.epgs.quotation.entity.QuotationTempEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SendToActuaryQuotationControllerRepository extends JpaRepository<QuotationTempEntity, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE QuotationTempEntity qte SET qte.quotationStatus = :quotationStatus, qte.modifiedBy = :modifiedBy, qte.modifiedOn = :modifiedOn WHERE qte.quotationNo = :quotationNo AND qte.unitOffice = :unitOffice AND qte.quotationStatus = :quotationStatus")
	QuotationApiResponseDto updateQuotationStatus(String quotationNo, String unitOffice, String quotationStatus, String modifiedBy, String modifiedOn);

}