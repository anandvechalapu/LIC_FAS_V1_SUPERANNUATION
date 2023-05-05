}
}

package com.lic.epgs.quotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.service.GetQuotationOtherCriteriaService;

@RestController
public class QuotationController {
  
  @Autowired
  private GetQuotationOtherCriteriaService getQuotationOtherCriteriaService;
  
  @GetMapping("/quotations/getByOtherCriteria")
  public List<Quotation> getQuotationByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    @RequestParam(value = "mphCode", required = true) String mphCode,
    @RequestParam(value = "mphName", required = true) String mphName,
    @RequestParam(value = "product", required = true) String product,
    @RequestParam(value = "lineOfBusiness", required = true) String lineOfBusiness,
    @RequestParam(value = "proposalNumber", required = true) String proposalNumber,
    @RequestParam(value = "quotationStatus", required = true) String quotationStatus,
    @RequestParam(value = "fromDate", required = true) String fromDate,
    @RequestParam(value = "toDate", required = true) String toDate
  ) {
    return getQuotationOtherCriteriaService.getQuotationByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
      mphCode, 
      mphName, 
      product, 
      lineOfBusiness, 
      proposalNumber, 
      quotationStatus, 
      fromDate, 
      toDate
    );
  }
  
  @GetMapping("/quotations/getByMphCodeAndMphNameAndProposalNumberAndQuotationStatusAndCreatedOnBetween")
  public List<Quotation> findByMphCodeAndMphNameAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    @RequestParam(value = "mphCode", required = true) String mphCode,
    @RequestParam(value = "mphName", required = true) String mphName,
    @RequestParam(value = "proposalNumber", required = true) String proposalNumber,
    @RequestParam(value = "quotationStatus", required = true) String quotationStatus,
    @RequestParam(value = "fromDate", required = true) String fromDate,
    @RequestParam(value = "toDate", required = true) String toDate
  ) {
    return getQuotationOtherCriteriaService.findByMphCodeAndMphNameAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
      mphCode, 
      mphName, 
      proposalNumber, 
      quotationStatus, 
      fromDate, 
      toDate
    );
  }
  
  @GetMapping("/quotations/getByMphCodeAndMphNameAndProposalNumberAndCreatedOnBetween")
  public List<Quotation> findByMphCodeAndMphNameAndProposalNumberAndCreatedOnBetween(
    @RequestParam(value = "mphCode", required = true) String mphCode,
    @RequestParam(value = "mphName", required = true) String mphName,
    @RequestParam(value = "proposalNumber", required = true) String proposalNumber,
    @RequestParam(value = "fromDate", required = true) String fromDate,
    @RequestParam(value = "toDate", required = true) String toDate
  ) {
    return getQuotationOtherCriteriaService.findByMphCodeAndMphNameAndProposalNumberAndCreatedOnBetween(
      mphCode, 
      mphName, 
      proposalNumber, 
      fromDate, 
      toDate
    );
  }
  
  @GetMapping("/quotations/getByMphCodeAndMphNameAndQuotationStatusAndCreatedOnBetween")
  public List<Quotation> find