package Evaluacionmodulo1;
import java.util.ArrayList;
import java.util.List;

public class VisitaTerreno {
 
	public String idVisitaTerreno;
    public String rutCliente;
    public String diaVisitaTerreno;
    public String hora;
    public String lugarVisitaTerreno;
    public String comentariosVisitaTerreno;
    public List<Revision> revision1 = new ArrayList<Revision>();

    public VisitaTerreno() {
    }

	public VisitaTerreno(String idVisitaTerreno, String rutCliente, String diaVisitaTerreno, String hora,
			String lugarVisitaTerreno, String comentariosVisitaTerreno, List<Revision> revision1) {
		this.idVisitaTerreno = idVisitaTerreno;
		this.rutCliente = rutCliente;
		this.diaVisitaTerreno = diaVisitaTerreno;
		this.hora = hora;
		this.lugarVisitaTerreno = lugarVisitaTerreno;
		this.comentariosVisitaTerreno = comentariosVisitaTerreno;
		this.revision1 = revision1;
	}

}
