package Evaluacionmodulo1;
public class Administrativo extends Usuario {
 
	public String area;
    public String experienciaPrevia;

 	public Administrativo(String Nombre, String fechaNacimiento, String RUN,
                          String area, String experienciaPrevia) {
		super(Nombre, fechaNacimiento, RUN);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Area: " + this.area
				         + "Experiencia previa " +this.experienciaPrevia );
	}

	@Override
	public String toString() {
		return "Administrativo[ " 
	        + super.toString()
	        + "area= " + area 
	        + ", Experiencia Previa = " + experienciaPrevia 
			+ "]";
	}
	
	public void listUsrTipo(String tipo){
		if (tipo.toUpperCase().equals("ADMINISTRATIVO")){
			System.out.println(this.toString());
		}
	}
}
