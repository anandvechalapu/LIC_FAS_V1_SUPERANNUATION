package com.lic.epgs.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.quotation.entity.Quotation;

public interface QuotationTempRepository extends JpaRepository<Quotation, Integer> {
    Quotation findById(int id);
    Quotation save(Quotation quotation);
}