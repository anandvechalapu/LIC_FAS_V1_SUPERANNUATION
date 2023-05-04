@Repository
public interface EditPolicyDetails_policy2Repository extends JpaRepository<EditPolicyDetails_policy2, Long> {
    Optional<EditPolicyDetails_policy2> findByPolicyId(String policyId);
    EditPolicyDetails_policy2 save(EditPolicyDetails_policy2 policy);
    void deleteById(Long id);
}