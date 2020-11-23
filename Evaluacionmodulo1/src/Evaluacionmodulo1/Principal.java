package Evaluacionmodulo1;

import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		
		Contenedor  cont= new Contenedor();
	
	    int iopcion=0;
	    do {
	    	iopcion = getOpcion();
	    	if (iopcion < 9) {
	    	ejecutaMetodo(iopcion,cont);
	    	} else{
	    		for(int i = 0; i < 10; i++){
	    		      for(int j = 0; j < i; j++){
	    		        System.out.print("#");
	    		      }
	    		      System.out.println("");
	    		    }
	    		System.out.println("Fin proceso...");	
	    	  }
	   	}while (iopcion !=9)  ;           	
	}  	
	    
	public static Cliente crearCliente(){
		String rut, nombre, apellido, fechanac,afp,direccion,ssalud="",comuna,telefono,vfecha, sedad;
		char tecla;
		int edad=0;
		
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese datos de Cliente");
		// Leer rut
		
		do {
			rut= getRut();
		} while (rut =="0");
		
		//leer nombre ,apellidos
		do {
			System.out.println("Ingrese Nombres");
			nombre = leer.nextLine();  
		} while ( nombre.length() < 5 || nombre.length() > 30 )	;
		
		do {
		System.out.println("Ingrese apellido");
		apellido = leer.nextLine();
		} while (apellido.length() < 5 || apellido.length() > 30)	;
		
		
		// fecha nacimiento,
		do {
			vfecha= getFecha();
		} while (vfecha =="0");
		
		fechanac = vfecha;
			
		do { 
			System.out.println("Ingrese Edad: ");
			sedad = leer.nextLine(); 
			System.out.println("sdia: " + sedad);
			if (isNumeric(sedad) == true) {
				edad = Integer.parseInt(sedad);
	        }
			else {
	            System.out.println("No es un numero");
	        }
		} while ( edad < 0 || edad > 150 );

		
		// leer telefono
		System.out.println("Ingrese Telefono");
		telefono = leer.nextLine();
		
		//leer afp
		do {
		System.out.println("Ingrese AFP");
		afp = leer.nextLine();
		}while (apellido.length() < 4 || apellido.length() > 30)	;
		
		// leer sistema salud
		do {
		System.out.println("Ingrese Sistema Salud: (1) Fonasa, (2) Isapre");
		tecla = leer.next().charAt(0); 
		} while ( tecla != '1' && tecla != '2'   );
		
		ssalud = ssalud +tecla;
		
	     leer.nextLine();
		//leer direccion, 
	     do {
		System.out.println("Ingrese Direccion");
		direccion = leer.nextLine();
		} while (direccion.length() > 70);
		
		//comuna
		do {
				System.out.println("Ingrese Comuna");
				comuna = leer.nextLine();
		}  while (comuna.length() > 50);
		
		Cliente clie = new Cliente(nombre, fechanac,rut,apellido,telefono, afp,
				ssalud, direccion, comuna, edad); 
		return clie;
	}
	
	public static Administrativo crearAdministrativo() {
		String rut, nombre, fechanac,area,vfecha,experiencia ;
		Scanner leer= new Scanner(System.in);
		// Leer rut
		do {
			rut= getRut();
		} while (rut =="0");
		
		//leer nombre 
		nombre = getString("Ingrese Nombres", 10, 50);
							
		// fecha nacimiento
		do {
			System.out.println("Fecha de nacimiento: ");
			vfecha= getFecha();
		} while (vfecha =="0");
		
		fechanac = vfecha;
		
		area = getString("Ingrese area", 5, 20);
		experiencia = getString("Ingrese Experiencia",0,100);
				
		Administrativo adm = new Administrativo(nombre, fechanac,rut, area, experiencia);						
		return adm;
	 }
	
	public static Profesional crearProfesional() {
		String rut, nombre, fechanac="",vfecha,titulo ,fechaing;
		Scanner leer= new Scanner(System.in);
		// Leer rut
		do {
			rut= getRut();
		} while (rut =="0");
		
		//leer nombre 
		nombre = getString("Ingrese Nombres", 10, 50);
		
					
		// fecha nacimiento
		do {
			System.out.println("Fecha de nacimiento");
			vfecha= getFecha();
		} while (vfecha =="0");
		fechanac= vfecha;
		
		// fecha ingreso
		do {
			System.out.println("Fecha de Ingreso");
			vfecha= getFecha();
		} while (vfecha =="0");
		fechaing= vfecha;
		
		//leer titulo
		titulo = getString("Ingrese Titulo", 10, 50);
			
		
		Profesional profe1 = new Profesional(nombre, fechanac,rut, titulo ,fechaing);						
		return profe1;
	 }

	public static Capacitacion crearCapacitacion() {
		Capacitacion capacit = new Capacitacion("C1","Lunes","10:12","Empresa","12 horas",20);
		
		return capacit;
		
	}
	
 	public static String getRut() {
		int rut,digito,suma,resto,resultado,factor;
		String rutString, rutt2,dvt;
		Scanner leer = new Scanner(System.in);

		do{
			System.out.println("Ingrese rut sin puntos ni guion y con digito verificador:");
			rutString =leer.nextLine();
			rutString = rutString.replace("-","");
			rutt2 = rutString.substring(0,rutString.length()-1);
			rut = Integer.parseInt(rutt2);
		} while(rut <= 0); 

		for(factor = 2, suma = 0; rut > 0; factor++){
			digito = rut % 10;
			rut /= 10;
			suma += digito * factor;
				if(factor >= 7) factor = 1; 
		}

		//calcula digito

		resto = suma % 11;
		resultado = 11 -resto;

		String digv = " ";
		dvt = rutString.substring(rutString.length()-1);
		if(resultado < 10) digv = String.valueOf(resultado);
		else if (resultado == 10) digv = "K"; 
		     else digv = "0";
	
		if ( Integer.parseInt(rutt2) >= 99999999) 
			 {System.out.println("El rut debe ser menor a 99.999.999");
			  return "0";	
			 } 
		else 
		    { if (digv.equals(dvt.toUpperCase())) {return rutt2 + "-" + digv;}
		      else 
		           {System.out.println("El rut ingresado: "+ rutt2 + "-" + dvt +", no es valido" );
				    return "0";
				   }		
	        } 
	}
	
	public static String getFecha() {
		Scanner leer2= new Scanner(System.in);
		String fecha, sdia, smes, sanio;
		int idia=-1, imes=-1,ianio=-1,aniohoy;
		
		Calendar ahora = Calendar.getInstance();
		aniohoy = ahora.get(Calendar.YEAR);
		
		//System.out.println("Ingrese Fecha de Nacimiento");
		//fecha = leer2.nextLine();
		
		//leer dia
		do { 
			System.out.println("Ingrese Dia (1-30) : ");
			sdia = leer2.nextLine(); 
			if (isNumeric(sdia) == true) {
				idia = Integer.parseInt(sdia);
	        }
			else {
	            System.out.println("No es un numero");
	        }
		} while ( idia <=0 || idia > 30 );
		
		
		//leer mes
		do { 
			System.out.println("Ingrese mes (1-12) : ");
			smes = leer2.nextLine(); 
			if (isNumeric(smes) == true) {
				imes = Integer.parseInt(smes);
	        }
			else {
	            System.out.println("No es un numero");
	        }
		} while ( imes <=0 || imes > 12 );
		
	
		// leer año
		do { 
			System.out.println("Ingrese año (> 1900) : ");
			sanio = leer2.nextLine(); 
			if (isNumeric(sanio) == true) {
				ianio = Integer.parseInt(sanio);
	        }
			else {
	            System.out.println("No es un numero");
	        }
		} while (  ianio < 1900 || ianio > aniohoy );
		
		if (smes.length() ==1) { smes = "0" + smes;}
		if (sdia.length() ==1) { sdia = "0" + sdia;}
		fecha = sdia + "/"+ smes +"/" + sanio;
		

		return fecha;
	}
	
	public static boolean isNumeric(String cadena) {

	        boolean resultado;

	        try {
	            Integer.parseInt(cadena);
	            resultado = true;
	        } catch (NumberFormatException excepcion) {
	            resultado = false;
	        }

	        return resultado;
	    }
	
	public static String getString(String mensaje, int min, int max) {
		String respuesta;
		Scanner leer= new Scanner(System.in);
		do {
			System.out.println(mensaje);
			respuesta = leer.nextLine();  
		} while (respuesta.length() < min || respuesta.length() > max);
		
		return respuesta;
		
	}
	
	public static int getOpcion(){
		Scanner leer= new Scanner(System.in);
		int iopcion=0;
		String tecla;
		do {
	    	System.out.println("----------------------------");
	    	System.out.println("      Menu Opciones         ");
	    	System.out.println("----------------------------");
	    	System.out.println(
	    	  "1-> Almacenar Cliente" +"\n"	
	    	+ "2-> Almacenar Profesional" + "\n"
	    	+ "3-> Almacenar Administrativo" + "\n"
	    	+ "4-> Almacenar Capacitacion" + "\n"
	    	+ "5-> Eliminar Usuario" + "\n"
	    	+ "6-> Listar Usuarios" + "\n"
	    	+ "7-> Listar Usuarios por Tipo" + "\n"
	    	+ "8-> Listar Capacitaciones" + "\n"+ "\n"
	    	+ "9-> Salir" );
	    	System.out.println("----------------------------");
	    	System.out.println("Elija opcion (1-9)");	
	    	    	
	    	//leer opcion
			tecla = leer.nextLine(); 
			if (isNumeric(tecla) == true) {
					iopcion = Integer.parseInt(tecla);
		        }
				else {
		            System.out.println("No es un numero");
		            iopcion =0;
		        }
			} while ( iopcion <=0 || iopcion > 9 );
		return iopcion;
		
	}

	public static void ejecutaMetodo(int iopcion, Contenedor cont){
	String rut="";	
	switch(iopcion)
	{
	   case 1 :
		   Cliente clie = crearCliente();
	       cont.almacenarCliente(clie);
	       break; 	   
	   case 2 :
		   Profesional profe = crearProfesional();
	       cont.almacenarProfesional(profe);
	       break;
	   case 3 :
			Administrativo adm = crearAdministrativo();
		   cont.almacenarAdministrativo(adm);
	       break;
	   case 4 :
		   Capacitacion capacit = crearCapacitacion();
  		   cont.almacenarCapacitacion(capacit);
	       break;
	   case 5 :	   
		   do {System.out.println("Para Eliminar...");
				rut= getRut();
			} while (rut =="0");
		   cont.eliminarUsuario(rut);
	       break;
	   case 6 :
		   cont.listarUsuarios();
	       break;
	   case 7 :
		   cont.listarUsuariosporTipo();
	       break;
	   case 8 :
		   cont.listarCapacitaciones();
	}
	}

}
