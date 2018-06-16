package com.igorgomez.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    /*Se crean las variables*/
    TextView tvRegistrate, etUsuario, etContrasena;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRegistrate = findViewById(R.id.tvReg);/*Se le asigna el elemento a la variable*/

        /*Se crea el evento para poder pasar del layout activity_main (login)
         * al activity (registro)*/
        tvRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg = new Intent(MainActivity.this,Registro.class);
                MainActivity.this.startActivity(intentReg);
            }
        });

        /*Asociación de las variables creadas con los elementos
         * de la interfaz gráfica*/
        etUsuario = findViewById(R.id.etUsuario);
        etContrasena= findViewById(R.id.etContrasena);
        btnIniciar = findViewById(R.id.btnIniciar);

        /*Evento creado del botón iniciar*/
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Definimos las variables que recibirán los textos ingresados
                 * en cada elemento de la interfaz*/
                final String usuario = etUsuario.getText().toString();
                final String contrasena = etContrasena.getText().toString();

                /*Se define un objeto de tipo Response.Listener*/
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            /*Se define un objeto de tipo JSONObject*/
                            JSONObject jsonResponse = new JSONObject(response);
                            /*Respuesta enviada desde el php*/
                            boolean success = jsonResponse.getBoolean("succes");

                            if (success){
                                /*Se mandan a traer los datos faltantes*/
                                String nombre = jsonResponse.getString("nombre");
                                String apellido = jsonResponse.getString("apellido");
                                String correo = jsonResponse.getString("correo");

                                Intent intent = new Intent(MainActivity.this, Navegador.class);
                                /*Se envian los datos extraidos de la base da datos al Main3Activity*/
                                intent.putExtra("nombre",nombre);
                                intent.putExtra("apellido", apellido);
                                intent.putExtra("usuario",usuario);
                                intent.putExtra("correo",correo);
                                intent.putExtra("contrasena",contrasena);

                                Toast.makeText(getApplicationContext(),"Éxito!!",Toast.LENGTH_SHORT).show();

                                MainActivity.this.startActivity(intent);

                            }else {

                                Toast.makeText(getApplicationContext(),"Error de Inicio de Sesión",Toast.LENGTH_LONG).show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                /*Se define un objeto de tipo LoginRequest que hace la solicitud
                 * de login al servidor*/
                LoginRequest loginRequest = new LoginRequest(usuario,contrasena,responseListener);
                RequestQueue queue= Volley.newRequestQueue(MainActivity.this);
                queue.add(loginRequest);


            }
        });
    }
}
