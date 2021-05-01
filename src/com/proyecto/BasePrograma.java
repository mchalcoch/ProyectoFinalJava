package com.proyecto;

public abstract class BasePrograma {

	// -- OPCIONES EJECUTABLE--
		public static String ID_GESTION_USUARIOS = "1";
		public static String VAL_GESTION_USUARIOS = "Gestión de Usuarios";
		public static String ID_GESTION_PEDIDOS = "2";
		public static String VAL_GESTION_PEDIDOS = "Gestión de Pedidos";
		public static String ID_GESTION_PAGOS_PLANILLA = "3";
		public static String VAL_GESTION_PAGOS_PLANILLA = "Gestión Pagos de Planilla";
		public static String ID_REPORTES = "4";
		public static String VAL_REPORTES = "Reportes";
		public static String ID_SALIR = "9";
		public static String VAL_SALIR = "Salir";
		public static String ID_ATRAS = "9";
		public static String VAL_ATRAS = "Atrás";
	
	// -- OPCIONES GESTION (USUARIO / PAGO PLANILLA)
		
		public static String ID_LISTADO_BUSQUEDA = "1";
		public static String VAL_LISTADO_BUSQUEDA= "Listado / Búsqueda";
		public static String ID_REGISTRO = "2";
		public static String VAL_REGISTRO = "Registro";
		public static String ID_EDICION = "3";
		public static String VAL_EDICION = "Edición";
		
	// -- OPCIONES REPORTES
		public static String ID_FATLAS_TARDANZAS = "1";
		public static String VAL_FATLAS_TARDANZAS= "Listado / Búsqueda";
		public static String ID_VENTAS_CLIENTES = "2";
		public static String VAL_VENTAS_CLIENTES = "Ventas x Clientes";
		public static String ID_PRODUCCION = "3";
		public static String VAL_PRODUCCION= "Producción";
		
		
		
	 public static void limpiarConsola() {
		 System.out.println("###################################");
		 System.out.print("\n\n\n\n\n");
	 }
	
	 public static void listarMenuPrincipal() {
		 limpiarConsola();
		 System.out.println("***********************************");
		 System.out.println("********  MENU PRINCIPAL:  ********");
		 System.out.println("***********************************");

		 System.out.println(ID_GESTION_USUARIOS+		" : "	+  VAL_GESTION_USUARIOS);
		 System.out.println(ID_GESTION_PEDIDOS+			" : "	+  VAL_GESTION_PEDIDOS);
		 System.out.println(ID_GESTION_PAGOS_PLANILLA+	" : "	+  VAL_GESTION_PAGOS_PLANILLA);
		 System.out.println(ID_REPORTES+				" : "	+  VAL_REPORTES);
		 System.out.println(ID_SALIR+					" : "	+  VAL_SALIR);
		 
	 }
	 
	public static void listarMenuGestionUsuarios() {
		limpiarConsola();
		 System.out.println("***************************************");
		 System.out.println("** MENU PRINCIPAL > GestionUsuarios: **");
		 System.out.println("***************************************");

		 
		 System.out.println(ID_LISTADO_BUSQUEDA+		" : "	+  VAL_LISTADO_BUSQUEDA);
		 System.out.println(ID_REGISTRO+				" : "	+  VAL_REGISTRO);
		 System.out.println(ID_EDICION+					" : "	+  VAL_EDICION);
		 System.out.println(ID_ATRAS+					" : "	+  VAL_ATRAS);
		 
			 
	}
	
	 public static void listarMenuGestionPedidos() {
		 limpiarConsola();
		 System.out.println("********************************************");
		 System.out.println("**** MENU PRINCIPAL > GestionPedidos: *****");
		 System.out.println("********************************************");

		 
		 System.out.println(ID_LISTADO_BUSQUEDA+		" : "	+  VAL_LISTADO_BUSQUEDA);
		 System.out.println(ID_REGISTRO+				" : "	+  VAL_REGISTRO);
		 System.out.println(ID_EDICION+					" : "	+  VAL_EDICION);
		 System.out.println(ID_ATRAS+					" : "	+  VAL_ATRAS);
		 
	 }
	 
	
	 public static void listarMenuGestionPagosPlanilla() {
		 limpiarConsola();
		 System.out.println("********************************************");
		 System.out.println("** MENU PRINCIPAL > GestionPagosPlanilla: **");
		 System.out.println("********************************************");

		 
		 System.out.println(ID_LISTADO_BUSQUEDA+		" : "	+  VAL_LISTADO_BUSQUEDA);
		 System.out.println(ID_REGISTRO+				" : "	+  VAL_REGISTRO);
		 System.out.println(ID_EDICION+					" : "	+  VAL_EDICION);
		 System.out.println(ID_ATRAS+					" : "	+  VAL_ATRAS);
		 
	 }
	 
	 public static void listarMenuReportes() {
		 limpiarConsola();
		 System.out.println("***************************************");
		 System.out.println("****  MENU PRINCIPAL > Reportes:  *****");
		 System.out.println("***************************************");

		 System.out.println(ID_FATLAS_TARDANZAS+		" : "	+  VAL_FATLAS_TARDANZAS);
		 System.out.println(ID_VENTAS_CLIENTES+			" : "	+  VAL_VENTAS_CLIENTES);
		 System.out.println(ID_PRODUCCION+				" : "	+  VAL_PRODUCCION);
		 System.out.println(ID_ATRAS+					" : "	+  VAL_ATRAS);
	 }
	 
}
