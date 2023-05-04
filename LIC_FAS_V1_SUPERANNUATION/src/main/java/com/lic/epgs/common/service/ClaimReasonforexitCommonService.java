package com.lic.epgs.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.ClaimReasonforexitCommon;
import com.lic.epgs.common.repository.ClaimReasonforexitCommonRepository;

@Service
public class ClaimReasonforexitCommonService {
	
	@Autowired
	private ClaimReasonforexitCommonRepository claimReasonforexitCommonRepository;
	
	public List<ClaimReasonforexitCommon> findAllByOrderByCodeAsc(){
		return claimReasonforexitCommonRepository.findAllByOrderByCodeAsc();
	}
	
	public Optional<ClaimReasonforexitCommon> findByCode(String code){
		return claimReasonforexitCommonRepository.findByCode(code);
	}
	
	public List<ClaimReasonforexitCommon> findAllByIsmandatoryTrueOrderByCodeAsc(){
		return claimReasonforexitCommonRepository.findAllByIsmandatoryTrueOrderByCodeAsc();
	}
	
	public List<ClaimReasonforexitCommon> findAllByStatusTrueOrderByCodeAsc(){
		return claimReasonforexitCommonRepository.findAllByStatusTrueOrderByCodeAsc();
	}

}