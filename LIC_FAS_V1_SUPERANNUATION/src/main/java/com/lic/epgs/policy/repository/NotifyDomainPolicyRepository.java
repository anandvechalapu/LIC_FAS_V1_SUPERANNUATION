package com.lic.epgs.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policy.entity.NotifyDomainPolicy;

@Repository
public interface NotifyDomainPolicyRepository extends JpaRepository<NotifyDomainPolicy, Long> {
 
    NotifyDomainPolicy findByRandomInteger(Integer randomInteger);
    
    NotifyDomainPolicy save(NotifyDomainPolicy notifyDomainPolicy);

    NotifyDomainPolicy findByTransactionStatus(String transactionStatus);
    
    NotifyDomainPolicy findByTransactionMessage(String transactionMessage);
    
    NotifyDomainPolicy findByZeroValueDeposit(Boolean zeroValueDeposit);
    
    NotifyDomainPolicy findByChallanNumber(Long challanNumber);
    
    NotifyDomainPolicy findByCreatedDate(String createdDate);
}