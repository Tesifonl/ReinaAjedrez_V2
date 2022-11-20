package tesi;

public enum Color { Blanco ("BLANCO"), Negro ("NEGRO");
	
	   private String cadenaAMostrar;
	   
	   private Color(String cadenaAMostrar) {
			this.cadenaAMostrar = cadenaAMostrar;
		}

		@Override
		public String toString() {
			return cadenaAMostrar;
		}
}
