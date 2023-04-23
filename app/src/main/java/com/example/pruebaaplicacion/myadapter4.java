package com.example.pruebaaplicacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter4 extends FirebaseRecyclerAdapter<model4, myadapter4.myviewholder>
{

    public myadapter4(@NonNull FirebaseRecyclerOptions<model4> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final model4 model) {
        holder.nametext.setText(model.getNombre());
        holder.coursetext.setText(model.getDireccion());
        holder.emailtext.setText(model.getHoras());
        Glide.with(holder.img1.getContext()).load(model.getSurl()).into(holder.img1);

        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new descfragment4(model.getNombre(),model.getDireccion(),model.getHoras(),model.getSurl())).addToBackStack(null).commit();
            }
        });
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign4,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img1;
        TextView nametext,coursetext,emailtext;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img1);
            nametext=itemView.findViewById(R.id.nametext);
            coursetext=itemView.findViewById(R.id.coursetext);
            emailtext=itemView.findViewById(R.id.emailtext);
        }
    }

}
