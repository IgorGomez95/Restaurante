package com.igorgomez.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Mesas extends AppCompatActivity {

    private RecyclerView recyclerViewMesa;
    private MesaAdaptador mesaAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesas);

        recyclerViewMesa=findViewById(R.id.rvMesas);
        recyclerViewMesa.setLayoutManager(new LinearLayoutManager(this));

        mesaAdaptador=new MesaAdaptador(obtenerMesas());
        recyclerViewMesa.setAdapter(mesaAdaptador);
    }

    private List<Mesa> obtenerMesas() {
        List<Mesa> mesa=new ArrayList<>();
        mesa.add(new Mesa("Mesa 1","4","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 2","6","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 3","4","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 4","8","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 5","5","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 6","8","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 7","4","Disponible",R.drawable.desocupada));
        return mesa;
    }
}
