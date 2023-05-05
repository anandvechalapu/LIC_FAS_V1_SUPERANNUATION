package com.lic.epgs.quotationmember.service;

import com.lic.epgs.quotationmember.repository.RemoveQuotationMemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveQuotationMemberService {

    @Autowired
    private RemoveQuotationMemberRepository removeQuotationMemberRepository;

    // Method to remove a quotation and its batch from the system
    public void removeQuotationMember(String batchId, String quotationId) {
        removeQuotationMemberRepository.removeQuotationMember(batchId, quotationId);
    }

    // Method to calculate contributions and save the updated quotation
    public void calculateAndSaveUpdatedQuotation(String batchId, String quotationId) {
        removeQuotationMemberRepository.calculateAndSaveUpdatedQuotation(batchId, quotationId);
    }

    // Method to return an error message
    public String returnErrorMessage(String batchId, String quotationId) {
        return removeQuotationMemberRepository.returnErrorMessage(batchId, quotationId);
    }
}