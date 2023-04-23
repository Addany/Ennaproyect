package com.example.pruebaaplicacion;

public class model5
{
  String nombre,direccion,horas,surl;

    public model5() {
    }

    public model5(String course, String email, String name, String purl) {
        this.nombre = course;
        this.direccion = email;
        this.horas = name;
        this.surl = purl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCNombre(String course) {
        this.nombre = course;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String email) {
        this.direccion = email;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String name) {
        this.horas = name;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String purl) {
        this.surl = purl;
    }
}
