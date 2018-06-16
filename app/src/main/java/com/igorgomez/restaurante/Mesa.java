package com.igorgomez.restaurante;

public class Mesa {
    private String tvIdMesa, tvDisposicion,tvCapacidad;
    private int imgMesa;

    public Mesa(){
    }

    public Mesa(String tvIdMesa, String tvCapacidad, String tvDisposicion, int imgMesa){
        this.tvIdMesa=tvIdMesa;
        this.tvDisposicion=tvDisposicion;
        this.tvCapacidad=tvCapacidad;
        this.imgMesa=imgMesa;
    }

    public String getTvIdMesa() {
        return tvIdMesa;
    }

    public void setTvIdMesa(String tvIdMesa) {
        this.tvIdMesa = tvIdMesa;
    }

    public String getTvDisposicion() {
        return tvDisposicion;
    }

    public void setTvDisposicion(String tvDisposicion) {
        this.tvDisposicion = tvDisposicion;
    }

    public String getTvCapacidad() {
        return tvCapacidad;
    }

    public void setTvCapacidad(String tvCapacidad) {
        this.tvCapacidad = tvCapacidad;
    }

    public int getImgMesa() {
        return imgMesa;
    }

    public void setImgMesa(int imgMesa) {
        this.imgMesa = imgMesa;
    }

}
