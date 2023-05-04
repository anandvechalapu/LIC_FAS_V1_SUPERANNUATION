import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policy.model.PolicyBankDto;
import com.lic.epgs.policy.model.PolicyBankTempEntity;
import com.lic.epgs.policy.model.PolicyResponseDto;

public interface SaveBankDetails_policyRepository extends JpaRepository<PolicyBankTempEntity, Long> {
	
	PolicyResponseDto saveBankDetails(PolicyBankDto policyBankDto);

}