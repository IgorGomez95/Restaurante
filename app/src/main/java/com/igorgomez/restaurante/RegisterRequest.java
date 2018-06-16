package com.igorgomez.restaurante;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    /*Se crea un string que tendrá la url del servidor*/
    private static final String REGISTER_REQUEST_URL ="https://gomezchelseafc.000webhostapp.com/Register.php";
    private Map<String,String> params;

    /*Constructor de la clase con los parametros de los datos a enviar*/
    public RegisterRequest(String nombre, String apellido, String usuario, String correo, String contrasena, Response.Listener <String> listener){

        super(Method.POST,REGISTER_REQUEST_URL,listener, null);
        /*Se definen los parámetros que serán enviados*/
        params=new HashMap<>();

        /*Se envian los parametros que recibiran las variables creadas en el php*/
        params.put("nombre",nombre);
        params.put("apellido",apellido);
        params.put("usuario",usuario);
        params.put("correo",correo);
        params.put("contrasena",contrasena);
    }

    /*Se implementa el metodo getParams*/
    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
