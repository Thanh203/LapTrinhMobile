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

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.MonAnViewHolder>{
    ArrayList<MonAn> lstMonAn;
    Context context;
    MonAnCallback monAnCallback;

    public MonAnAdapter(ArrayList<MonAn> lstMonAn, MonAnCallback monAnCallback) {
        this.lstMonAn = lstMonAn;
        this.monAnCallback = monAnCallback;
    }

    @NonNull
    @Override
    public MonAnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        //Nap layout cho view bieu dien phan tu danh muc
        View MonAnView = inflater.inflate(R.layout.layoutitemdm, parent, false);
        //
        MonAnViewHolder viewHolder = new MonAnViewHolder(MonAnView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MonAnViewHolder holder, int position) {
        MonAn item = lstMonAn.get(position);
        //Gan vao item cua view

        holder.imImage.setImageBitmap(Utils.converToBitmapFromAssets(context, item.getAnh()));
        holder.tvName.setText(item.getTenMonAn());

        //Set su kien
        holder.itemView.setOnClickListener(view -> monAnCallback.onItemClick(item.getTenMonAn(), item.getAnh(), item.getNguyenLieu(), item.getNoiDung(),item.getVideo()));
    }

    @Override
    public int getItemCount() {
        return lstMonAn.size();
    }

    class MonAnViewHolder extends RecyclerView.ViewHolder{
        ImageView imImage;
        TextView tvName;
        public MonAnViewHolder(@NonNull View itemView) {
            super(itemView);
            imImage = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
    public interface MonAnCallback{
        void onItemClick(String name, String img, String nguyenLieu, String cheBien, String Video);
    }
}
