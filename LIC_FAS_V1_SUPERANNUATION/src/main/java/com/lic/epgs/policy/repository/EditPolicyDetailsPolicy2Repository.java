import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policy.model.Policy;

public interface EditPolicyDetailsPolicy2Repository extends JpaRepository<Policy, Long> {

    Policy getPolicyDetailsByPolicyId(Long policyId);
    Policy save(Policy policy);
    void delete(Policy policy);
}