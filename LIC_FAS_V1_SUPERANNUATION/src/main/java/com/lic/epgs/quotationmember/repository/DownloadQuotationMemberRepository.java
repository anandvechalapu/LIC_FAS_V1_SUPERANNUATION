import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.quotationmember.model.DownloadQuotationMemberController;

public interface DownloadQuotationMemberRepository extends JpaRepository<DownloadQuotationMemberController, Long> {

	@Query("SELECT qm FROM DownloadQuotationMemberController qm WHERE qm.batchId = :batchId AND qm.fileType = :fileType")
	DownloadQuotationMemberController downloadFile(@Param("batchId") Long batchId, @Param("fileType") String fileType);

}