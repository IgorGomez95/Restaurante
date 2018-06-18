package com.igorgomez.restaurante;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Pedidos extends AppCompatActivity {
    static List<Plato> pedido1=new ArrayList<>();
    static List<Plato> pedido2=new ArrayList<>();
    static List<Plato> pedido3=new ArrayList<>();
    static List<Plato> pedido4=new ArrayList<>();
    static List<Plato> pedido5=new ArrayList<>();
    static List<Plato> pedido6=new ArrayList<>();
    static List<Plato> pedido7=new ArrayList<>();
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

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbtnMesa1){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido1.add(plato);
                            }else if(position==2){
                                pedido1.add(plato);
                            }else if(position==3){
                                pedido1.add(plato);
                            }else if(position==4){
                                pedido1.add(plato);
                            }else if(position==5){
                                pedido1.add(plato);
                            }else if(position==6){
                                pedido1.add(plato);
                            }else if(position==7){
                                pedido1.add(plato);
                            }else if(position==8){
                                pedido1.add(plato);
                            }else if(position==9){
                                pedido1.add(plato);
                            }else if(position==10){
                                pedido1.add(plato);
                            }else if(position==11){
                                pedido1.add(plato);
                            }else if(position==12){
                                pedido1.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa2){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido2.add(plato);
                            }else if(position==2){
                                pedido2.add(plato);
                            }else if(position==3){
                                pedido2.add(plato);
                            }else if(position==4){
                                pedido2.add(plato);
                            }else if(position==5){
                                pedido2.add(plato);
                            }else if(position==6){
                                pedido2.add(plato);
                            }else if(position==7){
                                pedido2.add(plato);
                            }else if(position==8){
                                pedido2.add(plato);
                            }else if(position==9){
                                pedido2.add(plato);
                            }else if(position==10){
                                pedido2.add(plato);
                            }else if(position==11){
                                pedido2.add(plato);
                            }else if(position==12){
                                pedido2.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa3){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido3.add(plato);
                            }else if(position==2){
                                pedido3.add(plato);
                            }else if(position==3){
                                pedido3.add(plato);
                            }else if(position==4){
                                pedido3.add(plato);
                            }else if(position==5){
                                pedido3.add(plato);
                            }else if(position==6){
                                pedido3.add(plato);
                            }else if(position==7){
                                pedido3.add(plato);
                            }else if(position==8){
                                pedido3.add(plato);
                            }else if(position==9){
                                pedido3.add(plato);
                            }else if(position==10){
                                pedido3.add(plato);
                            }else if(position==11){
                                pedido3.add(plato);
                            }else if(position==12){
                                pedido3.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa4){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido4.add(plato);
                            }else if(position==2){
                                pedido4.add(plato);
                            }else if(position==3){
                                pedido4.add(plato);
                            }else if(position==4){
                                pedido4.add(plato);
                            }else if(position==5){
                                pedido4.add(plato);
                            }else if(position==6){
                                pedido4.add(plato);
                            }else if(position==7){
                                pedido4.add(plato);
                            }else if(position==8){
                                pedido4.add(plato);
                            }else if(position==9){
                                pedido4.add(plato);
                            }else if(position==10){
                                pedido4.add(plato);
                            }else if(position==11){
                                pedido4.add(plato);
                            }else if(position==12){
                                pedido4.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa5){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido5.add(plato);
                            }else if(position==2){
                                pedido5.add(plato);
                            }else if(position==3){
                                pedido5.add(plato);
                            }else if(position==4){
                                pedido5.add(plato);
                            }else if(position==5){
                                pedido5.add(plato);
                            }else if(position==6){
                                pedido5.add(plato);
                            }else if(position==7){
                                pedido5.add(plato);
                            }else if(position==8){
                                pedido5.add(plato);
                            }else if(position==9){
                                pedido5.add(plato);
                            }else if(position==10){
                                pedido5.add(plato);
                            }else if(position==11){
                                pedido5.add(plato);
                            }else if(position==12){
                                pedido5.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa6){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido6.add(plato);
                            }else if(position==2){
                                pedido6.add(plato);
                            }else if(position==3){
                                pedido6.add(plato);
                            }else if(position==4){
                                pedido6.add(plato);
                            }else if(position==5){
                                pedido6.add(plato);
                            }else if(position==6){
                                pedido6.add(plato);
                            }else if(position==7){
                                pedido6.add(plato);
                            }else if(position==8){
                                pedido6.add(plato);
                            }else if(position==9){
                                pedido6.add(plato);
                            }else if(position==10){
                                pedido6.add(plato);
                            }else if(position==11){
                                pedido6.add(plato);
                            }else if(position==12){
                                pedido6.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }else if(checkedId==R.id.rbtnMesa7){
                    menuAdaptador=new MenuAdaptador(menu.obtenerMenu(), new MenuAdaptador.OnItemClickListener() {
                        @Override
                        public void onItemClick(Plato plato, int position) {
                            position=position+1;
                            if(position==1){
                                pedido7.add(plato);
                            }else if(position==2){
                                pedido7.add(plato);
                            }else if(position==3){
                                pedido7.add(plato);
                            }else if(position==4){
                                pedido7.add(plato);
                            }else if(position==5){
                                pedido7.add(plato);
                            }else if(position==6){
                                pedido7.add(plato);
                            }else if(position==7){
                                pedido7.add(plato);
                            }else if(position==8){
                                pedido7.add(plato);
                            }else if(position==9){
                                pedido7.add(plato);
                            }else if(position==10){
                                pedido7.add(plato);
                            }else if(position==11){
                                pedido7.add(plato);
                            }else if(position==12){
                                pedido7.add(plato);
                            }

                            Toast.makeText(Pedidos.this,"Agregado Platillo "+position,Toast.LENGTH_SHORT).show();
                        }
                    });
                    recyclerViewMenu.setAdapter(menuAdaptador);
                }
            }
        });
    }
}
