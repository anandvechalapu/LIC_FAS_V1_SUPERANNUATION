@Repository
public interface GetAllBathesClaimRepository {

    /**
     * Retrieves all batches with their corresponding batch details and errors (if any).
     * 
     * @return The list of all batches with their details and errors, or an empty list if no batches are available.
     */
    List<BatchDetailDto> getAllBathes();

    /**
     * Converts a single entity to its corresponding DTO.
     * 
     * @param entity The entity to convert.
     * @return The corresponding DTO.
     */
    BatchDetailDto convertEntityToDto(BatchEntity entity);

}