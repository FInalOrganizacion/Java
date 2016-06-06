package ejercicio3;

import javax.swing.JOptionPane;

public class main {
	
		public static void main(String[] args) {
			int opcion; 
			opcion = JOptionPane.showConfirmDialog(null, "ESTAS DE  CUMPLEAÑOS HOY?","Si o No",JOptionPane.YES_NO_OPTION);
			infracion respuesta = new infracion(opcion );
			respuesta.preguntar();}}