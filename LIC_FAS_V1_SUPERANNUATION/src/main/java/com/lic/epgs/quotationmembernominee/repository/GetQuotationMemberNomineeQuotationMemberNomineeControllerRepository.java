@Repository
public interface GetQuotationMemberNomineeQuotationMemberNomineeControllerRepository extends JpaRepository<QuotationMemberNomineeApiResponseDto, Long> {
    
    Optional<QuotationMemberNomineeApiResponseDto> findByMemberIdAndNomineeId(Long memberId, Long nomineeId);
}