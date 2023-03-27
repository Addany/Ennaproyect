package com.example.pruebaaplicacion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import org.w3c.dom.Text;

import java.util.List;

public abstract class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListElement>mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater =LayoutInflater.from(context);
        this.context= context;
        this.mData= itemList;
    }

    @Override
    public int getItemCount() {return mData.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(view);
    }

    public void onBlindViewHolder(final ListAdapter.ViewHolder holder,final int position){
        holder.blindData(mData.get(position));
    }

    public void setItems(List<ListElement> items){mData=items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView BarImage;
        TextView nombre,direccion,horas,abierto;

        ViewHolder(View itemView){
            super(itemView);
            BarImage = itemView.findViewById(R.id.Imagen);
            nombre = itemView.findViewById(R.id.namebar);
            direccion = itemView.findViewById(R.id.direccionbar);
            horas = itemView.findViewById(R.id.horaabierto);
            abierto = itemView.findViewById(R.id.abierto);
        }
        void bindData(final ListElement item) {
            nombre.setText(item.getNombre());
            direccion.setText(item.getDireccion());
            horas.setText(item.getHoras());
            abierto.setText(item.getAbierto());
        }

        public void blindData(ListElement listElement) {
        }
    }

}
