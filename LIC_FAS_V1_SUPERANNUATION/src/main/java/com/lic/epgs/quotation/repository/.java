package com.lic.epgs.quotation.repository;

import com.lic.epgs.quotation.dto.CommonChallanDto;
import com.lic.epgs.quotation.dto.QuotationApiResponseDto;
import com.lic.epgs.quotation.entity.CommonChallanEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class QuotationRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuotationRepository.class);

    public QuotationApiResponseDto getChellanNumber(CommonChallanDto commonChallanDto) {
        LOGGER.info("getChellanNumber method started");
        QuotationApiResponseDto response = null;
        try {
            CommonChallanEntity commonChallanEntity = getCommonChallanEntity(commonChallanDto);
            if (commonChallanEntity != null) {
                response = new QuotationApiResponseDto(commonChallanEntity.getChellanNumber());
            } else {
                response = new QuotationApiResponseDto("No record found");
            }
        } catch (Exception e) {
            response = new QuotationApiResponseDto("Error occurred : " + e.getMessage());
        }
        LOGGER.info("getChellanNumber method ended");
        return response;
    }

    private CommonChallanEntity getCommonChallanEntity(CommonChallanDto commonChallanDto) {
        //Implementation to get CommonChallanEntity instance based on CommonChallanDto
        return null;
    }

}