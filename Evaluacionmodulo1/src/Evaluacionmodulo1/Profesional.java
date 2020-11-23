package Evaluacionmodulo1;
public class Profesional extends Usuario {
 
	public String titulo;
    public String fechaIngreso;

	public Profesional(String Nombre, String fechaNacimiento, String RUN, String titulo, String fechaIngreso) {
		super(Nombre, fechaNacimiento, RUN);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Titulo: " + this.titulo
				         + "Fecha ingreso: " + this.fechaIngreso);
	}


	@Override
	public String toString() {
		return "Profesional[ " 
	        + super.toString()
	        + "titulo=" + titulo
	        + ", Fecha de Ingreso=" + fechaIngreso  
			+ "]";
	}
	
	public void listUsrTipo(String tipo){
		if (tipo.toUpperCase().equals("PROFESIONAL")){
			System.out.println(this.toString());
		}
	}
}
