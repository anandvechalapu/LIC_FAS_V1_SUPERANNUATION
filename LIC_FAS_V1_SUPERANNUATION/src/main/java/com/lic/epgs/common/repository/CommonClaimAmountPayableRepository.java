@Repository
public interface CommonClaimAmountPayableRepository extends JpaRepository<CommonClaimAmountPayableEntity, Long> {
    List<CommonClaimAmountPayableEntity> findAll();
}