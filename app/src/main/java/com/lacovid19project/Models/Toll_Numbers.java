package com.lacovid19project.Models;

public class Toll_Numbers {

    String sno, district, phone_numbers, remarks;

    public Toll_Numbers() {
    }

    public Toll_Numbers(String sno, String district, String phone_numbers, String remarks) {
        this.sno = sno;
        this.district = district;
        this.phone_numbers = phone_numbers;
        this.remarks = remarks;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
