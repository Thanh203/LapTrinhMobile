package com.example.doannhom1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doannhom1.model.DanhMuc;
import com.example.doannhom1.model.DanhMucAdapter;
import com.example.doannhom1.model.MonAn;
import com.example.doannhom1.model.MonAnAdapter;
import com.example.doannhom1.model.MonAnDB;
import com.example.doannhom1.model.MonAnData;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class DetailDanhMucActivity extends AppCompatActivity implements MonAnAdapter.MonAnCallback{
    RecyclerView rvListMonAnC;
    ArrayList<MonAn> lstMonAn;
    MonAnAdapter monAnAdapter;
    MonAnDB monAnDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_danh_muc);
        getSupportActionBar().setTitle("Danh sách món ăn");

        rvListMonAnC = findViewById(R.id.rvListMonAn);

        monAnDB = new MonAnDB(DetailDanhMucActivity.this);
        lstMonAn = monAnDB.getMonAn();
        //lstMonAn = MonAnData.getMonAn();
        monAnAdapter = new MonAnAdapter(lstMonAn, DetailDanhMucActivity.this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(DetailDanhMucActivity.this, 3);
        rvListMonAnC.setAdapter(monAnAdapter);
        rvListMonAnC.setLayoutManager(gridLayoutManager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.optionmenu, menu);
        return true;
    }
    @Override
    public void onItemClick(String name, String img, String nguyenLieu, String cheBien, String video) {
        Intent i = new Intent(this, DetailMonAnActivity.class);
        i.putExtra("TenMonAn", name);
        i.putExtra("Anh", img);
        i.putExtra("NguyenLieu", nguyenLieu);
        i.putExtra("CheBien", cheBien);
        i.putExtra("Video", video);
        startActivity(i);
    }

}