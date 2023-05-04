@Repository
public interface GetAddressListPolicy9Repository {

	/**
	 * Retrieve a list of addresses associated with a policy
	 * 
	 * @param policyId the policy ID
	 * @return the list of addresses associated with the policy
	 */
	List<PolicyAddressDto> getAddressList(Long policyId);

}