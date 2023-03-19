package com.example.doannhom1.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doannhom1.DetailDanhMucActivity;
import com.example.doannhom1.R;
import com.example.doannhom1.model.DanhMuc;
import com.example.doannhom1.model.DanhMucAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrangChuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DanhMucFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView rvListC;
    ArrayList<DanhMuc> lstDanhMuc;
    DanhMucAdapter danhMucAdapter;
    public DanhMucFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrangChuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DanhMucFragment newInstance(String param1, String param2) {
        DanhMucFragment fragment = new DanhMucFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_danh_muc, container, false);
    }
    void LoadData(){
        lstDanhMuc = new ArrayList<>();
        lstDanhMuc.add( new DanhMuc(1, "Công thức 1","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(2, "Công thức 2","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(3, "Công thức 3","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(4, "Công thức 4","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(5, "Công thức 5","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(6, "Công thức 6","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(7, "Công thức 7","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(8, "Công thức 8","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(9, "Công thức 9","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(10, "Công thức 10","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(11, "Công thức 11","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(12, "Công thức 12","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(13, "Công thức 13","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(14, "Công thức 14","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(15, "Công thức 15","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(16, "Công thức 16","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(17, "Công thức 17","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(18, "Công thức 18","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(19, "Công thức 19","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(20, "Công thức 20","Thanh123.jpg"));
        lstDanhMuc.add( new DanhMuc(21, "Công thức 21","Thanh123.jpg"));
    }
}