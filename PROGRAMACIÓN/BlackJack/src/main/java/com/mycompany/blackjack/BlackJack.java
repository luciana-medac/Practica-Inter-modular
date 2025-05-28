package com.mycompany.blackjack;

import java.sql.*;
import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) throws SQLException {

        DataBaseManager dbm = new DataBaseManager();
        dbm.cargarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("");
                System.out.println("---------- MENU ----------");
                System.out.println("1. Mostrar caracteristicas del juego.");
                System.out.println("2. Mostrar estadisticas de un jugador.");
                System.out.println("3. Mostrar estadisticas de una partida.");
                System.out.println("4. Salir del programa.");
                System.out.print("Elige una opcion: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        dbm.juego.mostrarInfo();
                        break;
                    case 2:
                        System.out.println("Jugadores existentes:");
                        System.out.println("");
                        for (int i = 0; i < dbm.jugadores.size(); i++) {
                            System.out.println((i + 1) + ". " + dbm.jugadores.get(i).getNombre());
                        }
                        System.out.println("Elige un jugador:");
                        System.out.println("");
                        int eleccionJugador = Integer.parseInt(sc.nextLine()) - 1;
                        if (eleccionJugador >= 0 && eleccionJugador <= dbm.jugadores.size()) {
                            Jugador j = dbm.jugadores.get(eleccionJugador);
                            j.mostrarInfo();
                        }
                        break;
                    case 3:
                        System.out.println("Partidas exstentes:");
                        System.out.println("");
                        for (int i = 0; i < dbm.partidas.size(); i++) {
                            Partida p = dbm.partidas.get(i);
                            System.out.println((i + 1) + ". Id de la partida: " + p.getId());
                        }
                        System.out.println("Elige una partida:");
                        System.out.println("");
                        int eleccionPartida = Integer.parseInt(sc.nextLine()) - 1;
                        if (eleccionPartida >= 0 && eleccionPartida <= dbm.partidas.size()) {
                            Partida p = dbm.partidas.get(eleccionPartida);
                            p.mostrarInfo();
                        }
                        break;
                    case 4:
                        System.out.println("Cerrando el programa...");
                        dbm.cerarConexion();
                        break;
                    default:
                        System.out.println("No existe esa opción.");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error con el array.");
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduce un numero.");
            } catch (Exception e) {
                System.out.println("Error desconocido: " + e.getMessage());
            }
        } while (opcion != 4);

    }

}
