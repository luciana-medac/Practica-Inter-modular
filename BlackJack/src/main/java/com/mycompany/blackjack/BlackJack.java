package com.mycompany.blackjack;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) throws SQLException {
        
        DataBaseManager dbm = new DataBaseManager();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        List<Jugador> jugadores = new ArrayList<>();
        List<Partida> partidas = new ArrayList<>();
        Juego j = dbm.listarJuego();
        
        do {            
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Mostrar caracteristicas del juego.");
            System.out.println("2. Mostrar estadisticas de un jugador.");
            System.out.println("3. Mostrar estadisticas de una partida.");
            System.out.println("4. Salir del programa.");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2: 

                    break;
                case 3:

                    break;
                case 4: 
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("No existe esa opción.");
            }
        } while (opcion!=4);
    }
}
