package com.example.doannhom1.model;

import java.io.Serializable;

public class MonAn implements Serializable {
    private int IDMonAn;
    private String TenMonAn;
    private String NguyenLieu;
    private String NoiDung;
    private String Video;
    private String Anh;
    private String IDDanhMuc;
    //

    public MonAn(int IDMonAn, String tenMonAn, String nguyenLieu, String noiDung, String video, String anh, String IDDanhMuc) {
        this.IDMonAn = IDMonAn;
        TenMonAn = tenMonAn;
        NguyenLieu = nguyenLieu;
        NoiDung = noiDung;
        Video = video;
        Anh = anh;
        this.IDDanhMuc = IDDanhMuc;
    }

    //
    public int getIDMonAn() {
        return IDMonAn;
    }

    public void setIDMonAn(int IDMonAn) {
        this.IDMonAn = IDMonAn;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public String getNguyenLieu() {
        return NguyenLieu;
    }

    public void setNguyenLieu(String nguyenLieu) {
        NguyenLieu = nguyenLieu;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public String getVideo() {
        return Video;
    }

    public void setVideo(String video) {
        Video = video;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public String getIDDanhMuc() {
        return IDDanhMuc;
    }

    public void setIDDanhMuc(String IDDanhMuc) {
        this.IDDanhMuc = IDDanhMuc;
    }
}
