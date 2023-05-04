package com.lic.epgs.adjustmentcontribution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionBulkResponseDto;
import com.lic.epgs.adjustmentcontribution.repository.BulkUploadAdjustmentContributionRepository;

@Service
public class BulkUploadAdjustmentContributionService {

    @Autowired
    private BulkUploadAdjustmentContributionRepository bulkUploadAdjustmentContributionRepository;

    public AdjustmentContributionBulkResponseDto findByMasterPolicyIdAndTempPolicyIdAndCreatedByAndAdjustmentContributionIdAndUnitCodeAndFile(Long masterPolicyId, Long tempPolicyId, String createdBy, String adjustmentContributionId, String unitCode, MultipartFile file){
        return bulkUploadAdjustmentContributionRepository.findByMasterPolicyIdAndTempPolicyIdAndCreatedByAndAdjustmentContributionIdAndUnitCodeAndFile(masterPolicyId, tempPolicyId, createdBy, adjustmentContributionId, unitCode, file);
    }

    public List<AdjustmentContributionBulkResponseDto> findByAlreadyUsedLicIdList(List<String> alreadyUsedLicIdList){
        return bulkUploadAdjustmentContributionRepository.findByAlreadyUsedLicIdList(alreadyUsedLicIdList);
    }

    public List<AdjustmentContributionBulkResponseDto> findByErrorList(List<String> errorList){
        return bulkUploadAdjustmentContributionRepository.findByErrorList(errorList);
    }

    public List<AdjustmentContributionBulkResponseDto> findBySuccessList(List<String> successList){
        return bulkUploadAdjustmentContributionRepository.findBySuccessList(successList);
    }

    public AdjustmentContributionBulkResponseDto findByTransactionStatusAndTransactionMessage(String transactionStatus, String transactionMessage){
        return bulkUploadAdjustmentContributionRepository.findByTransactionStatusAndTransactionMessage(transactionStatus, transactionMessage);
    }

}