@Entity
@Table(name = "common_claim_anuity_creation_options")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
@Builder
public class CommonClaimAnuityCreationOptions implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 10)
    @Column(name = "code", length = 10, nullable = false)
    private String code;

    @NotNull
    @Size(max = 50)
    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @NotNull
    @Column(name = "is_mandatory", nullable = false)
    private Boolean isMandatory;

    @NotNull
    @Column(name = "status", nullable = false)
    private Boolean status;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "created_date", updatable = false)
    @CreatedDate
    private Instant createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private Instant modifiedDate;

}