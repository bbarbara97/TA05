import java.util.Scanner;

public class mainApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sumaTotal = 0;
		
		System.out.print("Introduce un número de ventas:");
		int nVentas = sc.nextInt();
		
		for(int i=1;i<=nVentas;i++) {
			System.out.print("Introduce el precio de la venta número "+i+": ");
			int suma = sc.nextInt();
			
			sumaTotal += suma;
		}
		sc.close();
		System.out.println("La suma de todas las ventas es de: "+sumaTotal);
		
	}
}
