package Evaluacionmodulo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contenedor {
		
	//instancias de la interface Asesoria, pueden  almacenar distintos 
	//tipos de usuarios
	public List<Iasesoria> lusuarios = new ArrayList<Iasesoria>();
	
	public List<Capacitacion> lcapacitaciones = new ArrayList<Capacitacion>();
	
	public Contenedor(){	
	}
	
	public void almacenarCliente(Iasesoria usrClie)
	{
	//permite agregar un nuevo cliente a la lista de instancias de la
	//interface Asesoria.
			lusuarios.add(usrClie);
	}
	
	public void almacenarProfesional(Iasesoria usrProf){
		//: permite agregar un nuevo profesional a la lista de instancias
		lusuarios.add(usrProf);
	}

	public void  almacenarAdministrativo(Iasesoria usrAdm){
	//: permite agregar un nuevo administrativo a la lista de
	//instancias de la interface Asesoria.
		lusuarios.add(usrAdm);
    }
	
	public void  almacenarCapacitacion(Capacitacion cap){
	//	: permite agregar una nueva capacitación a la lista de	
	//instancias de la clase Capacitacion.
		lcapacitaciones.add(cap);
	}
	
	public void eliminarUsuario(String rut){
 	// permite eliminar un usuario desde la lista de interfaces de Asesoria,
	//de acuerdo con el RUN del usuario.
		String datos;		
		int intIndex , ind;
		
		if ( !lusuarios.isEmpty()){
			System.out.println("rut a buscar:"+ rut);
			Iterator<Iasesoria> lusrIterator = lusuarios.iterator();

			while(lusrIterator.hasNext()){
				Iasesoria usr = lusrIterator.next(); 
				
				datos=usr.toString();
				intIndex = datos.indexOf(rut);
				ind =lusuarios.indexOf(usr);

				if(intIndex == - 1){
					System.out.println("rut no encontrado");
				}else{
					System.out.println("rut encontrado pos("+ind+"). Procede  a Eliminar de lista...");
					lusrIterator.remove();
					System.out.println("Usuario Eliminado");
					if (lusuarios.isEmpty()){
						System.out.println("lista quedó vacía");
						break;}
	             	}
			} // for
		}
		else {System.out.println("lista está vacía");}
	}	
	
	public void  listarUsuarios(){
	// permite desplegar la lista completa de usuarios, independiente del
	//tipo. En este método solo se deben desplegar los datos de la clase usuario.
		if (!lusuarios.isEmpty()){
			for(Iasesoria a: lusuarios) {
				a.listausuario();
			}
		}else
		{
			System.out.println("lista está vacía");
		}
	}
	
	public void  listarUsuariosporTipo(){
	//recibe un tipo de usuario (cliente, administrador o 	//profesional), 
	//y retorna los datos respectivos según el tipo de usuario.
		String tipo="";
		Scanner leer= new Scanner(System.in);
		if (!lusuarios.isEmpty()){
			do{
				System.out.println("Ingrese tipo de Usuario a Listar");	
				System.out.println("(Administrativo, Cliente, Profesional): ");	
				tipo = leer.nextLine();	
			} while (!tipo.toUpperCase().equals("ADMINISTRATIVO")  
				  && !tipo.toUpperCase().equals("CLIENTE") 
				  && !tipo.toUpperCase().equals("PROFESIONAL")
				  );
					
			for(Iasesoria a: lusuarios) {
			a.listUsrTipo(tipo);
			}
		}else
			{System.out.println("lista está vacía");}
	}
	
    public void listarCapacitaciones(){
	//este método despliega las capacitaciones registradas en la lista
	//respectiva, junto con los datos del cliente al que está asociada dicha capacitación.
    	if (!lcapacitaciones.isEmpty()){
	    	for(Capacitacion cap: lcapacitaciones) {	
				System.out.println(cap.toString());
			}
    	}
    	else{System.out.println("lista está vacía");}
	}
}
