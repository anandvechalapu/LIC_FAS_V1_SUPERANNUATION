package com.lic.epgs.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.lic.epgs.quotation.model.Quotation;

@Repository
public interface GetQuotationOtherCriteriaRepository extends JpaRepository<Quotation, Long> {
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String lineOfBusiness, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndLineOfBusinessAndProposalNumberAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String lineOfBusiness, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndLineOfBusinessAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String lineOfBusiness, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndLineOfBusinessAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String lineOfBusiness, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndProposalNumberAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndProductAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String product, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndLineOfBusinessAndProposalNumberAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String lineOfBusiness, 
    String proposalNumber, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndLineOfBusinessAndProposalNumberAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String lineOfBusiness, 
    String proposalNumber, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndLineOfBusinessAndQuotationStatusAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String lineOfBusiness, 
    String quotationStatus, 
    String fromDate, 
    String toDate
  );
  
  List<Quotation> findByMphCodeAndMphNameAndLineOfBusinessAndCreatedOnBetween(
    String mphCode, 
    String mphName, 
    String lineOfBusiness, 
    String fromDate, 
    String toDate
  );
