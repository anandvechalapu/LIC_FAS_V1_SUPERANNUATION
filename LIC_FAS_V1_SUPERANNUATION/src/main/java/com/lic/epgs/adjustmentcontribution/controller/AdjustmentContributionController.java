package com.lic.epgs.adjustmentcontribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionBulkResponseDto;
import com.lic.epgs.adjustmentcontribution.service.BulkUploadAdjustmentContributionService;

@RestController
@RequestMapping("/api/v1/adjustmentContribution")
public class AdjustmentContributionController {

    @Autowired
    private BulkUploadAdjustmentContributionService bulkUploadAdjustmentContributionService;

    @PostMapping("/bulkupload")
    public AdjustmentContributionBulkResponseDto bulkUploadAdjustmentContribution(@RequestParam(value="masterPolicyId") Long masterPolicyId,
                                                                                @RequestParam(value="tempPolicyId") Long tempPolicyId,
                                                                                @RequestParam(value="createdBy") String createdBy,
                                                                                @RequestParam(value="adjustmentContributionId") String adjustmentContributionId,
                                                                                @RequestParam(value="unitCode") String unitCode,
                                                                                @RequestParam(value="file") MultipartFile file){
        return bulkUploadAdjustmentContributionService.findByMasterPolicyIdAndTempPolicyIdAndCreatedByAndAdjustmentContributionIdAndUnitCodeAndFile(masterPolicyId, tempPolicyId, createdBy, adjustmentContributionId, unitCode, file);
    }

    @GetMapping("/usedLicIds")
    public List<AdjustmentContributionBulkResponseDto> usedLicIds(@RequestParam(value="alreadyUsedLicIdList") List<String> alreadyUsedLicIdList){
        return bulkUploadAdjustmentContributionService.findByAlreadyUsedLicIdList(alreadyUsedLicIdList);
    }

    @GetMapping("/errors")
    public List<AdjustmentContributionBulkResponseDto> errors(@RequestParam(value="errorList") List<String> errorList){
        return bulkUploadAdjustmentContributionService.findByErrorList(errorList);
    }

    @GetMapping("/success")
    public List<AdjustmentContributionBulkResponseDto> success(@RequestParam(value="successList") List<String> successList){
        return bulkUploadAdjustmentContributionService.findBySuccessList(successList);
    }

    @GetMapping("/transaction")
    public AdjustmentContributionBulkResponseDto transaction(@RequestParam(value="transactionStatus") String transactionStatus,
                                                            @RequestParam(value="transactionMessage") String transactionMessage){
        return bulkUploadAdjustmentContributionService.findByTransactionStatusAndTransactionMessage(transactionStatus, transactionMessage);
    }

}