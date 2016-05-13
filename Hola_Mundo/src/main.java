import javax.swing.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Hola Mundo :) ");
		
      Robot walle = new Robot();
      walle.set_nombre(JOptionPane.showInputDialog("Ingrese el Nombre"));
      walle.set_edad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu edad")));
      System.out.print("Tu Nombre es: ");
      System.out.println(walle.get_nombre());
      System.out.print("Tu Edad es: ");
      System.out.println(walle.get_edad());
	}

}
