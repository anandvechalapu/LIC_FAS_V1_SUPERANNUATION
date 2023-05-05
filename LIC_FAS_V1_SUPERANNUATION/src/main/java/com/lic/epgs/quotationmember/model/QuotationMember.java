@Entity
@Table(name = "quotation_member")
public class QuotationMember {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "quotation_id")
    private String quotationId;
    
    @Column(name = "batch_id")
    private String batchId;
    
    // other fields
 
    // getters and setters
}

package com.lic.epgs.quotationmember.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "batches")
public class Batch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "batch_id")
    private String batchId;
    
    @Column(name = "created_on")
    private String createdOn;
    
    @Column(name = "file_name")
    private String fileName;
    
    @Column(name = "total_count")
    private Integer totalCount;
    
    @Column(name = "success_count")
    private Integer successCount;
    
    @Column(name = "failed_count")
    private Integer failedCount;
    
    @Column(name = "error_info")
    private List<String> errorInfo;
    
    // getters and setters
}