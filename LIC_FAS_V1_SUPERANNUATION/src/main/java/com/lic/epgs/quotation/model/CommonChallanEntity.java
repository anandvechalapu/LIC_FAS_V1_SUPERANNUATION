package com.lic.epgs.quotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "common_challan")
public class CommonChallanEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "chellan_number")
    private String chellanNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChellanNumber() {
        return chellanNumber;
    }

    public void setChellanNumber(String chellanNumber) {
        this.chellanNumber = chellanNumber;
    }
}