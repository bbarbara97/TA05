import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.1416;
		
		
		System.out.print("Introduce el radio: ");
		
		String r = sc.nextLine();
		int radio = Integer.parseInt(r);
		sc.close();
		
		System.out.println("El area del circulo es de: "+(PI*(Math.pow(radio, 2))));
	}
}
