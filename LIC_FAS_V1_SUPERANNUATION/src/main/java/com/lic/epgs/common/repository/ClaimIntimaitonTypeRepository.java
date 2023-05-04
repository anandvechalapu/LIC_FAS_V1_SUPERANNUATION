@Repository
public interface ClaimIntimaitonTypeRepository extends JpaRepository<ClaimIntimaitonType, Long> {
	
    // Get a list of all claim intimation types
    @Query("SELECT ct FROM ClaimIntimaitonType ct")
    public List<ClaimIntimaitonType> getAllClaimIntimaitonTypes();
    
    // Get a claim intimation type by code
    @Query("SELECT ct FROM ClaimIntimaitonType ct WHERE ct.code = :code")
    public ClaimIntimaitonType getClaimIntimaitonTypeByCode(@Param("code") String code);
    
    // Get a list of claim intimation types that are mandatory
    @Query("SELECT ct FROM ClaimIntimaitonType ct WHERE ct.isMandatory = true")
    public List<ClaimIntimaitonType> getMandatoryClaimIntimaitonTypes();
    
    // Get a list of active claim intimation types
    @Query("SELECT ct FROM ClaimIntimaitonType ct WHERE ct.status = true")
    public List<ClaimIntimaitonType> getActiveClaimIntimaitonTypes();
}