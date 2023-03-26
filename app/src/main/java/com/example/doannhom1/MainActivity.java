package com.example.doannhom1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.doannhom1.fragment.CaNhanFragment;
import com.example.doannhom1.fragment.DanhMucFragment;
import com.example.doannhom1.fragment.TrangChuFragment;
import com.example.doannhom1.model.DanhMuc;
import com.example.doannhom1.model.DanhMucAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView mnBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mnBottom = findViewById(R.id.navMenu);
        //
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Đồ án nhóm 1");
        mnBottom.setOnItemSelectedListener(getListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.optionmenu, menu);
        return true;
    }


    @NonNull
    private NavigationBarView.OnItemSelectedListener getListener() {
        return new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnTrangChu:
                        getSupportActionBar().setTitle("Trang chủ");
                        loadFragment(new TrangChuFragment());
                        return true;
                    case R.id.mnDanhMuc:
                        getSupportActionBar().setTitle("Danh mục");
                        loadFragment(new DanhMucFragment());
                        return true;
                    case R.id.mnCaNhan:
                        getSupportActionBar().setTitle("Cá nhân");
                        loadFragment(new CaNhanFragment());
                        return true;

                }
                return true;
            }

        };
    }

    //Ham load Fragment
    void loadFragment (Fragment fmNew)
    {
        FragmentTransaction fmCN= getSupportFragmentManager().beginTransaction();
        fmCN.replace(R.id.main_fragment, fmNew);
        fmCN.addToBackStack(null);
        fmCN.commit();
    }
}