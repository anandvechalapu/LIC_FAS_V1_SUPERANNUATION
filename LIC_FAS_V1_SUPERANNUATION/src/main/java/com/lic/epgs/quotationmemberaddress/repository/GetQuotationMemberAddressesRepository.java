import org.springframework.data.jpa.repository.JpaRepository; 

import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressApiResponseDto;
import com.lic.epgs.quotationmemberaddress.dto.QuotationMemberAddressDto;

public interface GetQuotationMemberAddressesRepository extends JpaRepository<QuotationMemberAddressDto, Long> {
 
 QuotationMemberAddressApiResponseDto getAll(Long quotationMemberId); 
 
}