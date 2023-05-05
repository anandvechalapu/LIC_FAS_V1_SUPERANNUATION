package com.lic.epgs.quotation.controller;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationDto;
import com.lic.epgs.quotation.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @Autowired
    private QuotationService quotationService;

    @PostMapping
    public ResponseEntity<QuotationApiResponseDto> saveQuotation(@RequestBody QuotationDto quotationDto){
        return new ResponseEntity<>(quotationService.saveQuotation(quotationDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<QuotationDto>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(quotationService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/active/{proposalNumber}")
    public ResponseEntity<Boolean> isActivePolicy(@PathVariable String proposalNumber) {
        return new ResponseEntity<>(quotationService.isActivePolicy(proposalNumber), HttpStatus.OK);
    }

    @GetMapping("/limit/{quotationNumber}")
    public ResponseEntity<Boolean> isMaxLimitExceeded(@PathVariable String quotationNumber) {
        return new ResponseEntity<>(quotationService.isMaxLimitExceeded(quotationNumber), HttpStatus.OK);
    }

}