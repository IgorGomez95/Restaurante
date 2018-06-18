package com.igorgomez.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Consumo extends AppCompatActivity {

    private TextView tvIdMesaC,tvCapacidadC,tvDisposicionC,tvConsumoC;

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
    }
}
