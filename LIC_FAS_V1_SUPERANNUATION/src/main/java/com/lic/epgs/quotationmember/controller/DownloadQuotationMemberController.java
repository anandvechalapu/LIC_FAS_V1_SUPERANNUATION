package com.lic.epgs.quotationmember.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotationmember.model.DownloadQuotationMemberController;
import com.lic.epgs.quotationmember.service.DownloadQuotationMemberService;

@RestController
public class DownloadQuotationMemberController {
	
	@Autowired
	private DownloadQuotationMemberService downloadQuotationMemberService;
	
	@GetMapping("/downloadFile")
	public DownloadQuotationMemberController downloadFile(@RequestParam Long batchId, @RequestParam String fileType) {
		return downloadQuotationMemberService.downloadFile(batchId, fileType);
	}

}