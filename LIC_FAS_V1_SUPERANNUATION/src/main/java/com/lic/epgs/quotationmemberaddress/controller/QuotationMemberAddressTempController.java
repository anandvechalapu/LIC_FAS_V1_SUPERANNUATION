package com.lic.epgs.quotationmemberaddress.repository;

import com.lic.epgs.quotationmemberaddress.model.QuotationMemberAddressTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationMemberAddressTempRepository extends JpaRepository<QuotationMemberAddressTempEntity, Long> {

}

package com.lic.epgs.quotationmemberaddress.controller;

import com.lic.epgs.quotationmemberaddress.model.QuotationMemberAddressTempEntity;
import com.lic.epgs.quotationmemberaddress.service.QuotationMemberAddressTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotation_member_address_temp")
public class QuotationMemberAddressTempController {

    @Autowired
    QuotationMemberAddressTempService quotationMemberAddressTempService;

    @PostMapping
    public QuotationMemberAddressTempEntity save(@RequestBody QuotationMemberAddressTempEntity quotationMemberAddressTempEntity) {
        return quotationMemberAddressTempService.save(quotationMemberAddressTempEntity);
    }

}