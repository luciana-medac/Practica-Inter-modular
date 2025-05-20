package com.mycompany.blackjack;

public class Juego {
    
    private int numJugadores;
    private String nombre;
    private String descripcion;
    
    public Juego (int nJ, String n, String d){
        this.numJugadores = nJ;
        this.nombre = n;
        this.descripcion = d;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
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
        return "Numero de jugadores: " + this.numJugadores + ", nombre: " + this.nombre + ", descripcion: " + this.descripcion;
    }
}
