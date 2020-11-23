package Evaluacionmodulo1;
public class Accidente {
 
	public String idAccidente;
    public String rutCliente;
    public String diaAccidente;
    public String horaAccidente;
    public String lugarAccidente;
    public String origenAccidente;
    public String consecuenciasAccidente;

	public Accidente(String idAccidente, String rutCliente, String diaAccidente, String horaAccidente,
			String lugarAccidente, String origenAccidente, String consecuenciasAccidente) {
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.diaAccidente = diaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciasAccidente = consecuenciasAccidente;
	}

	public String getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(String idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDiaAccidente() {
		return diaAccidente;
	}

	public void setDiaAccidente(String diaAccidente) {
		this.diaAccidente = diaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public String getOrigenAccidente() {
		return origenAccidente;
	}

	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}

	public String getConsecuenciasAccidente() {
		return consecuenciasAccidente;
	}

	public void setConsecuenciasAccidente(String consecuenciasAccidente) {
		this.consecuenciasAccidente = consecuenciasAccidente;
	}



}
