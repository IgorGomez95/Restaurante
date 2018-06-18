package com.igorgomez.restaurante;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MenuAdaptador extends RecyclerView.Adapter<MenuAdaptador.ViewHolder> {

    private List<Plato> platoList;
    public MenuAdaptador.OnItemClickListener itemClickListener;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombrePlato, tvDescripcion, tvPrecio;
        ImageView imgPlato;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNombrePlato=itemView.findViewById(R.id.tvNombrePlato);
            tvDescripcion=itemView.findViewById(R.id.tvDescripcion);
            tvPrecio=itemView.findViewById(R.id.tvPrecio);
            imgPlato=itemView.findViewById(R.id.imgPlato);
        }

        public void bind(final Plato plato,final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(plato,getAdapterPosition());
                }
            });
        }
    }

    public MenuAdaptador(List<Plato> platoList, OnItemClickListener listener){
        this.platoList=platoList;
        this.itemClickListener= listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plato,parent,false);
        MenuAdaptador.ViewHolder viewHolder =new MenuAdaptador.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNombrePlato.setText(platoList.get(position).getTvNombrePlato());
        holder.tvDescripcion.setText(platoList.get(position).getTvDescripcion());
        holder.tvPrecio.setText(platoList.get(position).getTvPrecio());
        holder.imgPlato.setImageResource(platoList.get(position).getImgPlato());

        holder.bind(platoList.get(position),itemClickListener);
    }

    @Override
    public int getItemCount() {
        return platoList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(Plato plato,int position);
    }
}
