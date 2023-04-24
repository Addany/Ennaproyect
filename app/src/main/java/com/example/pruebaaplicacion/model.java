package com.example.pruebaaplicacion;

public class model
{
  String nombre,direccion,horas,surl,abierto,valoracion,telefono,social,servicio;

    public model() {
    }

    public model(String course, String email, String name, String purl, String abierto, String valoracion,String telefono, String social, String servicio) {
        this.nombre = course;
        this.direccion = email;
        this.horas = name;
        this.surl = purl;
        this.abierto = abierto;
        this.valoracion = valoracion;
        this.telefono = telefono;
        this.social = social;
        this.servicio= servicio;

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

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String social) {
        this.servicio = social;
    }


}