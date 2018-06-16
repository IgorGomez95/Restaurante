package com.igorgomez.restaurante;

public class Plato {
    private String tvNombrePlato, tvDescripcion, tvPrecio;
    private int imgPlato;

    public Plato(){

    }

    public Plato (String tvNombrePlato, String tvDescripcion, String tvPrecio, int imgPlato){
        this.tvNombrePlato=tvNombrePlato;
        this.tvDescripcion=tvDescripcion;
        this.tvPrecio=tvPrecio;
        this.imgPlato=imgPlato;
    }

    public String getTvNombrePlato() {
        return tvNombrePlato;
    }

    public void setTvNombrePlato(String tvNombrePlato) {
        this.tvNombrePlato = tvNombrePlato;
    }

    public String getTvDescripcion() {
        return tvDescripcion;
    }

    public void setTvDescripcion(String tvDescripcion) {
        this.tvDescripcion = tvDescripcion;
    }

    public String getTvPrecio() {
        return tvPrecio;
    }

    public void setTvPrecio(String tvPrecio) {
        this.tvPrecio = tvPrecio;
    }

    public int getImgPlato() {
        return imgPlato;
    }

    public void setImgPlato(int imgPlato) {
        this.imgPlato = imgPlato;
    }

}
