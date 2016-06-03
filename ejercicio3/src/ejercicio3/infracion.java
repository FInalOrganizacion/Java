package ejercicio3;


import javax.swing.JOptionPane;

public class infracion {

	int opcion,aux; 
		public infracion ( int opcion){
			this.opcion=opcion;
		}
		public void  preguntar(){
	      
	       if(opcion == JOptionPane.YES_NO_CANCEL_OPTION){
	    	   aux=Integer.parseInt(JOptionPane.showInputDialog("Cual es su velocidad:"));
	    	     if(aux <=60)
				  JOptionPane.showMessageDialog(null, "NO HAY MULTA =0");
	    	             else
	    		      if(aux >=61 && aux<=80)
	   		         	JOptionPane.showMessageDialog(null, ",MULTA PEQUEÑA =1");
	    	             else 
	      			       JOptionPane.showMessageDialog(null, "MULTA GRANDE =2");}
			else{
				
				aux=Integer.parseInt(JOptionPane.showInputDialog("Cual es su velocidad:"));
				if(aux <=120)
					JOptionPane.showMessageDialog(null, "NO HAY MULTA =0");
				      else 
				        if(aux >=121 && aux<=160)
			   	        	JOptionPane.showMessageDialog(null, "MULTA PEQUEÑA =1");
				               else 
			    	              JOptionPane.showMessageDialog(null, "MULTA GRANDE =2");
			}}}