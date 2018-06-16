package com.igorgomez.restaurante;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    /*Se crea un string que tendrá la url del servidor y el nombre del archivo*/
    private static final String LOGIN_REQUEST_URL ="https://gomezchelseafc.000webhostapp.com/Login.php";
    /*Se crea de tipo map la variable params la cual tendrá una llave y un valor*/
    private Map<String,String> params;

    /*Constructor de la clase con los parametros de los datos a enviar*/
    public LoginRequest(String usuario, String contrasena, Response.Listener <String> listener){

        super(Request.Method.POST,LOGIN_REQUEST_URL,listener, null);

        /*Se definen los parámetros que serán enviados*/
        params=new HashMap<>();

        /*Se envian los parametros que recibiran las variables creadas en el php*/
        params.put("usuario",usuario);
        params.put("contrasena",contrasena);
    }
    /*Se implementa el método getParams*/
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
