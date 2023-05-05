package com.lic.epgs.quotationmemberappointee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotationmemberappointee.model.QuotationMemberAppointee;

@Repository
public interface QuotationMemberAppointeeRepository extends JpaRepository<QuotationMemberAppointee, Long> {
  
    @Query("SELECT a FROM QuotationMemberAppointee a WHERE a.quotationMemberId = ?1")
    public Iterable<QuotationMemberAppointee> getQuotationMemberAppointeesByQuotationMemberId(Long quotationMemberId);
}