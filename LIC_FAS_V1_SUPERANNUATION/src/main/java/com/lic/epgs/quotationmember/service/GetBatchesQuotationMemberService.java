package com.lic.epgs.quotationmember.service;

import com.lic.epgs.quotationmember.model.Batch;
import com.lic.epgs.quotationmember.repository.GetBatchesQuotationMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetBatchesQuotationMemberService {

    @Autowired
    GetBatchesQuotationMemberRepository getBatchesQuotationMemberRepository;

    public List<Batch> getBatches(String quotationId) {
        return getBatchesQuotationMemberRepository.getBatches(quotationId);
    }

    public Batch getBatchDetails(String batchId) {
        return getBatchesQuotationMemberRepository.getBatchDetails(batchId);
    }
}