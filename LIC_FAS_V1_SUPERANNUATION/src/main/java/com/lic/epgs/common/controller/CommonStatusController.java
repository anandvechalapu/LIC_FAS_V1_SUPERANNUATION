package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.CommonStatusModel;
import com.lic.epgs.common.service.CommonStatusService;

@RestController
@RequestMapping("/commonStatuses")
public class CommonStatusController {
	
	@Autowired
	private CommonStatusService commonStatusService;
	
	@GetMapping
	public List<CommonStatusModel> getAllActiveCommonStatuses() {
		return commonStatusService.getAllActiveCommonStatuses();
	}

}