import com.lic.epgs.policy.dto.PolicyDto;
import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.PolicyTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavePolicyDetails_policyRepository extends JpaRepository<PolicyTempEntity, Long> {
    public PolicyResponseDto savePolicyDetails(PolicyDto policyDto);
}