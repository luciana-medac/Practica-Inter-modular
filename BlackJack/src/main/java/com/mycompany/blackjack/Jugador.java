package com.mycompany.blackjack;

public class Jugador {
    private int idJuego;
    private String nombre;
    private int partidasJugadas;

    public Jugador(int i, String n, int p) {
        this.idJuego = i;
        this.nombre = n;
        this.partidasJugadas = p;
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
        return this.partidasJugadas;
    }

    public void setPartidasJugadas(int p) {
        this.partidasJugadas = p;
    }

    @Override
    public String toString() {
        return "Id del juego: " + this.idJuego + ", nombre: " + this.nombre + ", partidas jugadas: " + this.partidasJugadas;
    } 
}
