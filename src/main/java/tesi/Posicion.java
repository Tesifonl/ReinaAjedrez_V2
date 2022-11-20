package tesi;

public class Posicion {
	
	   private int fila;
	   private char columna;
	
	
	   
	   public int getfila() {
			return fila;
		}

	   public void setfila(int fila) {
			if (fila < 1) {
				throw new IllegalArgumentException("El valor de la fila es menor que el mínimo permitido (1).");
			} else if (fila > 8) {
				throw new IllegalArgumentException("El valor de la fila es mayor que el máximo permitido (8).");
			}
			this.fila = fila;
		}

		public int getcolumna() {
			return columna;
		}

		public void setcolumna(char columna) {
			if (columna<65) {
				throw new IllegalArgumentException("El valor de la y es menor que el mínimo permitido.");
			} else if (columna>71) { 
				throw new IllegalArgumentException("El valor de la y es menor que el mínimo permitido.");
			}	
			this.columna = columna;
		}
		
		public Posicion(int fila, char columna) {
			setfila(fila);
			setcolumna(columna);
		}

		public Posicion(Posicion posicion) {
			if (posicion == null) {
				throw new NullPointerException("No puedo copiar una posición nula.");
			}
			setfila(posicion.getfila());
			setcolumna((char) posicion.getcolumna());
		}
		
		}
	   
	   

