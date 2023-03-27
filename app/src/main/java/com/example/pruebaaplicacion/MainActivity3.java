package com.example.pruebaaplicacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {


    ImageButton imageButton12;

    List<ListElement> elements;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        init();

        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intentLoadNewActivity);
            }
        });


    }


    public void init(){
        elements= new ArrayList<>();
        elements.add(new ListElement("El bomboncito","asdasdasd","2 horas","no"));
        elements.add(new ListElement("El bomboncito","xcvxcvxcvxc","2 horas","no"));
        elements.add(new ListElement("El bomboncito","xcvxcvxcvxcv","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbvnvbnvbnvbn","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));
        elements.add(new ListElement("El bomboncito","nbmbnmbnmnbm","2 horas","no"));

        ListAdapter listAdapter = new ListAdapter(elements, this) {
            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            }
        };
        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }



}