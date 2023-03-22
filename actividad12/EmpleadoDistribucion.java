package actividad12;

public class EmpleadoDistribucion extends Asalariado{
	
	private String zona;
	
	public EmpleadoDistribucion(String nombre,long dni, int diasVacaciones,String zona) {
		
		super(nombre, dni, diasVacaciones);
		this.zona=zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "EmpleadoDistribucion [zona=" + zona + ", Nombre=" + getNombre() + ", Dni=" + getDni()
				+ ", DiasVacaciones()=" + getDiasVacaciones() + "]";
	}

}
