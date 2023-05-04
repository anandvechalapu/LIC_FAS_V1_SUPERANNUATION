package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.model.CommonAccountType;

@Repository
public interface CommonAccountTypeRepository extends JpaRepository<CommonAccountType, Long> {
	
	/**
	 * Method to retrieve a list of active account types
	 * 
	 * @return List of active account types
	 * @throws NonUniqueResultException if there is more than one active account type
	 */
	public List<CommonExternalApiDto> getActiveAccountTypes() throws NonUniqueResultException;
}