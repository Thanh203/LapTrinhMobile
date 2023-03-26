package com.example.doannhom1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.doannhom1.fragment.CaNhanFragment;
import com.example.doannhom1.fragment.CheBienFragment;
import com.example.doannhom1.fragment.DanhMucFragment;
import com.example.doannhom1.fragment.NguyenLieuFragment;
import com.example.doannhom1.fragment.TrangChuFragment;
import com.example.doannhom1.fragment.VideoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class DetailMonAnActivity extends AppCompatActivity {
    TextView tvNoiDungC;
    ImageView ivAnhMonAnC;
    BottomNavigationView mnBottom;
    VideoView vvVideoC;
    private TabLayout mtabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mon_an);
        mnBottom = findViewById(R.id.navMonAn);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ivAnhMonAnC = this.<ImageView>findViewById(R.id.ivAnhMonAn);
        String name = getIntent().getStringExtra("TenMonAn");
        String img = getIntent().getStringExtra("Anh");
        //
        getSupportActionBar().setTitle(name);
        ivAnhMonAnC.setImageBitmap(Utils.converToBitmapFromAssets(getBaseContext(), img));
        mnBottom.setOnItemSelectedListener(getListener());
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    @NonNull
    private NavigationBarView.OnItemSelectedListener getListener() {
        return new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnNguyenLieu:
                        String nguyenLieu = getIntent().getStringExtra("NguyenLieu");
                        loadFragment(new NguyenLieuFragment(nguyenLieu));
                        return true;
                    case R.id.mnCheBien:
                        String cheBien = getIntent().getStringExtra("CheBien");
                        loadFragment(new CheBienFragment(cheBien));
                        return true;
                    case R.id.mnVideo:
                        String video = getIntent().getStringExtra("Video");
                        loadFragment(new VideoFragment(video));
                        return true;
                }
                return true;
            }

        };
    }
    void loadFragment (Fragment fmNew)
    {
        FragmentTransaction fmCN= getSupportFragmentManager().beginTransaction();
        fmCN.replace(R.id.monan_fragment, fmNew);
        fmCN.addToBackStack(null);
        fmCN.commit();
    }
}