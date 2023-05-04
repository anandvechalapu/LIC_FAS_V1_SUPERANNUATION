package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.model.PolicyStatus;

@Repository
public interface PolicyStatusApiRepository extends JpaRepository<PolicyStatus, Long> {

    PolicyStatus findByCodeAndStatus(String code, String status);
    
    PolicyStatus findByIdAndStatus(Long id, String status);

}