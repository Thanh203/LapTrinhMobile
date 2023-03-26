package com.example.doannhom1.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DanhMucDB {
    String dbName = "DanhMucDB.db";
    Context context;
    SQLiteDatabase db;

    public DanhMucDB(Context context) {
        this.context = context;
    }
    //code first
    public SQLiteDatabase openDB(){
        return context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
    }
    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS tblDanhMuc(" +
                "IDDANHMUC INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "TENDANHMUC TEXT, " +
                "ANH TEXT)";
        db = openDB();
        db.execSQL(sql);
        db.close();
    }
    public ArrayList<DanhMuc> getDanhMuc(){
        ArrayList<DanhMuc> tmp = new ArrayList<>();
        String sql ="SELECT * FROM tblDanhMuc";
        db = openDB();
        Cursor cursor =db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int IdDanhMuc = cursor.getInt(0);
            String TenDanhMuc = cursor.getString(1);
            String Anh = cursor.getString(2);
            DanhMuc danhMuc = new DanhMuc(IdDanhMuc, TenDanhMuc, Anh);
            tmp.add(danhMuc);
        }
        db.close();
        return tmp;
    }
    public int countDanhMuc(){
        String sql = "SELECT * FROM tblDanhMuc";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        int count = cursor.getCount();
        return count;
    }
    public void insertDanhMuc(String tenDanhMuc, String anh){
        db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("TENDANHMUC", tenDanhMuc);
        cv.put("ANH", anh);
        db.insert("tblDanhMuc", null, cv);
        db.close();
    }
//    public void updateDanhMuc(int idDanhMuc, String newTenDanhMuc, String newAnh){
//        db = openDB();
//        ContentValues cv = new ContentValues();
//        cv.put("TENDANHMUC", newTenDanhMuc);
//        cv.put("ANH", newAnh);
//        db.update("tblDanhMuc", cv, "ID=" + idDanhMuc, null);
//        db.close();
//    }
//    public void deleteDanhMuc(int idDanhMuc, String newTenDanhMuc, String newAnh){
//        db = openDB();
//        db.delete("tblDanhMuc", "ID=" + idDanhMuc, null);
//        db.close();
//    }
}
