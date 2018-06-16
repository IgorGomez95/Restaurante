package com.igorgomez.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    private RecyclerView recyclerViewMenu;
    private MenuAdaptador menuAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewMenu=findViewById(R.id.rvMenu);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));

        menuAdaptador=new MenuAdaptador(obtenerMenu());
        recyclerViewMenu.setAdapter(menuAdaptador);

    }

    private List<Plato> obtenerMenu() {
        List<Plato> plato=new ArrayList<>();
        plato.add(new Plato("WHOPPER BBQ","Carne a la parrilla, mayonesa, lechuga, cebolla, jitomate, pepinillos, queso americano y crujientes trozos de tocino.¡Todo acompañado de una deliciosa salsita BBQ!","$80",R.drawable.bbq_1));
        plato.add(new Plato("WHOPPER CON QUESO","Carne de res a la parrilla, preparada con jugosos tomates, lechuga recién cortada, mayonesa, pepinillos y cebollas en rodajas, sobre un pan suave con ajonjolí.","$60",R.drawable.whopperqueso_2));
        plato.add(new Plato("HAMBURGUESA CON QUESO","Hamburguesa con queso, deliciosa carne a la parrilla cubierta con una rebanada de queso amarillo derretido, pepinillos frescos, mostaza y salsa de tomate, sobre un pan suave con ajonjolí.","$50",R.drawable.hamburguesaqueso_3));
        plato.add(new Plato("WHOPPER DOBLE CON QUESO","Preparada con dos carnes de res a la parrilla, jugosos tomates, lechuga recién cortada, mayonesa, pepinillos y cebollas en rodajas, sobre un pan suave con ajonjolí.","$80",R.drawable.whopperdoble_4));
        plato.add(new Plato("HAMBURGUESA CON QUESO Y TOCINO","Carne a la parrilla, acompañada con tocino ahumado con una capa de queso americano derretido, pepinillos frescos, cátsup y mostaza sobre un pan crujiente con ajonjolí.","$70",R.drawable.hquesoytocino_5));
        plato.add(new Plato("WHOPPER ANGRY","Carne de res a la parrilla, preparada con deliciosas tiras de tocino, jugosos tomates, lechuga recién cortada, mayonesa, jalapeños y cebollitas angry, sobre un pan suave con ajonjolí.","$100",R.drawable.whopperangry_6));
        plato.add(new Plato("WHOPPER JR. CON QUESO","Una carne de res a la parrilla, preparada con jugosos tomates, lechuga recién cortada, mayonesa, pepinillos y cebollas en rodajas, sobre un pan suave con ajonjolí.","$60",R.drawable.whopperjr_7));
        plato.add(new Plato("RODEO BURGER","Acompañada de salsa BBQ ahumado y aros de cebolla crujientes, servidos con un pan suave con ajonjolí.","$75",R.drawable.rodeoburger_8));
        plato.add(new Plato("BIG KING","Dos carnes a la parrilla, una rebanada de queso amarillo, lechuga fresca, cebolla crujiente, pepinillos y salsa agridulce con tres rebanadas de pan suave con ajonjolí.","$110",R.drawable.bigking_9));
        plato.add(new Plato("MEGA XT QUESO Y TOCINO","Jugosa carne a la parrilla, queso amarillo, pepinillos, tocino crujiente y deliciosas salsas.","$100",R.drawable.megaxtqyt_10));
        plato.add(new Plato("Refresco","Acompaña tus COMBOS con un refresco grande del sabor que tú quieras!","$20",R.drawable.refresco_11));
        plato.add(new Plato("Jugo","Acompaña tus COMBOS con un jugo del sabor que tú quieras!","$15",R.drawable.jugo_12));

        return plato;
    }
}
