package Evaluacionmodulo1;
public class Capacitacion {

	public String identificador;
    public String dia;
    public String hora;
    public String lugar;
    public String duracion;
    public int cantidadAsistentes;

	public Capacitacion(String identificador, String dia, String hora, String lugar, String duracion,
			int cantidadAsistentes) {
		this.identificador = identificador;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	public String toString() {
		return "Capacitacion[ " 
	        + "identificador= " + identificador
	        + ", dia= " + dia
	        + ", hora= " + hora
	        + ", lugar= " + lugar
	        + ", duracion= " + duracion
	        + ", cantidad de Asistentes= " + cantidadAsistentes
			+ "]";
	}
	
   public void mostrarDetalle() {   
      System.out.println( "La capacitación será en" + this.lugar
  	        	+ "a las " + this.hora + " del día " + this.dia
  		        + " y durará "+ this.duracion + " minutos");		
   }
   
   }
