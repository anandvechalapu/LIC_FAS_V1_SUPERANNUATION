package com.lic.epgs.quotationmembernominee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotationmembernominee.entity.QuotationMemberNominee;

@Repository
public interface QuotationMemberNomineeRepository extends JpaRepository<QuotationMemberNominee, Long> {

    @Modifying
    @Query("DELETE FROM QuotationMemberNominee q WHERE q.nomineeId = :nomineeId")
    public void deleteQuotationMemberNominee(Long nomineeId);

}