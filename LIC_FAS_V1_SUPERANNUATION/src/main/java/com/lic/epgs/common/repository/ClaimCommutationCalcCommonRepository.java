@Repository
public interface ClaimCommutationCalcCommonRepository extends JpaRepository<ClaimCommutationCalcCommon, Integer> {
 
    @Query("SELECT c FROM ClaimCommutationCalcCommon c WHERE c.status = true")
    List<ClaimCommutationCalcCommon> findActiveClaimCommutationCalcCommons();
}