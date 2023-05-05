List<Quotation> findByMphCodeAndMphNameAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProposalNumberAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String product, 
    String lineOfBusiness, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndLineOfBusinessAndProposalNumberAndCreatedOnBetween(
    String product, 
    String lineOfBusiness, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndLineOfBusinessAndQuotationStatusAndCreatedOnBetween(
    String product, 
    String lineOfBusiness, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndLineOfBusinessAndCreatedOnBetween(
    String product, 
    String lineOfBusiness, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String product, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndProposalNumberAndCreatedOnBetween(
    String product, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndQuotationStatusAndCreatedOnBetween(
    String product, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByProductAndCreatedOnBetween(
    String product, 
    String fromDate, 
    String toDate
  );
}

package com.lic.epgs.quotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.quotation.model.Quotation;
import com.lic.epgs.quotation.repository.GetQuotationOtherCriteriaRepository;

@Service
public class GetQuotationOtherCriteriaService {
  
  @Autowired
  private GetQuotationOtherCriteriaRepository getQuotationOtherCriteriaRepository;
  
  public List<Quotation> getQuotationByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String lineOfBusiness, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  ) {
    return getQuotationOtherCriteriaRepository.findByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
      mphCode, 
      mphName, 
      product, 
      lineOfBusiness, 
      proposalNumber, 
      quotationStatus, 
      fromDate, 
      toDate
    );
