package com.lic.epgs.common.repository;

import com.lic.epgs.common.dto.CommonStatusDto;
import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.entity.CommonStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatusEntity,Long> {
    public List<CommonStatusEntity> findAll();
    
    public CommonResponseDto commonStatus();
    
    default public CommonResponseDto getCommonStatus() {
        List<CommonStatusEntity> commonStatusList = findAll();
        List<CommonStatusDto> commonStatusDtoList = new ArrayList<>();
        if (commonStatusList.size() > 0) {
            for (CommonStatusEntity commonStatusEntity : commonStatusList) {
                CommonStatusDto commonStatusDto = new CommonStatusDto();
                commonStatusDto.setId(commonStatusEntity.getId());
                commonStatusDto.setCode(commonStatusEntity.getCode());
                commonStatusDto.setType(commonStatusEntity.getType());
                commonStatusDto.setDescription(commonStatusEntity.getDescription());
                commonStatusDto.setDescription1(commonStatusEntity.getDescription1());
                commonStatusDto.setName(commonStatusEntity.getName());
                commonStatusDto.setIsActive(commonStatusEntity.getIsActive());
                commonStatusDtoList.add(commonStatusDto);
            }
            CommonResponseDto commonResponseDto = new CommonResponseDto();
            commonResponseDto.setData(commonStatusDtoList);
            commonResponseDto.setTransactionMessage("FETCH");
            commonResponseDto.setTransactionStatus("SUCCESS");
            return commonResponseDto;
        } else {
            CommonResponseDto commonResponseDto = new CommonResponseDto();
            commonResponseDto.setData(new ArrayList<>());
            commonResponseDto.setTransactionMessage("NO_RESULT");
            commonResponseDto.setTransactionStatus("ERROR");
            return commonResponseDto;
        }
    }
}