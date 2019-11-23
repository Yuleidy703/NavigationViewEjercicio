package com.example.navigationviewejercicio;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Usuario {
    private String Usuario;
    private String Contraseña;
    private String UrlImagen;
    private ArrayList<String> Opciones;

    public Usuario() {

    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getUrlImagen() {
        return UrlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        UrlImagen = urlImagen;
    }

    public ArrayList<String> getOpciones() {
        return Opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        Opciones = opciones;
    }
    public Usuario(JSONObject a) throws JSONException {
        Usuario = a.getString("usuario").toString();
        Contraseña = a.getString("contrasena");
        UrlImagen = a.getString("intro") ;
    }
    public static ArrayList<Usuario> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Usuario> usuario = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            usuario.add(new Usuario(datos.getJSONObject(i)));
        }
        return usuario;
    }
}
