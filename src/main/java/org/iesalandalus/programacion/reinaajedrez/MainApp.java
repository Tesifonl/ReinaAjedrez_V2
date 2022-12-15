package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import tesi.Color;
import tesi.Consola;
import tesi.Direccion;
import tesi.Reina;

public class MainApp {
	
	static Consola R1= new Consola ();
	
	private static Reina reina;
	
	/* METODOS EN MINUSCULAS. LAS CLASES Y LOS CONSTRUCTORES EN MAYUSCUALA. */
		
	
	public void CrearReinaDefecto () {
		
		reina = new Reina();
	
	}
	
	
	public void CrearReinaColor () {
					
		Color c1= R1.ElegirOpcion();
		
		reina=new Reina(c1);	
	
	}
	
	public static void mover( ) throws OperationNotSupportedException {
	
		
		R1.MostrarMenuDirecciones();
		
		String direccion =R1.ElegirOpcionMenuDirecciones();
		
		int pasos= R1.ElegirPasos();
		
		if (direccion.equals("NORTE")){reina.mover(Direccion.NORTE, pasos);}
		if (direccion.equals("NORESTE")){reina.mover(Direccion.NORESTE, pasos);}
		if (direccion.equals("NOROESTE")){reina.mover(Direccion.NOROESTE, pasos);}
		if (direccion.equals("SUR")){reina.mover(Direccion.SUR, pasos);}
		if (direccion.equals("SURESTE")){reina.mover(Direccion.SURESTE, pasos);}
		if (direccion.equals("SUROESTE")){reina.mover(Direccion.SUROESTE, pasos);
		if (direccion.equals("ESTE")){reina.mover(Direccion.ESTE, pasos);
		if (direccion.equals("OESTE")){reina.mover(Direccion.OESTE, pasos);
		}
		}
		}
		
		
		
	}
	
	public String MostrarReina () {
		
	if(reina!=null) {return reina.toString();}
	
	else { System.out.println(" La reina no esta creada "); return null;}}
	
	
	
	public static void main(String[] args) throws OperationNotSupportedException {
	
		/* reina=new Reina(). LO QUE ESTAMOS HACIENDO ES INICIALIZAR LA REINA, NO CREAR UN OBJETO. POR ESO NO LA
		 * PONEMOS COMO Reina reina=new Reina() */
	
		int opcion;
		
		do {R1.MostrarMenu(); opcion= R1.ElegirOpcionMenu();
		
		switch (opcion) {
		
		case(1): {reina=new Reina();System.out.print(" Reina inicializada ");break;}
		
		case (2): {Color color= R1.ElegirOpcion();
		
		reina=new Reina(color);System.out.print(" Reina inicializada con color ");break;}
		
		case (3): {System.out.println(reina.getPosicion().getFila()+","+reina.getPosicion().getColumna()); mover();
		
		System.out.print(" Movimiento ");System.out.println(reina.getPosicion().getFila()+","+reina.getPosicion().getColumna());break;}
		
		case (4): {System.out.println (" Salir ");break;}
		
		}
		
		
		}while (opcion!=4);
			
		}
			
			

	}
	
	
		

