package Proyecto.Final.Poo;

import creaTablero.TableroLogica; // Importa codigo del otro paquete

public class inicializarTablero {
	
		// Método para inicializar el campo con minas y números
	    public void InicioTablero(int[][] fieldHidden, int[][] fieldVisible) {
	    	
	    	TableroLogica logica = new TableroLogica();
	    	
	    	logica.colocarMinas(fieldHidden);
	    	logica.calcularNumeros(fieldHidden);
	    	logica.inicializarCampoVisible(fieldVisible);	    	
	        
	    }//fin de metodo InicioTablero()    

}
