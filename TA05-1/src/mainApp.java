
public class mainApp {

	public static void main(String[] args) {
		
		int entero = 4;
		double decimal = 4.56;
		
		if(entero > decimal) {
			System.out.println("El número mayor es: "+entero);
		}
		else if(entero == decimal){
			System.out.println("Los dos números son iguales.");
		} else if(decimal > entero) {
			System.out.println("El número mayor es: "+decimal);
		}
		
	}
}
