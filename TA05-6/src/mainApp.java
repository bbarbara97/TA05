import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double IVA = 0.21;
		
		System.out.print("Introduce el precio del producto: ");
		double num = sc.nextDouble();
		sc.close();
		
		System.out.println("El precio con IVA del producto es de: "+(num+(num*IVA)));
		
	}
}
