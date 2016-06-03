package ejercio1;

import javax.swing.JOptionPane;
public class main {
	
		public static void main(String[] args) {
			tabla multiplicar =  new tabla();
			multiplicar.set_numeron(Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que tabla desea ver:")));
			multiplicar.resultado(multiplicar.get_numeron());		
	}}
		