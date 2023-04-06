package com.example.pruebaaplicacion.ui.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pruebaaplicacion.MainActivity2;
import com.example.pruebaaplicacion.MainActivity3;
import com.example.pruebaaplicacion.R;
import com.example.pruebaaplicacion.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    Activity context;
    ImageButton imageButton18;

    

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context =getActivity();

        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;


    }

    public void onStart(){
        super.onStart();
        imageButton18 = (ImageButton) context.findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);
            }
        });





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;




    }
}