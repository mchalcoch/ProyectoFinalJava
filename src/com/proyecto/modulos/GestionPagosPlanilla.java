package com.proyecto.modulos;

import java.util.Scanner;

import com.proyecto.BasePrograma;

public class GestionPagosPlanilla extends BasePrograma {
	

	
	 public static void main(String[] args) {
		 
		 listarMenuGestionPagosPlanilla();
	
		 Scanner in2 = new Scanner(System.in);  
			 
		 	while(in2.hasNext()) {
				 	
				    String s1 = in2.next();
				    if(s1.equals("1")) {
				        System.out.println("Se listaron los Pagos ");
				    }else if(s1.equals("2")) {
				        System.out.println("Se ingreso a registrar el Pago");
				    }else if(s1.equals("3")) {
				        System.out.println("se procedio a Editar al usaurio");
				    }else if(s1.equals("9")) {
				    	
				    	limpiarConsola();
				   	 	listarMenuPrincipal();
				        break ;
				    }else {
				    	System.out.println("opción invalida");
				    }
			 }
		 // codigo para salir del programa
		 // in2.close();
	 }
 
}
