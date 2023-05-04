package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.lic.epgs.common.entity.CommonStatusEntity;

public interface CommonStatusRepository extends JpaRepository<CommonStatusEntity, Long> {
    List<CommonStatusEntity> findAllByIsActive(boolean isActive);
}