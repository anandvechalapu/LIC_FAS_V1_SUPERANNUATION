package com.lic.epgs.quotationmembernominee.model;

import javax.persistence.*;

@Entity
@Table(name = "quotation_member_nominee")
public class QuotationMemberNominee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "nominee_name")
    private String nomineeName;

    @Column(name = "nominee_age")
    private Integer nomineeAge;

    @Column(name = "nominee_gender")
    private String nomineeGender;

    @Column(name = "nominee_relationship")
    private String nomineeRelationship;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public Integer getNomineeAge() {
        return nomineeAge;
    }

    public void setNomineeAge(Integer nomineeAge) {
        this.nomineeAge = nomineeAge;
    }

    public String getNomineeGender() {
        return nomineeGender;
    }

    public void setNomineeGender(String nomineeGender) {
        this.nomineeGender = nomineeGender;
    }

    public String getNomineeRelationship() {
        return nomineeRelationship;
    }

    public void setNomineeRelationship(String nomineeRelationship) {
        this.nomineeRelationship = nomineeRelationship;
    }

}