package com.example.doannhom1.model;

import android.app.Application;

import java.util.ArrayList;

public class DanhMucData extends Application {
    DanhMucDB danhMucDB;
    @Override
    public void onCreate(){
        super.onCreate();
        danhMucDB = new DanhMucDB(this);
        danhMucDB.createTable();
        if (danhMucDB.countDanhMuc() ==  0){
            danhMucDB.insertDanhMuc("Công thức 1","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 2","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 3","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 4","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 5","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 6","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 7","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 8","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 9","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 10","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 11","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 12","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 13","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 14","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 15","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 16","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 17","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 18","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 19","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 20","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 21","Thanh123.jpg");
            danhMucDB.insertDanhMuc("Công thức 22","Thanh123.jpg");
        }


        
    }
    public static ArrayList<DanhMuc> getDanhMuc(){
        ArrayList<DanhMuc> lstDanhMuc = new ArrayList<>();
        lstDanhMuc.add( new DanhMuc(1, "Công thức pha nước chấm","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(2, "Món khai vị và tráng miệng","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(3, "Công thức món canh","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(4, "Công thức món cơm chiên","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(5, "Công thức món xào","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(6, "Công thức món lẩu","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(7, "Công thức món nướng","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(8, "Công thức trà, cafe","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(9, "Công thức sinh tố, kem","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(10, "Công thức chè","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(11, "Công thức món cho bữa sáng","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(12, "Công thức xôi","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(13, "Công thức làm bánh","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(14, "Công thức món chay","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(15, "Công thức món ngon từ thịt bò","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(16, "Công thức món ngon từ thịt gà","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(17, "Công thức món ngon từ thịt heo","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(18, "Công thức món ngon từ thịt bê","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(19, "Công thức món ngon từ thịt vịt","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(20, "Công thức món ngon từ thịt dê","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(21, "Công thức món ngon từ thịt rắn","Thanh123.jpg"));
        return lstDanhMuc;
    }
}
