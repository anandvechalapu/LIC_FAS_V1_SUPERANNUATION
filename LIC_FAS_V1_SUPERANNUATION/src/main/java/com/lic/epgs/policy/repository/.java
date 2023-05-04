import com.lic.epgs.policy.dto.PolicyAddressDto;
import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.PolicyAddressTempEntity;
import com.lic.epgs.policy.repository.PolicyAddressTempRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl {

    @Autowired
    private PolicyAddressTempRepo policyAddressTempRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<PolicyResponseDto> saveAddressDetails(PolicyAddressDto policyAddressDto, Long policyId) {
        PolicyResponseDto policyResponseDto = new PolicyResponseDto();
        try {
            PolicyAddressTempEntity policyAddressTempEntity = modelMapper.map(policyAddressDto, PolicyAddressTempEntity.class);
            policyAddressTempEntity.setPolicyId(policyId);
            policyAddressTempRepo.save(policyAddressTempEntity);
            policyResponseDto.setStatus("SUCCESS");
            policyResponseDto.setMessage("ADDRESS SAVED");
        } catch (Exception e) {
            policyResponseDto.setStatus("ERROR");
            policyResponseDto.setMessage("FAILED TO SAVE ADDRESS");
        }
        return ResponseEntity.ok(policyResponseDto);
    }

}