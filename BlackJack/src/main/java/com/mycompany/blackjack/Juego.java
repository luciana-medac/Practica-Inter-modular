package com.mycompany.blackjack;

public class Juego {

    private int id;
    private int n_jugadores;
    private String nombre;
    private String descripcion;

    public Juego(int i, int nJ, String n, String d) {
        this.id = i;
        this.n_jugadores = nJ;
        this.nombre = n;
        this.descripcion = d;
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

    @Override
    public String toString() {
        return "Numero de jugadores: " + this.n_jugadores + ", nombre: " + this.nombre + ", descripcion: " + this.descripcion;
    }
}
