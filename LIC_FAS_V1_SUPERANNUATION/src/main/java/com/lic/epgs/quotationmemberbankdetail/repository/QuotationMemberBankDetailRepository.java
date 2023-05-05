package com.lic.epgs.quotationmemberbankdetail.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.quotationmemberbankdetail.model.QuotationMemberBankDetail;

@Repository
public interface QuotationMemberBankDetailRepository extends JpaRepository<QuotationMemberBankDetail, Long> {
	
	void deleteById(Long bankId);

}