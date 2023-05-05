package com.lic.epgs.regularadjustmentcontribution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.model.BulkUploadRegularAdjustmentContribution;
import com.lic.epgs.regularadjustmentcontribution.repository.BulkUploadRegularAdjustmentContributionRepository;

@Service
public class BulkUploadRegularAdjustmentContributionService {

    @Autowired
    private BulkUploadRegularAdjustmentContributionRepository bulkUploadRegularAdjustmentContributionRepository;

    public BulkUploadRegularAdjustmentContribution save(BulkUploadRegularAdjustmentContribution bulkUploadRegularAdjustmentContribution){
        return bulkUploadRegularAdjustmentContributionRepository.save(bulkUploadRegularAdjustmentContribution);
    }

    public Optional<BulkUploadRegularAdjustmentContribution> findById(Long id){
        return bulkUploadRegularAdjustmentContributionRepository.findById(id);
    }

    public List<BulkUploadRegularAdjustmentContribution> findAll(){
        return bulkUploadRegularAdjustmentContributionRepository.findAll();
    }

    public void deleteById(Long id){
        bulkUploadRegularAdjustmentContributionRepository.deleteById(id);
    }

    public BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(String masterPolicyId, 
    String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, String fileName){
        return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndTemporaryPolicyIdAndCreatedByAndRegularContributionIdAndUnitCodeAndFileName(masterPolicyId, 
        temporaryPolicyId, createdBy, regularContributionId, unitCode, fileName);
    }

    public BulkUploadRegularAdjustmentContribution findByMasterPolicyIdAndUnitCodeAndFileName(String masterPolicyId, String unitCode, String fileName){
        return bulkUploadRegularAdjustmentContributionRepository.findByMasterPolicyIdAndUnitCodeAndFileName(masterPolicyId, unitCode, fileName);
    }

    public BulkUploadRegularAdjustmentContribution findByRegularContributionId(String regularContributionId){
        return bulkUploadRegularAdjustmentContributionRepository.findByRegularContributionId(regularContributionId);
    }

    public BulkUploadRegularAdjustmentContribution findBySuccessDataSetContainingAndFailedDataSetContaining(String successDataSet, String failedDataSet){
        return bulkUploadRegularAdjustmentContributionRepository.findBySuccessDataSetContainingAndFailedDataSetContaining(successDataSet, failedDataSet);
    }

    public BulkUploadRegularAdjustmentContribution findByTransactionMessageAndTransactionStatus(String transactionMessage,String transactionStatus){
        return bulkUploadRegularAdjustmentContributionRepository.findByTransactionMessageAndTransactionStatus(transactionMessage, transactionStatus);
    }

    public BulkUploadRegularAdjustmentContribution findByErrorMessagesContaining(String errorMessages){
        return bulkUploadRegularAdjustmentContributionRepository.findByErrorMessagesContaining(errorMessages);
    }

}