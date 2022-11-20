package tesi;

import poo.Asignatura;

public class Posicion {
	  
	   /* Atributos*/
	
	   private int fila;
	   private char columna;
	
	   /* Metodos get y set para los atributos*/
	   
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
		
		/* Constructor para la clase con los parematros*/
		
		public Posicion(int fila, char columna) {
			setfila(fila);
			setcolumna(columna);
		}

		/* Constructor copia*/
		
		public Posicion(Posicion posicion) {
			if (posicion == null) {
				throw new NullPointerException("No puedo copiar una posición nula.");
			}
			setfila(posicion.getfila());
			setcolumna((char) posicion.getcolumna());
		}
		
		/*Crea los métodos equals y hashCode para esta clase. Realiza un commit*/
		@Override
		public int hashCode() {
			return Objects.hash(fila, columna);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Posicion other = (Posicion) obj;
			return fila == other.x && y == other.columna;
		}

		/*@Override
		public String toString() {
			return String.format("fila=%s, columna=%s", fila, columna);
		}

		

		}
	   
	   

