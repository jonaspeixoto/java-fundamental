package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String Valor = JOptionPane.showInputDialog("Informe o numero");
		int numero = Integer.parseInt(Valor);
		
		if (numero % 2 == 0)
			System.out.println("Numero par");
		else
			System.out.println("numero impar");
		
	}
}
