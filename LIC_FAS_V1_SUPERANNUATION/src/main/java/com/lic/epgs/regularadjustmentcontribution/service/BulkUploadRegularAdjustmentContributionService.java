package com.lic.epgs.regularadjustmentcontribution.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lic.epgs.regularadjustmentcontribution.repository.BulkUploadRegularAdjustmentContributionRepository;

@Service
public class BulkUploadRegularAdjustmentContributionService {
	
	private BulkUploadRegularAdjustmentContributionRepository bulkUploadRegularAdjustmentContributionRepository;

    public BulkUploadRegularAdjustmentContributionService(BulkUploadRegularAdjustmentContributionRepository bulkUploadRegularAdjustmentContributionRepository) {
        this.bulkUploadRegularAdjustmentContributionRepository = bulkUploadRegularAdjustmentContributionRepository;
    }

    // Retrieve the policy details for the provided Master Policy ID and Unit Code
    public List<Object> getPolicyDetails(String masterPolicyId, String unitCode) {
        return bulkUploadRegularAdjustmentContributionRepository.getPolicyDetails(masterPolicyId, unitCode);
    }

    // Check if the members with the provided LIC IDs are available for the provided Master Policy ID
    public boolean isMembersAvailable(String masterPolicyId, List<String> licIds) {
        return bulkUploadRegularAdjustmentContributionRepository.isMembersAvailable(masterPolicyId, licIds);
    }

    // Check if any of the members with the provided LIC IDs have already been onboarded or have an existing claim status of Member-In Onboard, Member-In Intimation, or MemberInPayout
    public List<Object> isMembersAlreadyOnboarded(List<String> licIds) {
        return bulkUploadRegularAdjustmentContributionRepository.isMembersAlreadyOnboarded(licIds);
    }

    // Create a new Regular Adjustment Contribution Batch and save it to the database
    public void createRegularAdjustmentContributionBatch(String fileName, int totalCount, boolean isActive,
			String createdBy, LocalDateTime createdOn) {
        bulkUploadRegularAdjustmentContributionRepository.createRegularAdjustmentContributionBatch(fileName, totalCount, isActive,
			createdBy, createdOn);
    }

    // Retrieve the existing record for the provided Regular Contribution ID
    public Object getExistingRecordForRegularContributionId(String regularContributionId) {
        return bulkUploadRegularAdjustmentContributionRepository.getExistingRecordForRegularContributionId(regularContributionId);
    }

    // Extract the success data from the Excel file and check if the adjustment contribution is available for each member
    public List<Object> extractSuccessDataFromExcel(List<Object> successDataSet, List<Object> failedDataSet) {
        return bulkUploadRegularAdjustmentContributionRepository.extractSuccessDataFromExcel(successDataSet, failedDataSet);
    }

    // Set the success count and failed count of the batch based on the size of the success data set and the failed data set
    public void setSuccessCountAndFailedCount(int successCount, int failedCount) {
        bulkUploadRegularAdjustmentContributionRepository.setSuccessCountAndFailedCount(successCount, failedCount);
    }

    // Create a list of error messages for the failed data set
    public List<String> createErrorMessagesList(List<Object> failedDataSet) {
        return bulkUploadRegularAdjustmentContributionRepository.createErrorMessagesList(failedDataSet);
    }

    // Return the response with the success data set, failed data set, error messages, transaction message, and transaction status
    public Object returnResponse(List<Object> successDataSet, List<Object> failedDataSet, List<String> errorMessages,
			String transactionMessage, String transactionStatus) {
        return bulkUploadRegularAdjustmentContributionRepository.returnResponse(successDataSet, failedDataSet, errorMessages, transactionMessage, transactionStatus);
    }
}