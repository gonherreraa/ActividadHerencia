package actividad12;

public class Test {

	public static void main(String[] args) {
		
		Coche damcar = new Coche(4,0,60);

		System.out.println("Acelera hasta los 100km/h");
		damcar.acelerar(100);
		System.out.println("Reduce su combustible 20L");
		damcar.consumir(20);
		System.out.println("Frenar hasta los 60km/h: ");
		damcar.frenar(40);
		System.out.println("El combustible es: " + damcar.getCombustible());
		System.out.println("Acelera hasta 90 km/h");
		damcar.acelerar(30);
		System.out.println("Reduce su combustible 10L");
		damcar.consumir(10);
		System.out.println("Se frena hasta parar a 0 km/h");
		damcar.frenar(90);
		System.out.println("Se intenta acelerar hasta los 130 km/h");
		damcar.acelerar(130);
		System.out.println("El combustible es: " + damcar.getCombustible());
	}

}
