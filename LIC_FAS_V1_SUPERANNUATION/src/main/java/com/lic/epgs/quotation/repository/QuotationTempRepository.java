package com.lic.epgs.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotation.model.Quotation;

@Repository
public interface QuotationTempRepository extends JpaRepository<Quotation, Long> {
	
	public Quotation findByStatus(String status);

}