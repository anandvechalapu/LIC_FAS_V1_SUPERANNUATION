@Repository
public interface QuotationMemberNomineeRepository {

    /**
     * Retrieves all the nominees of a member from the database.
     *
     * @param memberId The ID of the member whose nominees are being retrieved.
     * @return A response in JSON format with the following properties:
     *      a. memberId: The ID of the member whose nominees are being retrieved. 
     *      b. quotationMemberNomineeDtos: An array of objects containing the details of the member's nominees,
     *         with each object having the following properties:
     *              i. nomineeId: The ID of the nominee.
     *              ii. firstName: The first name of the nominee. 
     *              iii. lastName: The last name of the nominee. 
     *              iv. relationship: The relationship of the nominee with the member. 
     *      c. transactionStatus: A string indicating the status of the transaction, which should be SUCCESS if the nominees are
     *         retrieved successfully.
     *      d. transactionMessage: A string containing a message describing the status of the transaction. If the nominees
     *         are retrieved successfully, the message should be Nominees retrieved successfully. Otherwise, it should contain
     *         an error message describing the reason for failure.
     */
    ResponseEntity<Map<String, Object>> getAll(Long memberId);
}