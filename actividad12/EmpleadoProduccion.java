package actividad12;

public class EmpleadoProduccion extends Asalariado{

	private String turno;
	
	public EmpleadoProduccion(String nombre,long dni,int diasVacaciones,String turno) {
		
		super(nombre, dni, diasVacaciones);
		this.turno=turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "EmpleadoProduccion [turno=" + turno + ", Nombre()=" + getNombre() + ", Dni()=" + getDni()
				+ ", DiasVacaciones()=" + getDiasVacaciones() + "]";
	}
	
	
}
