import java.util.Scanner;

public class EjercicioMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la edad: ");
		int ticket = in.nextInt();
		
		int precio = 7;
	int total ;
		char comision;
		if (ticket  <= 5) {
			precio *= 0.60F;
		
		}else if (ticket >= 60) {
			precio  *= 0.55F;
		}else  if (ticket >=6 && ticket <= 59) {
			precio =7;
		}
		  System.out.println(precio );
	in.close();
		
	}

}
	

	