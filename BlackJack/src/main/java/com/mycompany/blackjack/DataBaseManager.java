package com.mycompany.blackjack;

import java.sql.*;

public class DataBaseManager {

    private final String url;
    private final String user;
    private final String password;
    private final Connection conn;

    public DataBaseManager() throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/blackjack";
        this.user = "root";
        this.password = "Med@c";
        this.conn = DriverManager.getConnection(this.url, this.user, this.password);

    }

    public void mostrarJugador() throws SQLException {

        String sql = "SELECT * FROM jugador";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int numJugadores = rs.getInt("numero_de_jugadores");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            System.out.println("Nombre: " + nombre + " / numero de jugadores: " + numJugadores +  " / descripcion: " + descripcion);
        }
    }

    public void mostrarJuego() throws SQLException {

        String sql = "SELECT * FROM juego";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int numJugadores = rs.getInt("numero_de_jugadores");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            System.out.println("Nombre: " + nombre + " / numero de jugadores: " + numJugadores +  " / descripcion: " + descripcion);
        }
    }

    public void ActualizarNota(int id, float nota) throws SQLException {

        String sql = "UPDATE  alumnos SET nota = '" + nota + "' WHERE id = '" + id + "';";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.executeUpdate();
        System.out.println("Nueva nota registrada.");
        stmt.close();
    }

    public void MostrarNota(int id) throws SQLException {
        
        String sql = "SELECT  nota FROM alumnos WHERE id = " + id + ";";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Float nota = rs.getFloat("nota");
            System.out.println("Nota: " + nota);
        }
    }
}
