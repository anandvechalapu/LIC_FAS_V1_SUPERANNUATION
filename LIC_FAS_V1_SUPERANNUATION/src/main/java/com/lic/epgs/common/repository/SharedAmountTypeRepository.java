package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.common.model.SharedAmountType;

public interface SharedAmountTypeRepository extends JpaRepository<SharedAmountType, Long> {

// Method to find all shared amount types by status
@Query("SELECT s FROM SharedAmountType s WHERE s.status = true")
public List<SharedAmountType> findAllByStatusTrue();

}