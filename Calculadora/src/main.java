import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
	float n1;
	float n2;
	
      
      n1= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el numero 1"));
      n2= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el numero 2 "));
      Calculadora cal=new Calculadora(n1,n2);
      cal.suma();
      cal.raiz_cuadrada(cal.get_n1());
      cal.raiz_cuadrada(cal.get_n2());
      cal.resta();
      cal.multiplicacion();
      cal.division();
      cal.sen(cal.get_n1());
      cal.sen(cal.get_n2());
      cal.cos(cal.get_n1());
      cal.cos(cal.get_n2());
      cal.tg(cal.get_n1());
      cal.tg(cal.get_n2());
    		  
	}

}
