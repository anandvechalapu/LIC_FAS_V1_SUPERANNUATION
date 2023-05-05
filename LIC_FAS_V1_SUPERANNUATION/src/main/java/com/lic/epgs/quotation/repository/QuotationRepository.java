package com.lic.epgs.quotation.repository;

import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.dto.QuotationDto;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuotationRepository {

    /**
     * Saves a quotation to the database.
     *
     * @param quotationDto the quotation details to be saved
     * @return QuotationApiResponseDto containing the result of the save operation
     */
    QuotationApiResponseDto saveQuotation(QuotationDto quotationDto);

    /**
     * Checks if there is an active policy against the given proposal number.
     *
     * @param proposalNumber the proposal number to be checked
     * @return true if there is an active policy against the given proposal number, false otherwise
     */
    boolean isActivePolicy(String proposalNumber);

    /**
     * Checks if the maximum limit of quotations has been exceeded.
     *
     * @param quotationNumber the quotation number to be checked
     * @return true if the maximum limit of quotations is exceeded, false otherwise
     */
    boolean isMaxLimitExceeded(String quotationNumber);

    /**
     * Finds a quotation by its id.
     *
     * @param id the id of the quotation to be found
     * @return an Optional containing the found quotation or an empty Optional if no quotation is found
     */
    Optional<QuotationDto> findById(Long id);
}