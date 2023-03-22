package com.example.doannhom1.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;


import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doannhom1.DetailDanhMucActivity;
import com.example.doannhom1.MainActivity;
import com.example.doannhom1.R;
import com.example.doannhom1.model.DanhMuc;
import com.example.doannhom1.model.DanhMucAdapter;
import com.example.doannhom1.model.DanhMucDB;
import com.example.doannhom1.model.DanhMucData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrangChuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DanhMucFragment extends Fragment implements DanhMucAdapter.DanhMucCallback {

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
    DanhMucDB danhMucDB;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_danh_muc, container, false);
        rvListC = view.findViewById(R.id.rvList2);

//        danhMucDB = new DanhMucDB(getContext());
//        lstDanhMuc = danhMucDB.getDanhMuc();
        lstDanhMuc = DanhMucData.getDanhMuc();
        danhMucAdapter = new DanhMucAdapter(lstDanhMuc, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        rvListC.setAdapter(danhMucAdapter);
        rvListC.setLayoutManager(gridLayoutManager);
        return view;
    }
    @Override
    public void onItemClick(String name, String img) {
        Intent i = new Intent(getContext(), DetailDanhMucActivity.class);
        i.putExtra("TenDanhMuc", name);
        i.putExtra("Anh", img);
        startActivity(i);
    }



}