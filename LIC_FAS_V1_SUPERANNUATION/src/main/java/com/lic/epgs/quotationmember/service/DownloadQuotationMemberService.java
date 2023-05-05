package com.lic.epgs.quotationmember.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotationmember.model.DownloadQuotationMemberController;
import com.lic.epgs.quotationmember.repository.DownloadQuotationMemberRepository;

@Service
public class DownloadQuotationMemberService {
	
	@Autowired
	private DownloadQuotationMemberRepository downloadQuotationMemberRepository;
	
	public DownloadQuotationMemberController downloadFile(Long batchId, String fileType) {
		return downloadQuotationMemberRepository.downloadFile(batchId, fileType);
	}

}