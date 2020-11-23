package Evaluacionmodulo1;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

	public String apellidos;
    public String telefono;
    public String afp;
    public String sistemaSalud;
    public String direccion;
    public String comuna;
    public int edad;

    public List<VisitaTerreno> visitaTerreno = new ArrayList<VisitaTerreno> ();

    public List<Capacitacion> capacitacion = new ArrayList<Capacitacion> ();

    public List<Accidente> accidente = new ArrayList<Accidente> ();

	public Cliente(String Nombre,       String fechaNacimiento, String RUN, 
			       String apellidos,    String telefono,        String afp,
			       String sistemaSalud, String direccion,       String comuna, int edad) {
		super(Nombre, fechaNacimiento, RUN);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;

	}


	public String listarDatos() {
		return "Cliente ["
				+ "nombre=" + nombre +" " + apellidos 
				+ ", rut = " + run
				+ ", telefono=" + telefono 
				+ ", afp=" + afp 
				+ ", sistemaSalud=" + sistemaSalud 
				+ ", direccion=" + direccion 
				+ ", comuna=" + comuna 
				+ ", edad=" + edad 
				+ ", fechaNacimiento=" + fechaNacimiento 
				+ "]";
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Direccion: " + this.direccion
				         + "Comuna: "    + this.comuna);
	}


	@Override
	public String toString() {
		return "Cliente[ " 
	        + super.toString()
	        + "apellidos=" + apellidos 
	        + ", telefono=" + telefono 
	        + ", afp=" + afp 
	        + ", sistemaSalud="	+ sistemaSalud 
			+ ", direccion=" + direccion 
			+ ", comuna=" + comuna 
			+ ", edad=" + edad
			+ ", visitaTerreno=" + visitaTerreno 
			+ ", capacitacion=" + capacitacion 
			+ ", accidente=" + accidente
			+ "]";
	}
    
	public  String obtenerNombre() {
		
		return "Nombre:" + this.nombre +" " + this.getApellidos();
	}

	 public String obtenerSistemaSalud() {
		 return "Sistema Salud: " + this.sistemaSalud;
	 }
	 
	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void listUsrTipo(String tipo){
		if (tipo.toUpperCase().equals("CLIENTE")){
			System.out.println(this.toString());
		}
	}
	
}
