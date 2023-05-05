package com.lic.epgs.quotationmembernominee.service;

import com.lic.epgs.quotationmembernominee.repository.QuotationMemberNomineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuotationMemberNomineeService {

    @Autowired
    private QuotationMemberNomineeRepository quotationMemberNomineeRepository;

    public ResponseEntity<Map<String, Object>> getAll(Long memberId) {
        return quotationMemberNomineeRepository.getAll(memberId);
    }
}