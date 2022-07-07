import javax.swing.JOptionPane;

public class mainApp {

public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre.");
		
		JOptionPane.showMessageDialog(null, "Bienvenido/a "+nombre+".");
	}
}
