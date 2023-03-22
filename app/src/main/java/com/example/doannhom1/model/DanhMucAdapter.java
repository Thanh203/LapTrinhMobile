package com.example.doannhom1.model;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doannhom1.R;
import com.example.doannhom1.Utils;

import java.util.ArrayList;

public class DanhMucAdapter extends RecyclerView.Adapter<DanhMucAdapter.DanhMucViewHold> {
    ArrayList<DanhMuc> lstDanhMuc;
    Context context;
    DanhMucCallback danhMucCallback;
    public DanhMucAdapter(ArrayList<DanhMuc> lstDanhMuc, DanhMucCallback danhMucCallback) {
        this.lstDanhMuc = lstDanhMuc;
        this.danhMucCallback = danhMucCallback;
    }

    @NonNull
    @Override
    public DanhMucViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        //Nap layout cho view bieu dien phan tu danh muc
        View DanhMucView = inflater.inflate(R.layout.layoutitemdm, parent, false);
        //
        DanhMucViewHold viewHolder = new DanhMucViewHold(DanhMucView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull DanhMucViewHold holder, int position) {
        //Lay tung item cua du lieu
        DanhMuc item = lstDanhMuc.get(position);
        //Gan vao item cua view

        holder.imImage.setImageBitmap(Utils.converToBitmapFromAssets(context, item.getAnh()));
        holder.tvName.setText(item.getTenDanhMuc());
        //Set su kien
        holder.itemView.setOnClickListener(view -> danhMucCallback.onItemClick(item.getTenDanhMuc(), item.getAnh()));
    }

    @Override
    public int getItemCount() {
        return lstDanhMuc.size();
    }

    class DanhMucViewHold extends RecyclerView.ViewHolder{
        ImageView imImage;
        TextView tvName;
        public DanhMucViewHold(@NonNull View itemView) {
            super(itemView);
            imImage = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
    public interface DanhMucCallback{
        void onItemClick(String name, String img);
    }
}
