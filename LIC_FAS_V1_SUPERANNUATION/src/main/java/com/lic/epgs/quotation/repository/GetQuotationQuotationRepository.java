@Repository
public interface GetQuotationQuotationRepository extends JpaRepository<QuotationDto, Long> {
    
    @Query("SELECT q FROM QuotationDto q")
    List<QuotationDto> findAllQuotations();
    
    @Transactional
    @Modifying
    @Query("DELETE FROM QuotationDto q WHERE q.quotationNumber = :quotationNumber")
    void deleteByQuotationNumber(@Param("quotationNumber") String quotationNumber);
    
    @Transactional
    @Modifying
    @Query("UPDATE QuotationDto q SET q.proposalNumber = :proposalNumber, q.unitCode = :unitCode WHERE q.quotationNumber = :quotationNumber")
    void updateQuotation(@Param("quotationNumber") String quotationNumber, @Param("proposalNumber") String proposalNumber, @Param("unitCode") String unitCode);
    
    @Transactional
    @Modifying
    @Query("INSERT INTO QuotationDto (quotationNumber, proposalNumber, unitCode) VALUES (:quotationNumber, :proposalNumber, :unitCode)")
    void createQuotation(@Param("quotationNumber") String quotationNumber, @Param("proposalNumber") String proposalNumber, @Param("unitCode") String unitCode);
}