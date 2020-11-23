package Evaluacionmodulo1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Usuario implements Iasesoria {
 
	public String nombre;
    public String fechaNacimiento;
    public String run;

 	public Usuario(String nombre, String fechaNacimiento, String run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	
	}

	public String toString() {
		return "nombre= " + nombre + ", Fecha de Nacimiento= " + fechaNacimiento + ", rut= " + run + ", ";
	}

	public void analizarUsuario() {	
		System.out.println("Nombre: " + nombre + ", Run: "+ run);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	
	public String mostrarEdad() {

		int anionac,aniohoy,anios;
		System.out.println("fecha  nacim :" + this.fechaNacimiento);
	    anionac =  Integer.parseInt(this.fechaNacimiento.substring(6,10));

		Calendar ahora = Calendar.getInstance();
		aniohoy = ahora.get(Calendar.YEAR);
		anios = aniohoy - anionac;
		
		return "El usuario tiene: " + anios + " años";
	}
	
	public void listUsrTipo(String tipo){
		
	}

	public void listausuario(){
		System.out.println(this.toString());
	}
}
