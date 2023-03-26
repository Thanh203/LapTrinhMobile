package com.example.doannhom1.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.Struct;
import java.util.ArrayList;

public class MonAnDB {
    String dbName = "MonAnDB.db";
    Context context;
    SQLiteDatabase db;
    public MonAnDB(Context context) {
        this.context = context;
    }
    public SQLiteDatabase openDB(){
        return context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
    }
    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS tblMonAn(" +
                "IDMONAN INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "TENMONAN TEXT, " +
                "NGUYENLIEU TEXT, " +
                "NOIDUNG TEXT, " +
                "VIDEO TEXT, " +
                "ANH TEXT, " +
                "IDDANHMUC INTEGER)";
        db = openDB();
        db.execSQL(sql);
        db.close();
    }
    public ArrayList<MonAn> getMonAn(){
        ArrayList<MonAn> tmp = new ArrayList<>();
        String sql ="SELECT * FROM tblMonAn";
        db = openDB();
        Cursor cursor =db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int IDMONAN = cursor.getInt(0);
            String TENMONAN = cursor.getString(1);
            String NGUYENLIEU = cursor.getString(2);
            String NOIDUNG = cursor.getString(3);
            String VIDEO = cursor.getString(4);
            String ANH = cursor.getString(5);
            int IDDANHMUC = cursor.getInt(6);
            MonAn monAn = new MonAn(IDMONAN, TENMONAN, NGUYENLIEU,NOIDUNG,VIDEO,ANH,IDDANHMUC);
            tmp.add(monAn);
        }
        db.close();
        return tmp;
    }
    public int countMonAn(){
        String sql = "SELECT * FROM tblMonAn";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        int count = cursor.getCount();
        return count;
    }
    public void insertMonAn(String tenMonAn, String nguyenLieu, String noiDung, String video, String anh, int idDanhMuc){
        db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("TENMONAN", tenMonAn);
        cv.put("NGUYENLIEU", nguyenLieu);
        cv.put("NOIDUNG", noiDung);
        cv.put("VIDEO", video);
        cv.put("ANH", anh);
        cv.put("IDDANHMUC", idDanhMuc);
        db.insert("tblMonAn", null, cv);
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
