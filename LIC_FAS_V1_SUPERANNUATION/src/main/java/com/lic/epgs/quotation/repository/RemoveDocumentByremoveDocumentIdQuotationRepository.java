@Repository
public interface RemoveDocumentByremoveDocumentIdQuotationRepository extends JpaRepository<Quotation, Long> {
    Quotation findByDocIdAndQuotationIdAndIsActiveTrue(String docId, String quotationId);

    List<Quotation> findAllByQuotationIdAndIsActiveTrue(String quotationId);
}