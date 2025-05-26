package com.mycompany.blackjack;

public class Jugador {
    private int id;
    private int idJuego;
    private String nombre;
    private int p_jugadas;

    public Jugador() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdJuego() {
        return this.idJuego;
    }

    public void setIdJuego(int i) {
        this.idJuego = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public int getPartidasJugadas() {
        return this.p_jugadas;
    }

    public void setPartidasJugadas(int p) {
        this.p_jugadas = p;
    }

    @Override
    public String toString() {
        return "Id del juego: " + this.idJuego + ", nombre: " + this.nombre + ", partidas jugadas: " + this.p_jugadas;
    } 
}
