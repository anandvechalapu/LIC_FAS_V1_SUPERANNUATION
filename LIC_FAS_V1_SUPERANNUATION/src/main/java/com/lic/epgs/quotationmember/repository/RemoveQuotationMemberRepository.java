@Repository
public interface RemoveQuotationMemberRepository {

    // Method to remove a quotation and its batch from the system
    public void removeQuotationMember(String batchId, String quotationId);

    // Method to calculate contributions and save the updated quotation
    public void calculateAndSaveUpdatedQuotation(String batchId, String quotationId);

    // Method to return an error message
    public String returnErrorMessage(String batchId, String quotationId);

}