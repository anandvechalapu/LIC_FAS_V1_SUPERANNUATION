package com.lic.epgs.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.quotation.model.Quotation;

public interface QuotationRepository extends JpaRepository<Quotation, Long> {

    Quotation findByProposalNumber(String proposalNumber);

}