package com.lic.epgs.policy.model;

import java.io.Serializable;

public class MphAndIcodeResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mph;
    private String icode;

    public MphAndIcodeResponseDto() {

    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getIcode() {
        return icode;
    }

    public void setIcode(String icode) {
        this.icode = icode;
    }

}