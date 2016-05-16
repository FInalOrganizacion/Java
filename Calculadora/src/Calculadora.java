import javax.swing.JOptionPane;

public class Calculadora {
	float n1;
	float n2;
	public Calculadora(float n1, float n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public float get_n1(){
		return this.n1;
		
	}
	
	public void set_n1(int n1){
		this.n1=n1; 
	}

	public float get_n2(){
		return this.n2;
		
	}
	
	public void set_n2(int n2){
		this.n2=n2; 
	}
	public void suma ( ){
		float resul1=this.n1+this.n2;
		JOptionPane.showMessageDialog(null,  "LA SUMA ES: " +Float.toString(resul1));
		
	}
	public void raiz_cuadrada ( float num){
		float raiz=(float) Math.sqrt(num);
		JOptionPane.showMessageDialog(null,  "LA RAIZ CUADRADA:" +Float.toString(num)+"es = "+Float.toString(raiz));
		
	}
	public void resta ( ){
		float resul=this.n1-this.n2;
		JOptionPane.showMessageDialog(null,  "LA RESTA ES: " +Float.toString(resul));
		
	}
	public void multiplicacion ( ){
		float resul=this.n1*this.n2;
		JOptionPane.showMessageDialog(null,  "LA RESTA ES: " +Float.toString(resul));
		
	}
	
}
	