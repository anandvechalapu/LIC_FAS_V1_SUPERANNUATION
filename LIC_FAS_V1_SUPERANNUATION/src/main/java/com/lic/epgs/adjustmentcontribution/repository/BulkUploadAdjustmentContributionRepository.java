import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.adjustmentcontribution.model.AdjustmentContributionBulkResponseDto;

public interface BulkUploadAdjustmentContributionRepository extends JpaRepository<AdjustmentContributionBulkResponseDto, Long> {
 
    AdjustmentContributionBulkResponseDto findByMasterPolicyIdAndTempPolicyIdAndCreatedByAndAdjustmentContributionIdAndUnitCodeAndFile(Long masterPolicyId, Long tempPolicyId, String createdBy, String adjustmentContributionId, String unitCode, MultipartFile file);
 
    List<AdjustmentContributionBulkResponseDto> findByAlreadyUsedLicIdList(List<String> alreadyUsedLicIdList);
 
    List<AdjustmentContributionBulkResponseDto> findByErrorList(List<String> errorList);
 
    List<AdjustmentContributionBulkResponseDto> findBySuccessList(List<String> successList);
 
    AdjustmentContributionBulkResponseDto findByTransactionStatusAndTransactionMessage(String transactionStatus, String transactionMessage);
 
}