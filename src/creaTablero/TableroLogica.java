package creaTablero;

public class TableroLogica {
	
	// Metodo que coloca 10 minas aleatoriamente
	public void colocarMinas(int[][] fieldHidden) {
		
        for (int i = 0; i < 10; i++) {
            int fil = (int)(Math.random() * 10);	 // fila aleatoria
            int col = (int)(Math.random() * 10);	 // columna aleatoria
	            if (fieldHidden[fil][col] != 9) {
	                fieldHidden[fil][col] = 9;		 // Coloca una mina
	            } else {    i--;        }		 // Repite si encuentra una mina
        }
    }// fin de METODO
	
	
	
	// Metodo que calcula todos los numeros cerca de las minas
	public void calcularNumeros(int[][] fieldHidden) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fieldHidden[i][j] == 9) {
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
	                            if (x >= 0 && x < 10 && y >= 0 && y < 10 && fieldHidden[x][y] != 9) {
	                                fieldHidden[x][y]++;
	                            }// fin de segundo IF
                        }// fin de FOR
                    }// fin de FOR
                }// fin de primer IF
            }
        }
    }// fin de METODO
	
	
	
	// Metodo que inicializa el las casillas no descubiertas
	public void inicializarCampoVisible(int[][] fieldVisible) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fieldVisible[i][j] = 0;
            }
        }
    }
	
	
	

}
