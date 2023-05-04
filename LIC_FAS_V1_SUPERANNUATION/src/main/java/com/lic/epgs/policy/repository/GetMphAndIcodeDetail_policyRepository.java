@Repository
public interface GetMphAndIcodeDetail_policyRepository {

    /**
     * Retrieves the MPH and ICode details for a given policy number
     * @param policyNumber The policy number
     * @return The MPH and ICode details
     */
    MphAndIcodeResponseDto getMphAndIcodeDetail(String policyNumber);
}