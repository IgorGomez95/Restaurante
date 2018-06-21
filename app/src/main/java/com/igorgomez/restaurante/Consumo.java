package com.igorgomez.restaurante;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class Consumo extends AppCompatActivity {

    private TextView tvIdMesaC,tvCapacidadC,tvDisposicionC,tvConsumoC;
    private RecyclerView recyclerViewMenu;
    private MenuAdaptador menuAdaptador;
    private Button btnDesocupar;

    private int sumaConsumos(List<Plato> listaConsumos){
        int suma = 0;
        String aux;
        for(Plato plato : listaConsumos ){
            aux = plato.getTvPrecio();
            aux = aux.replaceAll("\\D+","");
            suma += Integer.parseInt(aux);
        }

        return suma;
    };

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
        btnDesocupar=findViewById(R.id.btnDesocuparMesa);

        tvIdMesaC.setText(IdMesa);
        tvCapacidadC.setText(Capacidad);
        tvDisposicionC.setText(Disposicion);

        recyclerViewMenu=findViewById(R.id.rvConsumo);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));

        if (IdMesa.equals("Mesa 1")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido1));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido1.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido1, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);
        }else if (IdMesa.equals("Mesa 2")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido2));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido2.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido2, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 3")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido3));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido3.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido3, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 4")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido4));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido4.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido4, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 5")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido5));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido5.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido5, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 6")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido6));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido6.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido6, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);

        }else if (IdMesa.equals("Mesa 7")){
            tvConsumoC.setText("Total: $" + sumaConsumos(Pedidos.pedido7));
            btnDesocupar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pedidos.pedido7.clear();
                    Intent intent = new Intent(Consumo.this,Navegador.class);
                    Consumo.this.startActivity(intent);
                }
            });
            menuAdaptador=new MenuAdaptador(Pedidos.pedido7, new MenuAdaptador.OnItemClickListener() {
                @Override
                public void onItemClick(Plato plato, int position) {

                }
            });

            recyclerViewMenu.setAdapter(menuAdaptador);
        }


    }
}
