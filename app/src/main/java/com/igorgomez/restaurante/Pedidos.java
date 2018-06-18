package com.igorgomez.restaurante;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pedidos extends AppCompatActivity {
    RadioGroup radioGroup;
    private RecyclerView recyclerViewMenu;
    private MenuAdaptador menuAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
        radioGroup=findViewById(R.id.rgbtnMesas);

        recyclerViewMenu=findViewById(R.id.rvPedidos);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));
        menuAdaptador=new MenuAdaptador(menu.obtenerMenu());

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbtnMesa1){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa2){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa3){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa4){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa5){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa6){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa7){
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }
            }
        });
    }
}
