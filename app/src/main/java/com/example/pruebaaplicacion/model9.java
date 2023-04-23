package com.example.pruebaaplicacion;

public class model9
{
  String nombre,direccion,surl;

    public model9() {
    }

    public model9(String course, String email, String name, String purl) {
        this.nombre = course;
        this.direccion = email;
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

    public String getSurl() {
        return surl;
    }

    public void setSurl(String purl) {
        this.surl = purl;
    }
}
