@Repository
public interface GetBatchesQuotationMemberRepository {
    
    /**
     * Retrieves a list of batches associated with a given quotation ID
     * @param quotationId the quotation ID
     * @return a list of batches associated with the provided quotation ID
     */
    List<Batch> getBatches(String quotationId);

    /**
     * Retrieves details about a given batch
     * @param batchId the batch ID
     * @return details about the batch, such as the created on, file name, total count, success count, failed count, and error information (if any)
     */
    Batch getBatchDetails(String batchId);

}