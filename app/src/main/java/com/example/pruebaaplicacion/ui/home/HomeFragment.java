package com.example.pruebaaplicacion.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.example.pruebaaplicacion.MainActivity10;
import com.example.pruebaaplicacion.MainActivity15;
import com.example.pruebaaplicacion.MainActivity9;
import com.example.pruebaaplicacion.R;
import com.example.pruebaaplicacion.databinding.FragmentHomeBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private GoogleMap mMap;
    ImageButton imageButton15;

    ImageButton imageButton16;
    ImageButton imageButton33;

    MediaPlayer mp;
    Activity context;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        context =getActivity();

        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();



        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map);
        assert supportMapFragment != null;
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(18.13306398895239, -94.46191951312794),7));
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(18.153481356906607, -94.4378998637572))
                        .title("Piramide Coatzacoalcos"));
            }
        });

        return view;

    }

    public void onStart(){
        super.onStart();
        mp = MediaPlayer.create (getContext(), R.raw.beep);
        imageButton15 = (ImageButton) context.findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity9.class);
                startActivity(intent);
                mp.start();
            }
        });

        imageButton16 = (ImageButton) context.findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity10.class);
                startActivity(intent);
                mp.start();
            }
        });

        imageButton33 = (ImageButton) context.findViewById(R.id.imageButton33);
        imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity15.class);
                startActivity(intent);
                mp.start();
            }
        });
    }


    private FragmentManager getSupportFragmentManager() {

        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    }
