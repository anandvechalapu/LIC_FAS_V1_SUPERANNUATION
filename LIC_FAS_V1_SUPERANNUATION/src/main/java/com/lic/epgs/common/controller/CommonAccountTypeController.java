package com.lic.epgs.common.controller;

import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.dto.CommonExternalApiDto;
import com.lic.epgs.common.service.CommonAccountTypeService;

@RestController
@RequestMapping("/account-type")
public class CommonAccountTypeController {
	
	@Autowired
	private CommonAccountTypeService commonAccountTypeService;
	
	@GetMapping("/active")
	public List<CommonExternalApiDto> getActiveAccountTypes() throws NonUniqueResultException{
		return commonAccountTypeService.getActiveAccountTypes();
	}

}