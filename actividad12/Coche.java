package actividad12;

public class Coche extends Vehiculo {

	private int combustible;
	
	public Coche(int ruedas,int velocidad,int combustible) {
		super(ruedas,velocidad);
		this.combustible=combustible;
	}
	
	public Coche() {
		super(0,0);
		this.combustible=0;
	}

	public int getCombustible() {
		return combustible;
	}
	
	public void repostar(int mas) {
		int suma=this.combustible+mas;
		if(mas<60) {
			combustible=this.combustible+mas;
			System.out.println(this.combustible);
		}else
			System.out.println(this.combustible);
		System.out.println("Se esta ejecutando desde la clase padre");
	}
	
	public void consumir(int menos) {
		int resta=this.combustible-menos;
		if(resta>0) {
			combustible=this.combustible-menos;
			System.out.println(this.combustible);
		}else
			System.out.println(this.combustible);
		
		System.out.println("Se esta ejecutando desde la clase padre");
	}
}
