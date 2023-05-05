@Repository
public interface QuotationMemberAddressRepository extends CrudRepository<QuotationMemberAddress,Long> {

	@Transactional
	@Modifying
	@Query("DELETE FROM QuotationMemberAddress qma WHERE qma.addressId = ?1")
	void deleteQuotationMemberAddress(Long addressId);

}