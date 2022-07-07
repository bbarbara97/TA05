import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		double num = sc.nextDouble();
		sc.close();
		
		if(num%2 == 0) {
			System.out.println("El número escogido SI es divisible entre 2.");
		} else {
			System.out.println("El número escogido NO es divisible entre 2.");
		}
		
	}
}
