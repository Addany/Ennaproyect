package com.example.pruebaaplicacion;

public class ListElement {
    public String color;
    public String nombre;
    public String direccion;
    public String horas;
    public String abierto;

    public ListElement(String nombre, String direccion, String horas, String abierto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horas = horas;
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

    public String getAbierto() {
        return abierto;
    }

    public void setAbierto(String abierto) {
        this.abierto = abierto;
    }
}
