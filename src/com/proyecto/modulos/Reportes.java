package com.proyecto.modulos;

import java.util.Scanner;

import com.proyecto.BasePrograma;

public class Reportes extends BasePrograma {
	


	 public static void main(String[] args) {
		 
		 listarMenuReportes();
	
		 Scanner in2 = new Scanner(System.in);  
			 
		 	while(in2.hasNext()) {
				 	
				    String s1 = in2.next();
				    if(s1.equals("1")) {
				        System.out.println("Se listaron los usuarios");
				    }else if(s1.equals("2")) {
				        System.out.println("Se ingreso a registrar el usuario");
				    }else if(s1.equals("3")) {
				        System.out.println("se procedio a Editar al usaurio");
				    }else if(s1.equals("9")) {
				    	
				   	 	listarMenuPrincipal();
				        break ;
				    }else {
				    	System.out.println("opci�n invalida");
				    }
			 }
		 // codigo para salir del programa
		 // in2.close();
	 }
 
}
