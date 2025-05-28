package com.mycompany.blackjack;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseManager {

    private final String url = "jdbc:mysql://database-1.ci6wlygelbuz.us-east-1.rds.amazonaws.com/blackjack";
    private final String user = "admin";
    private final String password = "amoaMika8cho";
    private final Connection conn;
    private PreparedStatement pt;
    private ResultSet rs;
    public Juego juego;
    public List<Jugador> jugadores = new ArrayList<>();
    public List<Partida> partidas = new ArrayList<>();

    public DataBaseManager() throws SQLException {
        this.conn = DriverManager.getConnection(this.url, this.user, this.password);
    }

    public void cargarJugador() {
        try {
            pt = conn.prepareStatement("SELECT * FROM Jugador");
            rs = pt.executeQuery();
            while (rs.next()) {
                Jugador j = new Jugador();
                j.setId(rs.getInt("id"));
                j.setIdJuego(rs.getInt("idJuego"));
                j.setNombre(rs.getString("nombre"));
                j.setPartidasJugadas(rs.getInt("p_jugadas"));
                jugadores.add(j);
            }
        } catch (IndexOutOfBoundsException e) {
                System.out.println("Error con el array.");
        } catch (SQLException e) {
            System.out.println("Error de SQL.");
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    public void cargarPartida() {
        try {
            pt = conn.prepareStatement("SELECT * FROM Partida");
            rs = pt.executeQuery();
            while (rs.next()) {
                Partida p = new Partida();
                p.setId(rs.getInt("id"));
                p.setIdJugador(rs.getInt("idJugador"));
                p.setDiamantes(rs.getInt("diamantes"));
                p.setFechaPartida(rs.getDate("f_partida"));
                partidas.add(p);
                
                for (Jugador j : jugadores) {
                    if (j.getId() == p.getIdJugador()) {
                        j.agregarPartida(p);
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
                System.out.println("Error con el array.");
        } catch (SQLException e) {
            System.out.println("Error de SQL.");
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    public void cargarJuego() {
        try {
            pt = conn.prepareStatement("SELECT * FROM Juego");
            rs = pt.executeQuery();
            while (rs.next()) {
                Juego j = new Juego();
                j.setId(rs.getInt("id"));
                j.setNombre(rs.getString("nombre"));
                j.setDescripcion(rs.getString("descripcion"));
                j.setNumJugadores(rs.getInt("n_jugadores"));
                this.juego = j;
            }
        } catch (SQLException e) {
            System.out.println("Error de SQL.");
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    public void cargarDatos() {
        try {
            cargarJuego();
            cargarJugador();
            cargarPartida();
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }

    }
    
    public void cerarConexion(){
        this.conn.close();
    }
}
