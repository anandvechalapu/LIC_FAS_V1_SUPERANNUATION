@Service
public class SavePolicyDetails_policyService {

    @Autowired
    private SavePolicyDetails_policyRepository savePolicyDetails_policyRepository;

    public PolicyResponseDto savePolicyDetails(PolicyDto policyDto) {
        PolicyTempEntity policyTempEntity = new PolicyTempEntity();
        //map policyDto to policyTempEntity
        policyTempEntity = savePolicyDetails_policyRepository.save(policyTempEntity);
        //map policyTempEntity to policyResponseDto
        PolicyResponseDto policyResponseDto = new PolicyResponseDto();
        return policyResponseDto;
    }
}