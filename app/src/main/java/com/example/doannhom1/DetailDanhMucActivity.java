package com.example.doannhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailDanhMucActivity extends AppCompatActivity {
    TextView tvDetailDanhMucC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_danh_muc);
        tvDetailDanhMucC =findViewById(R.id.tvDetailDanhMuc);

        String name = getIntent().getStringExtra("TenDanhMuc");
        //
        tvDetailDanhMucC.setText(name);
    }
}