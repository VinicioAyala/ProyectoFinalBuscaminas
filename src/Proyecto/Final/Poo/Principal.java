package Proyecto.Final.Poo;

import java.util.Scanner; // Importa la clase Scanner para entrada de datos

public class Principal { // Define la clase MineSweeper

    
    int[][] fieldHidden = new int[10][10]; // Matriz que guarda:  minas y números del campo oculto
    int[][] fieldVisible = new int[10][10];// Matriz que muestra el campo visible para el jugador

       

    // Método principal para ejecutar el juego
    public static void main(String[] args) {
    	
    	try {
    		
    			Principal m = new Principal(); // Crea instancia del juego
    	
		    	inicializarTablero tablero = new inicializarTablero();		    			    	
		    	tablero.InicioTablero(m.fieldHidden, m.fieldVisible); // Inicializa minas y números		    	
		    	
		    	JugarPartida juego = new JugarPartida();
	            juego.playMove(m.fieldHidden, m.fieldVisible);
		    	
	        
    	} catch (Exception error) {
            System.out.println("Error inngreso de coordenadas: " + error.getMessage());
        }
    	
    	
    }    
    
}
