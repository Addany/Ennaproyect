package com.example.pruebaaplicacion;

public class MainModel {

    String nombre,direccion,horas,surl;

    MainModel(){

    }

    public MainModel(String nombre, String direccion, String horas, String surl) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horas = horas;
        this.surl = surl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
