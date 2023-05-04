@Repository
public interface CommonMaritalStatusRepository extends JpaRepository<MaritalStatus, Long> {
 
    List<MaritalStatus> findByStatus(boolean status);

    Optional<MaritalStatus> findByCode(String code);

}