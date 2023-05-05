@Repository
public interface QuotationMemberAddressTempRepository extends JpaRepository<QuotationMemberAddressTempEntity, Long> {

    QuotationMemberAddressTempEntity save(QuotationMemberAddressTempEntity quotationMemberAddressTempEntity);

}