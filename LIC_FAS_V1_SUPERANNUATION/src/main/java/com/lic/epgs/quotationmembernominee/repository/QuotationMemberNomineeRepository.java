package com.lic.epgs.quotationmembernominee.repository;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNominee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface QuotationMemberNomineeRepository extends JpaRepository<QuotationMemberNominee, Long> {

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM QuotationMemberNominee WHERE id = :nomineeId ", nativeQuery = true)
    void deleteQuotationMemberNominee(@Param("nomineeId") Long nomineeId);

}