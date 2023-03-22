package actividad12;

public class TestAsalariado {

	public static void main(String[] args) {
		
		EmpleadoProduccion uno = new EmpleadoProduccion("José", 12345678, 22, "Tarde");
		EmpleadoDistribucion dos = new EmpleadoDistribucion("Francisco", 12342354, 21, "Sur");

		System.out.println(uno.toString());
		System.out.println(dos.toString());
	}

}
