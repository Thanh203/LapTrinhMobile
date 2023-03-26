package com.example.doannhom1.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.doannhom1.R;
import com.example.doannhom1.model.MonAn;
import com.example.doannhom1.model.MonAnDB;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NguyenLieuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NguyenLieuFragment extends Fragment  {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView tvNguyenLieuC;
    String nguyenLieu;

    public NguyenLieuFragment(String nguyenLieu) {
        // Required empty public constructor
        this.nguyenLieu = nguyenLieu;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NguyenLieuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NguyenLieuFragment newInstance(String param1, String param2, String nguyenLieu) {
        NguyenLieuFragment fragment = new NguyenLieuFragment(nguyenLieu);
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
        View view = inflater.inflate(R.layout.fragment_nguyen_lieu, container, false);
        tvNguyenLieuC = view.findViewById(R.id.tvNguyenLieu);
        tvNguyenLieuC.setText(nguyenLieu);
        return view;
    }


}