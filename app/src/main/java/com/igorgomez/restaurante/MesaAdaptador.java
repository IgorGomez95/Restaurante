package com.igorgomez.restaurante;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MesaAdaptador extends RecyclerView.Adapter<MesaAdaptador.ViewHolder> {

    List<Mesa> mesaList;
    public OnItemClickListener itemClickListener;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvIdMesa, tvDisposicion, tvCapacidad;
        ImageView imgMesa;

        public ViewHolder(View itemView) {
            super(itemView);
            tvIdMesa=itemView.findViewById(R.id.tvIdMesa);
            tvDisposicion=itemView.findViewById(R.id.tvDisposicion);
            tvCapacidad=itemView.findViewById(R.id.tvCapacidad);
            imgMesa=itemView.findViewById(R.id.imgMesa);
        }

        public void bind(final Mesa mesa,final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(mesa,getAdapterPosition());
                }
            });
        }
    }

    public MesaAdaptador(List<Mesa> mesaList, OnItemClickListener listener){
        this.mesaList=mesaList;
        this.itemClickListener=listener;
    }


    @NonNull
    @Override
    public MesaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mesa,parent,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MesaAdaptador.ViewHolder holder, int position) {
        holder.tvIdMesa.setText(mesaList.get(position).getTvIdMesa());
        holder.tvCapacidad.setText(mesaList.get(position).getTvCapacidad());
        holder.tvDisposicion.setText(mesaList.get(position).getTvDisposicion());
        holder.imgMesa.setImageResource(mesaList.get(position).getImgMesa());

        holder.bind(mesaList.get(position),itemClickListener);

    }

    @Override
    public int getItemCount() {
        return mesaList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(Mesa mesa, int position);
    }

}
