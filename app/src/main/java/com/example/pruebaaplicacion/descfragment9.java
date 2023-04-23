package com.example.pruebaaplicacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class descfragment9 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    String name, course, email, purl;
    public descfragment9() {

    }

    public descfragment9(String name, String course, String purl) {
        this.name=name;
        this.course=course;
        this.purl=purl;
    }

    public static descfragment9 newInstance(String param1, String param2) {
        descfragment9 fragment = new descfragment9();
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

        View view=inflater.inflate(R.layout.fragment_descfragment9, container, false);

        ImageView imageholder=view.findViewById(R.id.imagegholder);
        TextView nameholder=view.findViewById(R.id.nameholder);
        TextView courseholder=view.findViewById(R.id.courseholder);


        nameholder.setText(name);
        courseholder.setText(course);
        Glide.with(getContext()).load(purl).into(imageholder);


        return  view;
    }

    public void onBackPressed()
    {
        AppCompatActivity activity=(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment9()).addToBackStack(null).commit();

    }
}