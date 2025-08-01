package Proyecto.Final.Poo;

import java.util.Scanner;

public class JugarPartida {
	
	// Método que ejecuta la lógica del turno del jugador
    public void playMove(int[][] fieldHidden, int[][] fieldVisible) {

        mostrarTablero mostrarTab = new mostrarTablero(fieldHidden);
        Scanner sc = new Scanner(System.in);

        while (true) {
            mostrarCampoVisible(fieldHidden, fieldVisible);

            // Solicita fila
            System.out.println();
            System.out.print("Ingrese coordenada (Ej. A5):  ");          
            String input = sc.next().toUpperCase();
            System.out.println();
            
            
            if (input.length() < 2 || input.length() > 3) {
                System.out.println("Entrada inválida. Formato correcto Ej. A0 o J9.!");
                continue;
            }
            
            
            char rowChar = input.charAt(0);
            int i = rowChar - 'A';
            
            String colPart = input.substring(1);
            int j;

            try {
                j = Integer.parseInt(colPart);
            } catch (NumberFormatException e) {
                System.out.println("Número de columna inválido. Intenta nuevamente.");
                System.out.println();
                continue;
            }

         // Validación de límites
            if (i < 0 || i >= 10 || j < 0 || j >= 10 || fieldVisible[i][j] != 0) {
                System.out.println("Movimiento inválido o ya descubierto. Intenta nuevamente.");
                System.out.println();
                continue;
            }
            
            

            fieldVisible[i][j] = 1; // Marca la casilla como descubierta

            if (fieldHidden[i][j] == 9) {
            	System.out.println();
            	System.out.println();
                System.out.println("Pisaste una mina. Perdiste..!!!!");
                System.out.println();
                mostrarTab.displayHidden();
                break;
            }
        }
	
	

    }
    
    
    private void mostrarCampoVisible(int[][] fieldHidden, int[][] fieldVisible) {
        System.out.print("\t ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + "\t");
            for (int j = 0; j < 10; j++) {
                if (fieldVisible[i][j] == 0) {
                    System.out.print("  - ");
                } else {
                    if (fieldHidden[i][j] == 9) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("  " + fieldHidden[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
    
    
    
    
    

