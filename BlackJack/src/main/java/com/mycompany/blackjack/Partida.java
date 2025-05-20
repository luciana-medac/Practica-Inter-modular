package com.mycompany.blackjack;

import java.util.Date;

public class Partida {
    private int idJugador;
    private int diamantes;
    private Date fechaPartida;

    public Partida(int i, int d, Date f) {
        this.idJugador = i;
        this.diamantes = d;
        this.fechaPartida = f;
    }

    public int getIdJugador() {
        return this.idJugador;
    }

    public void setIdJugador(int i) {
        this.idJugador = i;
    }

    public int getDiamantes() {
        return this.diamantes;
    }

    public void setDiamantes(int d) {
        this.diamantes = d;
    }

    public Date getFechaPartida() {
        return this.fechaPartida;
    }

    public void setFechaPartida(Date f) {
        this.fechaPartida = f;
    }

    @Override
    public String toString() {
        return "Partida: " + "id del jugador: " + this.idJugador + ", diamantes: " + this.diamantes + ", fecha de la partida: " + this.fechaPartida;
    }
}
