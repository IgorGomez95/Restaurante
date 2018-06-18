package com.igorgomez.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class Consumo extends AppCompatActivity {

    private TextView tvIdMesaC,tvCapacidadC,tvDisposicionC,tvConsumoC;
    private RecyclerView recyclerViewMenu;
    private MenuAdaptador menuAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumo);

        Bundle parametros=getIntent().getExtras();
        String IdMesa = parametros.getString(getResources().getString(R.string.pIdMesa));
        String Capacidad = parametros.getString(getResources().getString(R.string.pCapacidad));
        String Disposicion = parametros.getString(getResources().getString(R.string.pDisposicion));

        tvIdMesaC=findViewById(R.id.tvIdMesaC);
        tvCapacidadC=findViewById(R.id.tvCapacidadC);
        tvDisposicionC=findViewById(R.id.tvDisposicionC);
        tvConsumoC=findViewById(R.id.tvConsumoC);

        tvIdMesaC.setText(IdMesa);
        tvCapacidadC.setText(Capacidad);
        tvDisposicionC.setText(Disposicion);

        recyclerViewMenu=findViewById(R.id.rvConsumo);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));

        if (IdMesa.equals("Mesa 1")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido1, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);
        }else if (IdMesa.equals("Mesa 2")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido2, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 3")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido3, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 4")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido4, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 5")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido5, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 6")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido6, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 7")){
            menuAdaptador=new MenuAdaptador(Pedidos.pedido7, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);
        }


    }
}
