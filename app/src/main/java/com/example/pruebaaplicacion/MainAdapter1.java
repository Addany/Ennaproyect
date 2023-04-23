package com.example.pruebaaplicacion;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter1 extends FirebaseRecyclerAdapter<MainModel1, MainAdapter1.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter1(@NonNull FirebaseRecyclerOptions<MainModel1> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel1 model) {
        holder.nombre.setText(model.getNombre());
        holder.direccion.setText(model.getDireccion());
        holder.estrellas.setText(model.getEstrellas());
        holder.telefono.setText(model.getTelefono());

        Glide.with(holder.img.getContext())
                .load(model.getSurl())
                .placeholder(com.google.firebase.storage.R.drawable.common_google_signin_btn_icon_dark)
                .circleCrop()
                .error(com.google.firebase.database.R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item1,parent,false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{


        CircleImageView img;
        TextView nombre,direccion,estrellas,telefono;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            img = (CircleImageView)itemView.findViewById(R.id.img1);
            nombre = (TextView)itemView.findViewById(R.id.nametext);
            direccion = (TextView)itemView.findViewById(R.id.coursetext);
            estrellas = (TextView)itemView.findViewById(R.id.stars);
            telefono = (TextView)itemView.findViewById(R.id.telefono);

        }
    }
}
