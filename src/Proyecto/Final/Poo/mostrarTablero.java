package Proyecto.Final.Poo;

public class mostrarTablero {
	
	// Matriz que almacena las minas y los números del campo oculto
    int[][] fieldHidden;
    
    
    public mostrarTablero(int[][] fieldHidden) {
        this.fieldHidden = fieldHidden;
    }
    
    
	
    // Muestra el campo completo con minas
    public void displayHidden() {
        
        System.out.print("\t ");              // Imprime encabezado columna
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i + "  "); // Columna numérica
        }
        System.out.println();
        

        // Imprime cada fila con letras
        for (int i = 0; i < 10; i++) {
            System.out.print((char)('A' + i) + "\t"); // Imprime encabezado de la fila
            for (int j = 0; j < 10; j++) {
                if (fieldHidden[i][j] == 9) {
                    System.out.print("  X "); // Muestra mina
                } else {
                    System.out.print("  " + fieldHidden[i][j] + " "); // Muestra número
                }
            }
            System.out.println(); // Salto de línea por fila
        }
    }

}
