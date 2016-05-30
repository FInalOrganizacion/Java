package examen;


import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		aplicacion cad=new aplicacion(); 
	 cad.setcad(JOptionPane.showInputDialog("Ingrese una palabra:"));

		cad.mayuscula();
		
	    System.gc();
	}
	
}