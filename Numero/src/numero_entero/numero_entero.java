package numero_entero;
import javax.swing.JOptionPane;
public class numero_entero {
	public static void main(String[] args) {
		
		numero_entero val = new numero_entero();
		
		numero_entero.set_numero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:")));
		 if (numero_entero.get_numero()<21){
			 JOptionPane.showMessageDialog(null ,"Resultado: "+ Integer.toString(Math.abs(numero_entero.get_numero()-21)));
			 
		 }
		 else {
			 JOptionPane.showMessageDialog(null ,"Resultado: "+ Integer.toString((numero_entero.get_num()-21)*2));
		 }
		
	}

}