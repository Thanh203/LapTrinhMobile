package com.example.doannhom1.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DanhMucDB {
    String TenDanhMuc = "DanhMucDB.db";
    String Anh = "DanhMucDB.db";
    Context context;
    SQLiteDatabase db;

    public DanhMucDB(Context context) {
        this.context = context;
    }
    //code first
    public SQLiteDatabase openDB(){
        return context.openOrCreateDatabase(TenDanhMuc, Context.MODE_PRIVATE, null);
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
        db =openDB();
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
}
