package com.lic.epgs.quotationmembernominee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationMemberNomineeRepository extends JpaRepository<QuotationMemberNominee, Long> {

}

package com.lic.epgs.quotationmembernominee.controller;

import com.lic.epgs.quotationmembernominee.model.QuotationMemberNomineeDto;
import com.lic.epgs.quotationmembernominee.service.QuotationMemberNomineeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotation-member-nominee")
public class QuotationMemberNomineeController {

    @Autowired
    private QuotationMemberNomineeService quotationMemberNomineeService;

    @GetMapping("/{memberId}")
    public ResponseEntity<QuotationMemberNomineeDto> getAll(@PathVariable Long memberId) {
        return quotationMemberNomineeService.getAll(memberId);
    }

}