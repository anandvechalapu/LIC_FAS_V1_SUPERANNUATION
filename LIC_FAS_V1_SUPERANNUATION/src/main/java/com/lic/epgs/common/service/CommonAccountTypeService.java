package com.lic.epgs.common.service;

import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.repository.CommonAccountTypeRepository;

@Service
public class CommonAccountTypeService {
	
	@Autowired
	private CommonAccountTypeRepository commonAccountTypeRepository;
	
	public List<CommonExternalApiDto> getActiveAccountTypes() throws NonUniqueResultException{
		return commonAccountTypeRepository.getActiveAccountTypes();
	}

}