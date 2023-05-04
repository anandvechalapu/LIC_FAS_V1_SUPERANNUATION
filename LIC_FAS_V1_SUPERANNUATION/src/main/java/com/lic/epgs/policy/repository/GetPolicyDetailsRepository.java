@Repository
public interface GetPolicyDetailsRepository extends JpaRepository<Policy, Long> {
    // Retrieve policy details by providing a valid policy ID
    @Query("SELECT p FROM Policy p WHERE p.policyId = :policyId")
    public Policy getPolicyDetails(@Param("policyId") Long policyId);
    
    // Check if policy ID exists
    public boolean existsByPolicyId(Long policyId);
}