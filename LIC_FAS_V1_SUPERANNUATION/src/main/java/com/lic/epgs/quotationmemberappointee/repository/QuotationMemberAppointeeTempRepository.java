@Repository
public interface QuotationMemberAppointeeTempRepository extends JpaRepository<QuotationMemberAppointeeTempEntity, Long> {
	
	Optional<QuotationMemberAppointeeTempEntity> findByAppointeeIdAndQuotationMemberId(Long appointeeId, Long quotationMemberId);

}