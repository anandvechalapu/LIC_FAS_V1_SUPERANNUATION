package com.lic.epgs.quotationmemberaddress.service;

import com.lic.epgs.quotationmemberaddress.model.QuotationMemberAddressTempEntity;
import com.lic.epgs.quotationmemberaddress.repository.QuotationMemberAddressTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationMemberAddressTempService {

    @Autowired
    QuotationMemberAddressTempRepository quotationMemberAddressTempRepository;

    public QuotationMemberAddressTempEntity save(QuotationMemberAddressTempEntity quotationMemberAddressTempEntity){
        return quotationMemberAddressTempRepository.save(quotationMemberAddressTempEntity);
    }

}