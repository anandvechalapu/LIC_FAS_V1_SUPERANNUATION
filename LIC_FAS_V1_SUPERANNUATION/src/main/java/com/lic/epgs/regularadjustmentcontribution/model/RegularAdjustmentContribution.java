public class RegularAdjustmentContribution {

    private Long id;
    private String masterPolicyId;
    private String temporaryPolicyId;
    private String createdBy;
    private String regularContributionId;
    private String unitCode;
    private String fileName;
    private Long LICId;
    private String claimStatus;
    private String status;
    private List<RegularAdjustmentContribution> successDataSet;
    private List<RegularAdjustmentContribution> failedDataSet;

    public RegularAdjustmentContribution() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasterPolicyId() {
        return masterPolicyId;
    }

    public void setMasterPolicyId(String masterPolicyId) {
        this.masterPolicyId = masterPolicyId;
    }

    public String getTemporaryPolicyId() {
        return temporaryPolicyId;
    }

    public void setTemporaryPolicyId(String temporaryPolicyId) {
        this.temporaryPolicyId = temporaryPolicyId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getRegularContributionId() {
        return regularContributionId;
    }

    public void setRegularContributionId(String regularContributionId) {
        this.regularContributionId = regularContributionId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getLICId() {
        return LICId;
    }

    public void setLICId(Long LICId) {
        this.LICId = LICId;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RegularAdjustmentContribution> getSuccessDataSet() {
        return successDataSet;
    }

    public void setSuccessDataSet(List<RegularAdjustmentContribution> successDataSet) {
        this.successDataSet = successDataSet;
    }

    public List<RegularAdjustmentContribution> getFailedDataSet() {
        return failedDataSet;
    }

    public void setFailedDataSet(List<RegularAdjustmentContribution> failedDataSet) {
        this.failedDataSet = failedDataSet;
    }

}