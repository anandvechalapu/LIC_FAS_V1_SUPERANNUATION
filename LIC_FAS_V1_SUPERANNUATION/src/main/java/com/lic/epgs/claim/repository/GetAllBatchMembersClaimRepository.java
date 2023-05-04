ANSWER

@Repository
public interface GetAllBatchMembersClaimRepository extends JpaRepository<ClaimMbrService, Long> {
    
    @Query("SELECT c FROM ClaimMbrService c WHERE c.batchId IS NOT NULL ORDER BY c.batchId DESC")
    List<ClaimSearchResponseDto> getAllBatchMembers();
}