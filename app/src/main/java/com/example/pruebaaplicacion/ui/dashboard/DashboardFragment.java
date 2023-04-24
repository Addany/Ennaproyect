package com.example.pruebaaplicacion.ui.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pruebaaplicacion.MainActivity11;
import com.example.pruebaaplicacion.MainActivity12;
import com.example.pruebaaplicacion.MainActivity13;
import com.example.pruebaaplicacion.MainActivity14;
import com.example.pruebaaplicacion.MainActivity16;
import com.example.pruebaaplicacion.MainActivity17;
import com.example.pruebaaplicacion.MainActivity8;
import com.example.pruebaaplicacion.R;
import com.example.pruebaaplicacion.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    Activity context;
    ImageButton imageButton27;
    ImageButton imageButton31;
    ImageButton imageButton29;
    ImageButton imageButton25;
    ImageButton imageButton28;
    ImageButton imageButton26;
    ImageButton imageButton24;
    ImageButton camera;
    MediaPlayer mp;

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        context =getActivity();
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;

    }

    public void onStart(){
        super.onStart();
        mp = MediaPlayer.create (getContext(), R.raw.beep);
        imageButton31 = (ImageButton) context.findViewById(R.id.imageButton31);
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity8.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton31 = (ImageButton) context.findViewById(R.id.imageButton31);
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity8.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton27 = (ImageButton) context.findViewById(R.id.imageButton27);
        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity11.class);
                startActivity(intent);
                mp.start();
            }
        });

        imageButton29 = (ImageButton) context.findViewById(R.id.imageButton29);
        imageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity12.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton25 = (ImageButton) context.findViewById(R.id.imageButton25);
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity13.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton28 = (ImageButton) context.findViewById(R.id.imageButton28);
        imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity14.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton26 = (ImageButton) context.findViewById(R.id.imageButton26);
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity17.class);
                startActivity(intent);
                mp.start();
            }
        });
        imageButton24 = (ImageButton) context.findViewById(R.id.imageButton24);
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity16.class);
                startActivity(intent);
                mp.start();
            }
        });
        camera =(ImageButton)context.findViewById(R.id.imageButton30);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
