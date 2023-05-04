@Repository
public interface SaveBulkMemberClaimRepository extends JpaRepository<SaveBulkMemberClaim, Integer> {

	@Query("SELECT s FROM SaveBulkMemberClaim s WHERE s.policyId = :policyId AND s.createdBy = :createdBy AND s.unitCode = :unitCode")
	SaveBulkMemberClaim findByPolicyIdAndCreatedByAndUnitCode(@Param("policyId") String policyId, @Param("createdBy") String createdBy, @Param("unitCode") String unitCode);

	@Query("SELECT s FROM SaveBulkMemberClaim s WHERE s.membershipId IN :membershipIds AND s.policyId = :policyId")
	List<SaveBulkMemberClaim> findByMembershipIdsAndPolicyId(@Param("membershipIds") List<String> membershipIds, @Param("policyId") String policyId);

	@Query("SELECT s FROM SaveBulkMemberClaim s WHERE s.membershipId IN :membershipIds")
	List<SaveBulkMemberClaim> findByMembershipIds(@Param("membershipIds") List<String> membershipIds);

	@Modifying
	@Query("UPDATE SaveBulkMemberClaim s SET s.successCount = :successCount, s.failureCount = :failureCount WHERE s.batchId = :batchId")
	int updateSuccessCountAndFailureCountByBatchId(@Param("successCount") int successCount, @Param("failureCount") int failureCount, @Param("batchId") String batchId);

}