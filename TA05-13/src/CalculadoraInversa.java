import java.util.Scanner;

public class CalculadoraInversa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op1, op2;
		String signo;
		
		System.out.print("Introduce el 1er operando: ");
		op1 = sc.nextInt();
		System.out.print("Introduce el 2do operando: ");
		op2 = sc.nextInt();
		
		System.out.print("Introduce un signo aritmético: ");
		signo = sc.next();
		sc.close();
		
		switch(signo) {
		
			case "+":
				System.out.println("El resultado de esta operación es: "+ (op1+op2));
				break;
			case "-":
				System.out.println("El resultado de esta operación es: "+ (op1-op2));
				break;
			case "*":
				System.out.println("El resultado de esta operación es: "+ (op1*op2));		
				break;
			case "/":
				System.out.println("El resultado de esta operación es: "+ (op1/op2));
				break;
			case "^":
				System.out.println("El resultado de esta operación es: "+ (Math.pow(op1, op2)));
				break;
			case "%":
				System.out.println("El resultado de esta operación es: "+ (op1%op2));
				break;
				default:
					System.out.println("No has introducido un signo correcto.");
		}
		
		
	}
}
