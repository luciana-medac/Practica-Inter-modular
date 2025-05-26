package com.mycompany.blackjack;

import java.sql.*;
import java.util.List;

public class DataBaseManager {

    private final String url = "jdbc:mysql://database-1.ci6wlygelbuz.us-east-1.rds.amazonaws.com/blackjack";
    private final String user = "admin";
    private final String password = "amoaMika8cho";
    private final Connection conn;
    PreparedStatement pt = null;
    ResultSet rs = null;

    public DataBaseManager() throws SQLException {
        this.conn = DriverManager.getConnection(this.url, this.user, this.password);
    }

    public Jugador getJugador(ResultSet rs) throws SQLException {

        pt = conn.prepareStatement("SELECT * FROM Jugador");
        rs = pt.executeQuery();
        Jugador j = new Jugador();
        j.setId(rs.getInt("id"));
        j.setIdJuego(rs.getInt("idJuego"));
        j.setNombre(rs.getString("nombre"));
        j.setPartidasJugadas(rs.getInt("p_jugadas"));
        return j;
    }

    public Partida getPartida(ResultSet rs) throws SQLException {

        Partida p = new Partida();
        p.setId(rs.getInt("id"));
        p.setIdJugador(rs.getInt("idJugador"));
        p.setDiamantes(rs.getInt("diamantes"));
        p.setFechaPartida(rs.getDate("f_partida"));
        return p;
    }

    public Juego getJuego() throws SQLException {

        Juego j = new Juego();
        j.setId(rs.getInt("id"));
        j.setNombre(rs.getString("nombre"));
        j.setDescripcion(rs.getString("descripcion"));
        j.setNumJugadores(rs.getInt("n_jugadores"));
        return j;
    }

    public void listarJugadores(List<Jugador> jugadores) {
        try {
            Jugador j;
            pt = conn.prepareStatement("SELECT * FROM Jugador");
            rs = pt.executeQuery();

            while (rs.next()) {
                j = getJugador(rs);
                jugadores.add(j);
            }
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    public void listarPartidas(List<Partida> partidas) {
        try {
            Partida p;
            pt = conn.prepareStatement("SELECT * FROM Partida");
            rs = pt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public Juego listarJuego() {
        Juego j = null;
        try {

            pt = conn.prepareStatement("SELECT * FROM Juego");
            rs = pt.executeQuery();

            while (rs.next()) {
                j = getJuego();
            }

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        return j;
    }
}
