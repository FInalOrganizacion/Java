import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {

		
      Figura rectangulo = new Figura();
      rectangulo.set_altura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura")));
      rectangulo.set_ancho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho")));
      System.out.print("Tu altura es: ");
      System.out.println(rectangulo.get_altura());
      System.out.print("Tu ancho es: ");
      System.out.println(rectangulo.get_ancho());
      rectangulo.dibujar_figura(rectangulo.get_altura(),rectangulo.get_ancho());
	}
}
