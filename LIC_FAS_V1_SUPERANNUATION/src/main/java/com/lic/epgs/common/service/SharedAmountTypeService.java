// Generated Spring boot Service class

package com.lic.epgs.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.SharedAmountType;
import com.lic.epgs.common.repository.SharedAmountTypeRepository;

@Service
public class SharedAmountTypeService {

@Autowired
private SharedAmountTypeRepository sharedAmountTypeRepository;

// Method to find all shared amount types by status
public List<SharedAmountType> findAllByStatusTrue(){
	return sharedAmountTypeRepository.findAllByStatusTrue();
}

}