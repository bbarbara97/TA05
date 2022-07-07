import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un día de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Es un día laboral.");
				break;
			case "martes":
				System.out.println("Es un día laboral.");
				break;
			case "miércoles":
				System.out.println("Es un día laboral.");
				break;
			case "jueves":
				System.out.println("Es un día laboral.");
				break;
			case "viernes":
				System.out.println("Es un día laboral.");
				break;
			case "sábado":
				System.out.println("No es un día laboral.");
				break;
			case "domingo":
				System.out.println("No es un día laboral.");
				break;
			default:
				System.out.println("No has introducido un día correcto.");
		}
	}
}
