package com.mycompany.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int id;
    private int idJuego;
    private String nombre;
    private int p_jugadas;
    private List<Partida> partidas = new ArrayList<>();

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

    public void agregarPartida(Partida p) {
        partidas.add(p);
    }
    
    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public void mostrarInfo() {
        System.out.println("Id del juego: " + this.idJuego);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Partidas jugadas: ");
        for(Partida p : partidas) {
            System.out.println(p);
        }
    }
    
    @Override
    public String toString() {
        return "Id del juego: " + this.idJuego + ", nombre: " + this.nombre + ", partidas jugadas: " + this.p_jugadas;
    } 
}
