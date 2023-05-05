@Repository
package com.lic.epgs.quotationmemberbankdetail.repository;

import org.springframework.stereotype.Repository;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuotationMemberBankDetailRepository extends JpaRepository<QuotationMemberBankDetail, Long> {

    QuotationMemberBankDetail findByBankIdAndQuotationMemberId(Long bankId, Long quotationMemberId);
}