package com.example.pruebaaplicacion;

public class MainModel1 {

    String nombre,direccion,estrellas,telefono,surl;

    MainModel1(){

    }

    public MainModel1(String nombre, String direccion, String estrellas,String telefono , String surl) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.telefono = telefono;
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

    public String getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(String estrellas) {
        this.estrellas = estrellas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
