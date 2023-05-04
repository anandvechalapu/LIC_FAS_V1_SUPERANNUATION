@Repository
public interface NomineeRelationShipCommonRepository extends JpaRepository<NomineeRelationShipCommon, Integer> {

    List<NomineeRelationShipCommon> findByStatusTrue();

}