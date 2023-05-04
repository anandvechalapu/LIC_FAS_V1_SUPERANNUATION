package com.lic.epgs.policy.repository;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.PolicyBankTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PolicyBankDetailsTempRepo extends JpaRepository<PolicyBankTempEntity, Long> {

    @Modifying
    @Query("UPDATE PolicyBankTempEntity p SET p.inactive = true WHERE p.policyId = ?1 AND p.bankAccountId = ?2")
    int removeBankDetails(Long policyId, Long bankAccountId);
}