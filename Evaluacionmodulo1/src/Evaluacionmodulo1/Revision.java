package Evaluacionmodulo1;
public class Revision {

	public String idRevision;
    public String idVisitaRevision;
    public String nombreRevision;
    public String detalleRevisar;
    public int estadoRevision;

    public Revision() {
    }

	public Revision(String idRevision, String idVisitaRevision, String nombreRevision, String detalleRevisar,
			int estadoRevision) {
		this.idRevision = idRevision;
		this.idVisitaRevision = idVisitaRevision;
		this.nombreRevision = nombreRevision;
		this.detalleRevisar = detalleRevisar;
		this.estadoRevision = estadoRevision;
	}
      

}
