package com.mycompany.blackjack;

import java.util.List;

public class Juego {

    private int id;
    private int n_jugadores;
    private String nombre;
    private String descripcion;

    public Juego() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumJugadores() {
        return n_jugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.n_jugadores = numJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void mostrarInfo() {
        System.out.println("Juego: " + this.nombre);
        System.out.println("Id: " + this.id);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Numero de jugadores: " + this.n_jugadores);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Numero de jugadores: " + this.n_jugadores + ", descripcion: " + this.descripcion;
    }
}
