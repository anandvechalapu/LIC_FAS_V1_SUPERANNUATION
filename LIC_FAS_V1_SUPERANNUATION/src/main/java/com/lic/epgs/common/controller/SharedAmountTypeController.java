// Generated Spring boot Controller class

package com.lic.epgs.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.SharedAmountType;
import com.lic.epgs.common.service.SharedAmountTypeService;

@RestController
@RequestMapping("/sharedAmountType")
public class SharedAmountTypeController {

@Autowired
private SharedAmountTypeService sharedAmountTypeService;

@GetMapping("/all")
public List<SharedAmountType> getAllSharedAmountTypesByStatusTrue() {
	return sharedAmountTypeService.findAllByStatusTrue();
}

}