package com.example.doannhom1.model;

import android.app.Application;

import java.util.ArrayList;

public class DanhMucData extends Application {
    DanhMuc danhMuc;
    @Override
    public void onCreate(){
        super.onCreate();
        danhMuc = new DanhMuc();
        
    }
    public static ArrayList<DanhMuc> getDanhMuc(){
        ArrayList<DanhMuc> lstDanhMuc = new ArrayList<>();
        lstDanhMuc.add( new DanhMuc(1, "Công thức 1","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(2, "Công thức 2","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(3, "Công thức 3","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(4, "Công thức 4","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(5, "Công thức 5","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(6, "Công thức 6","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(7, "Công thức 7","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(8, "Công thức 8","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(9, "Công thức 9","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(10, "Công thức 10","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(11, "Công thức 11","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(12, "Công thức 12","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(13, "Công thức 13","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(14, "Công thức 14","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(15, "Công thức 15","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(16, "Công thức 16","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(17, "Công thức 17","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(18, "Công thức 18","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(19, "Công thức 19","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(20, "Công thức 20","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(21, "Công thức 21","Thanh123.jpg"));
        return lstDanhMuc;
    }
}
