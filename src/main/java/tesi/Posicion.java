package tesi;

import java.util.Objects;

public class Posicion {
	  
	   /* Atributos*/
	
	   private int fila;
	   private char columna;
	   
	   
	   /* Metodos get y set para los atributos*/
	   
	   /* PREGUNTAR A PEDRO ¿LOS SET PUEDEN SER PRIVATE?*/

	   public void setFila(int fila) {
			if ( 1>fila || fila>8) {
				throw new IllegalArgumentException("La fila devuelta no es la esperada.");
			}
			this.fila = fila;
		}
	   
	   public int getFila() {
			return fila;
		}


		public void setColumna(char columna) {
			if (columna <'a') {
				throw new IllegalArgumentException("La columna devuelta no es la esperada.");
			} else if (columna>'h') { 
				throw new IllegalArgumentException("La columna devuelta no es la esperada.");
			}	
			this.columna = columna;
		}
		
		public char getColumna() {
			return columna;
		}
		
		
		/* Constructor para la clase con los parematros*/
		
		public Posicion(int fila, char columna) {
			this.fila = fila;
			this.columna =columna;
			
		}

		/* Constructor copia*/
		
		public Posicion(Posicion objPosicion) {
			if (objPosicion == null) {
				throw new IllegalArgumentException("La posición copiada debería ser la misma que la pasada como parámetro.");
			}
		
		this.fila=objPosicion.fila;
		this.columna =objPosicion.columna;
		
		}
		
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
			return fila == other.fila && columna == other.columna;
		}

		/* Metodo to string*/

		@Override
		public String toString() {
			return (getFila() + ","+ getColumna());
		}
		
		
		}
	   
	   

