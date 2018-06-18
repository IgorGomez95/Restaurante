package com.igorgomez.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

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

        mesaAdaptador=new MesaAdaptador(obtenerMesas(), new MesaAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Mesa mesa, int position) {
                position=position+1;
                if(position==1){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==2){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==3){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==4){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==5){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==6){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }else if(position==7){
                    Intent intent= new Intent(Mesas.this,Consumo.class);
                    intent.putExtra(getResources().getString(R.string.pIdMesa),mesa.getTvIdMesa());
                    intent.putExtra(getResources().getString(R.string.pCapacidad),mesa.getTvCapacidad());
                    intent.putExtra(getResources().getString(R.string.pDisposicion),mesa.getTvDisposicion());
                    startActivity(intent);
                }
                //Toast.makeText(Mesas.this,position,Toast.LENGTH_SHORT).show();
            }
        });
        recyclerViewMesa.setAdapter(mesaAdaptador);
    }

    private List<Mesa> obtenerMesas() {
        List<Mesa> mesa=new ArrayList<>();
        mesa.add(new Mesa("Mesa 1","Capacidad: 4 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 2","Capacidad: 6 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 3","Capacidad: 4 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 4","Capacidad: 8 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 5","Capacidad: 5 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 6","Capacidad: 8 personas","Disponible",R.drawable.desocupada));
        mesa.add(new Mesa("Mesa 7","Capacidad: 4 personas","Disponible",R.drawable.desocupada));
        return mesa;
    }
}
