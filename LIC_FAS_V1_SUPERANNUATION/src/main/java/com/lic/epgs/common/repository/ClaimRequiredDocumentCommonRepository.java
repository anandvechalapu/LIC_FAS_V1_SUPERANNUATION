@Repository
public interface ClaimRequiredDocumentCommonRepository extends JpaRepository<ClaimRequiredDocumentCommon, Integer> {
    List<ClaimRequiredDocumentCommon> findByCodeAndIsmandatoryAndStatus(String code, String ismandatory, String status);
}