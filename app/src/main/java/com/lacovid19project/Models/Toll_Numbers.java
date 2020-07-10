package com.lacovid19project.Models;

public class Toll_Numbers {

    String sno, name , phone_number;

    public Toll_Numbers() {
    }

    public Toll_Numbers(String sno, String name, String phone_number) {
        this.sno = sno;
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
