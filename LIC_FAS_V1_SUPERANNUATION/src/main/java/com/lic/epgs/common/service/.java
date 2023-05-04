package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.common.model.ClaimIntimaitonType;

@Repository
public interface ClaimIntimaitonTypeService {

	public List<ClaimIntimaitonType> getAllClaimIntimaitonTypes();
	
	public ClaimIntimaitonType getClaimIntimaitonTypeByCode(String code);
	
	public List<ClaimIntimaitonType> getMandatoryClaimIntimaitonTypes();
	
	public List<ClaimIntimaitonType> getActiveClaimIntimaitonTypes();
	
}