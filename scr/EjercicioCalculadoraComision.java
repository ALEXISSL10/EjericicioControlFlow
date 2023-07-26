import java.util.Scanner;

public class EjercicioCalculadoraComision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la cantidad de comisión: ");
		int cantidad = in.nextInt();
		
		
		int comi1 = 30;
		int comi2 = 20;
		int comi3 = 10;
		char comision;
		if (cantidad >= 10000) {
			cantidad = (cantidad * comi1 / 100 );
		}else if (cantidad > 5001 && cantidad < 9999) {
			cantidad = (cantidad * comi2 / 100 );
		}else if (cantidad > 1001 && cantidad < 4999) {
			cantidad = (cantidad * comi3 / 100 );
		}else if (cantidad < 1000) {
			cantidad = 00;
		}
		  System.out.println( cantidad);
	in.close();
		
	}

}
	

	