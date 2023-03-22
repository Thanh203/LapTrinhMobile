package com.example.doannhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailDanhMucActivity extends AppCompatActivity {
    TextView tvDetailDanhMucC;
    ImageView ivDanhMucC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_danh_muc);
        tvDetailDanhMucC =findViewById(R.id.tvDetailDanhMuc);
        ivDanhMucC = this.<ImageView>findViewById(R.id.ivDanhMuc);
        String name = getIntent().getStringExtra("TenDanhMuc");
        String img = getIntent().getStringExtra("Anh");
        //
        tvDetailDanhMucC.setText(name);
        ivDanhMucC.setImageBitmap(Utils.converToBitmapFromAssets(getBaseContext(), img));
    }
}