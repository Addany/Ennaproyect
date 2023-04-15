package com.example.pruebaaplicacion.ui.home;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

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
    ImageButton imageButton;
    MediaPlayer mp;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        //SE BUSCA EL MEDIAPLAYER, OSEA EL SONIDO A REPRODUCIR
        mp = MediaPlayer.create (getContext(), R.raw.beep);
        //SE DECLARA EL BOTON EN IMAGEN Y SE IDENTIFICA
        imageButton = (ImageButton)view.findViewById(R.id.imageButton);
        //CON ONCLICK SE LLAMA EL RECURSO Y AL DARLE CLICK AL BOTON SE REPRODUCE EL MISMO.
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
            }
        });


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





    private FragmentManager getSupportFragmentManager() {

        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    }
