@Repository
public interface ClaimMemberUploadFileTypeCommonRepository extends JpaRepository<ClaimMemberUploadFileType, Integer> {

    @Query("SELECT c FROM ClaimMemberUploadFileType c WHERE c.status = true")
    List<ClaimMemberUploadFileType> findAllByStatus();

    @Query("SELECT c FROM ClaimMemberUploadFileType c WHERE c.id = :id AND c.status = true")
    ClaimMemberUploadFileType findByIdAndStatus(@Param("id") Integer id);

    @Query("SELECT c FROM ClaimMemberUploadFileType c WHERE c.code = :code AND c.status = true")
    ClaimMemberUploadFileType findByCodeAndStatus(@Param("code") String code);

    @Query("SELECT c FROM ClaimMemberUploadFileType c WHERE c.description = :description AND c.status = true")
    ClaimMemberUploadFileType findByDescriptionAndStatus(@Param("description") String description);

    @Query("SELECT c FROM ClaimMemberUploadFileType c WHERE c.isMandatory = :isMandatory AND c.status = true")
    List<ClaimMemberUploadFileType> findAllByIsMandatoryAndStatus(@Param("isMandatory") Boolean isMandatory);

}