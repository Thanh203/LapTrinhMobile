package com.example.doannhom1.model;

import java.io.Serializable;

public class DanhMuc implements Serializable {
    int IdDanhMuc;
    String TenDanhMuc;
    String Anh;
    //
    public DanhMuc(int idDanhMuc, String tenDanhMuc, String anh) {
        IdDanhMuc = idDanhMuc;
        TenDanhMuc = tenDanhMuc;
        Anh = anh;
    }

    //

    public int getIdDanhMuc() {
        return IdDanhMuc;
    }

    public void setIdDanhMuc(int idDanhMuc) {
        IdDanhMuc = idDanhMuc;
    }

    public String getTenDanhMuc() {
        return TenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        TenDanhMuc = tenDanhMuc;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }
}