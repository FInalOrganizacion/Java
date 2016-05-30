package examen;
import javax.swing.JOptionPane;


public class aplicacion {
 private String cad;
  String cad2,cad3; 
public String getcad(){
	return cad;
}
public void setcad(String cad){
	this.cad=cad;
}
 /*public  aplicacion(String cad){
	 this.cad=cad;  
 }
 */
 public void mayuscula(){
	 int aux = cad.length(); 
	 
	 if(aux < 3){
		 cad.toUpperCase(); 
	 }else{
		 
		 
		 cad2 = cad.substring(0,cad.length()-3); 
		 cad3 = cad.substring(cad.length()-3); 
		 JOptionPane.showMessageDialog(null, cad2+cad3.toUpperCase());
	 }
 }
 

 protected void finalize(){
	 JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "ATENCION", JOptionPane.WARNING_MESSAGE);
}

}