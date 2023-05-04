import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimApproverActionsRepository extends JpaRepository<ClaimApproverActions, Long> {

	List<ClaimApproverActions> findAll();
	
	Optional<ClaimApproverActions> findById(Long id);
	
	Optional<ClaimApproverActions> findByCode(String code);
	
	Optional<ClaimApproverActions> findByDescription(String description);
	
	Optional<ClaimApproverActions> findByIsMandatory(String isMandatory);
	
	Optional<ClaimApproverActions> findByStatus(String status);
	
	List<ClaimApproverActions> findByIsMandatoryAndStatus(String isMandatory, String status);
	
}