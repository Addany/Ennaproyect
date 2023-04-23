package com.example.pruebaaplicacion;

public class model
{
  String nombre,direccion,horas,surl,abierto;

    public model() {
    }

    public model(String course, String email, String name, String purl, String abierto) {
        this.nombre = course;
        this.direccion = email;
        this.horas = name;
        this.surl = purl;
        this.abierto = abierto;

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

    public String getAbierto() {
        return abierto;
    }

    public void setAbierto(String abierto) {
        this.abierto = abierto;
    }
}