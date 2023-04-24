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

public class descfragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    String name, course, email, purl,servicio,social,telefono,valoracion;
    public descfragment() {

    }

    public descfragment(String name, String purl,String servicio,String social,String telefono,String valoracion) {
        this.name=name;
        this.purl=purl;
        this.servicio=servicio;
        this.social=social;
        this.telefono=telefono;
        this.valoracion=valoracion;
    }

    public static descfragment newInstance(String param1, String param2) {
        descfragment fragment = new descfragment();
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

        View view=inflater.inflate(R.layout.fragment_descfragment, container, false);

        ImageView imageholder=view.findViewById(R.id.imagegholder);
        TextView nameholder=view.findViewById(R.id.nameholder);
        TextView telefonoholder=view.findViewById(R.id.courseholder);
        TextView socialholder=view.findViewById(R.id.emailholder);
        TextView servicioholder=view.findViewById(R.id.emailholder3);
        TextView valoracionholder=view.findViewById(R.id.emailholder4);

        nameholder.setText(name);
        telefonoholder.setText(telefono);
        servicioholder.setText(servicio);
        socialholder.setText(social);
        valoracionholder.setText(valoracion);
        Glide.with(getContext()).load(purl).into(imageholder);


        return  view;
    }

    public void onBackPressed()
    {
        AppCompatActivity activity=(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).addToBackStack(null).commit();

    }
}