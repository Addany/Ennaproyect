package com.example.pruebaaplicacion;

public class model1
{
  String nombre,direccion,estrellas,telefono,surl;

    public model1() {
    }

    public model1(String course, String email, String name, String purl,String telefono) {
        this.nombre = course;
        this.direccion = email;
        this.estrellas = name;
        this.surl = purl;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String course) {
        this.nombre = course;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String email) {
        this.direccion = email;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(String name) {
        this.estrellas = name;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String purl) {
        this.surl = purl;
    }

    public String getTelefono() {
        return surl;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
