package com.lic.epgs.quotationmemberappointee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotationmemberappointee.QuotationMemberAppointeeTempEntity;

@Repository
public interface QuotationMemberAppointeeRepository extends JpaRepository<QuotationMemberAppointeeTempEntity, Long> {

    @Modifying
    @Query("DELETE FROM QuotationMemberAppointeeTempEntity WHERE appointeeId = ?1")
    void deleteQuotationMemberAppointee(Long appointeeId);

}