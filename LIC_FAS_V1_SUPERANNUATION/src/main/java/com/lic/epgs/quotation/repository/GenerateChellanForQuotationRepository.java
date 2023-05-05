@Repository
public interface GenerateChellanForQuotationRepository {

    QuotationApiResponseDto generateChellanForQuotation(CommonChallanDto commonChallanDto);
}