package actividad12;

public class Vehiculo {

	
	private int ruedas;
	private int velocidad;
	
	public Vehiculo(int ruedas,int velocidad) {
		this.ruedas=ruedas;
		this.velocidad=velocidad;
		
	}
	
	public Vehiculo() {
		
		this(0, 0);
	}
	
	
	public int getRuedas() {
		return ruedas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void acelerar(int mas) {
		int suma=this.velocidad+mas;
		if(mas<120) {
			velocidad=this.velocidad+mas;
			System.out.println(this.velocidad);
		}else
			System.out.println(this.velocidad);
		System.out.println("Se esta ejecutando desde la clase hija");
	}
	
	public void frenar(int menos) {
		
		int resta=this.velocidad-menos;
		if(resta>-1) {
			velocidad=this.velocidad-menos;
			System.out.println(this.velocidad);
		}else
			System.out.println(this.velocidad);
		
		System.out.println("Se esta ejecutando desde la clase hija");
	}

}
