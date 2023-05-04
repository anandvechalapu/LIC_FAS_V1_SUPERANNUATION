import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimReasonforexitCommonRepository extends JpaRepository<ClaimReasonforexitCommon, Long> {

	List<ClaimReasonforexitCommon> findAllByOrderByCodeAsc();

	Optional<ClaimReasonforexitCommon> findByCode(String code);

	List<ClaimReasonforexitCommon> findAllByIsmandatoryTrueOrderByCodeAsc();

	List<ClaimReasonforexitCommon> findAllByStatusTrueOrderByCodeAsc();

}