package com.mycompany.blackjack;

import java.util.Date;

public class Partida {
    private int id;
    private int idjugador;
    private int diamantes;
    private Date f_partida;

    public Partida() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdJugador() {
        return this.idjugador;
    }

    public void setIdJugador(int i) {
        this.idjugador = i;
    }

    public int getDiamantes() {
        return this.diamantes;
    }

    public void setDiamantes(int d) {
        this.diamantes = d;
    }

    public Date getFechaPartida() {
        return this.f_partida;
    }

    public void setFechaPartida(Date f) {
        this.f_partida = f;
    }

    @Override
    public String toString() {
        return "Partida: " + "id del jugador: " + this.idjugador + ", diamantes: " + this.diamantes + ", fecha de la partida: " + this.f_partida;
    }
}
