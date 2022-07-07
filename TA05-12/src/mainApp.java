import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		String pass = "111";
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 1; i<=3;i++) {
			System.out.print("Introduce tu contraseña: ");
			String pass2 = sc.nextLine();
			
			if(pass2.equals(pass)) {
				System.out.println("Enhorabuena.");
				i = 4;
			}else {
				System.out.println("Contraseña incorrecta, te quedan: "+ (3-i)+" intentos.");
			}
			
		}
	}
}
