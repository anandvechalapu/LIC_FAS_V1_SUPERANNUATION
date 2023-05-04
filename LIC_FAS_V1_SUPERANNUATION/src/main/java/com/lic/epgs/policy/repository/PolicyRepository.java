@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
 
    List<PolicyBankDto> getBankList(Long policyId);
}