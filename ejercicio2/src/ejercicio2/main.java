package ejercicio2;

import javax.swing.JOptionPane;
public class main {
	
		public static void main(String[] args) {
			figura cad = new figura(); 
			cad.set_cadena(JOptionPane.showInputDialog("Ingrese la cadena que desea visualizar:"));
			cad.dibujar(cad.get_cadena());
}}