package com.proyecto;

import java.util.Scanner;

import com.proyecto.modulos.GestionPagosPlanilla;
import com.proyecto.modulos.GestionPedidos;
import com.proyecto.modulos.GestionUsuarios;
import com.proyecto.modulos.Reportes;

public class Ejecutable extends BasePrograma {
	
	 public static void main(String[] args) {
	 
		 listarMenuPrincipal();
		 Scanner input = new Scanner(System.in);  
		 
		 while(input.hasNext()) {
	
			    String valorIngresado = input.next();
			    
			    if(valorIngresado.equalsIgnoreCase(ID_GESTION_USUARIOS)) {
			        
					GestionUsuarios.main(args);
			        
			    }else if(valorIngresado.equalsIgnoreCase(ID_GESTION_PEDIDOS)) {
			        
			        GestionPedidos.main(args);

			    }else if(valorIngresado.equalsIgnoreCase(ID_GESTION_PAGOS_PLANILLA)) {
			        
			        GestionPagosPlanilla.main(args);
			        
			    }else if(valorIngresado.equalsIgnoreCase(ID_REPORTES)) {
			        
			    	Reportes.main(args);
			    	
			    }else if(valorIngresado.equalsIgnoreCase(ID_SALIR)) {
					if(salir(input)) {
						break;
					}
			    	
			    }else {
			    	System.out.println("opción invalida");
			    }
		 }
		 input.close();
		 System.out.println("Gracias por usar nuestro programa");
		 System.out.println("Vuelva pronto");
	 
	}
	 
	 public static boolean salir(Scanner input) {
		 
	 		System.out.println("Esta seguro que desea salir? (Y/N)");
			 
			 while(input.hasNext()) {
				 
		    		String confirmation = input.next();
		    		
			    	if(confirmation.equalsIgnoreCase("y")) {
			    		return true;
			    	}else if (confirmation.equalsIgnoreCase("n")) {
			    		listarMenuPrincipal();
			    		 break;
			    	}
			    	else {
			    		System.out.println("opción inválida");
			    	}
			    	
		    	}
			 return false;
		 }
 
}
