@Repository
public interface BulkUploadRegularAdjustmentContributionRepository {

    // To provide the master policy ID, temporary policy ID, created by, regular contribution ID, unit code, and the file to be uploaded.
    void uploadFile(String masterPolicyId, String temporaryPolicyId, String createdBy, String regularContributionId, String unitCode, File file);

    // To reject any other format than .xlsx
    boolean isValidFileType(File file);

    // To return a Fail status and an Invalid File Type XLSX message
    String getInvalidFileTypeMessage();

    // To parse the Excel file and extract a list of LIC IDs
    List<String> parseExcelFile(File file);

    // To replicate members for the provided master policy ID and LIC IDs
    void replicateMembers(String masterPolicyId, List<String> licIds);

    // To search for the policy details for the provided master policy ID and unit code
    PolicyDetail searchPolicyDetail(String masterPolicyId, String unitCode);

    // To check if the members with the provided LIC IDs are available for the provided master policy ID
    boolean areMembersAvailable(String masterPolicyId, List<String> licIds);

    // To check if any of the members with the provided LIC IDs have already been onboarded or have an existing claim status of Member-In Onboard, Member-In Intimation, or MemberInPayout
    List<String> getAlreadyUsedLicIds(String masterPolicyId, List<String> licIds);

    // To create a new regular adjustment contribution batch and save it to the database
    void createRegularAdjustmentContributionBatch(String masterPolicyId, List<String> licIds, String fileName, int totalCount, boolean isActive, String createdBy, Date createdOn);

    // To check if the provided regular contribution ID exists in the database
    boolean doesRegularContributionIdExist(int regularContributionId);

    // To extract the success data from the Excel file and check if the adjustment contribution is available for each member
    AdjustmentContributionDataSet extractSuccessData(File file);

    // To check if the adjustment contribution is available
    boolean isAdjustmentContributionAvailable(AdjustmentContributionDataSet dataSet);

    // To add the data to the success data set and set the status to Success
    void addToSuccessDataSet(AdjustmentContributionDataSet dataSet, String licId, String status);

    // To add the data to the failed data set and set the status to Failed
    void addToFailedDataSet(AdjustmentContributionDataSet dataSet, String licId, String status);

    // To set the success count and failed count of the batch
    void setBatchSuccessAndFailedCount(AdjustmentContributionDataSet dataSet);

    // To create a list of error messages for the failed data set
    List<String> getErrorMessages(AdjustmentContributionDataSet dataSet);

    // To return the response with the success data set, failed data set, error messages, transaction message, and transaction status
    Response getResponse(AdjustmentContributionDataSet dataSet, String transactionMessage, String transactionStatus);

}