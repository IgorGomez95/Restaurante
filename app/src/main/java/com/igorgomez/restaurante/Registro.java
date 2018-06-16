package com.igorgomez.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Registro extends AppCompatActivity implements View.OnClickListener{
    /*Se crean las variables*/
    EditText etNombre, etApellido, etUsuario, etCorreo, etContrasena;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        /*Asociación de las variables creadas con los elementos
         * de la interfaz gráfica*/
        etNombre = findViewById(R.id.editNombre);
        etApellido = findViewById(R.id.editApellido);
        etUsuario = findViewById(R.id.editUsuario);
        etCorreo = findViewById(R.id.editCorreo);
        etContrasena = findViewById(R.id.editContrasena);

        btnRegistrar = findViewById(R.id.btnRegistrar);

        /*Se crea un evento al momento de apretar el botón registrar*/
        btnRegistrar.setOnClickListener(this);
    }

    /*Evento creado del botón registrar*/
    @Override
    public void onClick(View v) {
        /*Definimos las variables que recibirán los textos ingresados
         * en cada elemento de la interfaz*/
        final String nombre=etNombre.getText().toString();
        final String apellido=etApellido.getText().toString();
        final String usuario=etUsuario.getText().toString();
        final String correo=etCorreo.getText().toString();
        final String contrasena=etContrasena.getText().toString();

        /*Se define un objeto de tipo Response.Listener*/
        Response.Listener<String> respoListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    /*Se define un objeto de tipo JSONObject*/
                    JSONObject jsonResponse=new JSONObject(response);
                    /*Respuesta enviada desde el php*/
                    boolean success=jsonResponse.getBoolean("succes");

                    if (success){
                        Intent intent=new Intent(Registro.this,MainActivity.class);
                        Registro.this.startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Exito!!",Toast.LENGTH_SHORT).show();
                    }else{

                        Toast.makeText(getApplicationContext(),"ERROR al REGISTRAR!!",Toast.LENGTH_LONG).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        /*Se define un objeto de tipo RegisterRequest que hace la solicitud
         * de registro al servidor*/
        RegisterRequest registerRequest=new RegisterRequest(nombre,apellido,usuario,correo,contrasena,respoListener);
        RequestQueue queue= Volley.newRequestQueue(Registro.this);
        queue.add(registerRequest);
    }
}
