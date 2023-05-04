@Repository
public interface CommonClaimAnuityCreationOptionsRepository extends JpaRepository<CommonClaimAnuityCreationOptions, Long> {
    
    List<CommonClaimAnuityCreationOptions> findAllByStatusTrue();
    Optional<CommonClaimAnuityCreationOptions> findByIdAndStatusTrue(Long id);
    Optional<CommonClaimAnuityCreationOptions> findByCodeAndStatusTrue(String code);
    Optional<CommonClaimAnuityCreationOptions> findByDescriptionAndStatusTrue(String description);
    Optional<CommonClaimAnuityCreationOptions> findByIsMandatoryAndStatusTrue(Boolean isMandatory);
}