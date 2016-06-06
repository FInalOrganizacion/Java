package ejercicio2;

public class figura {
	String cadena;
	public figura()
	{
	}
	
	public String get_cadena()
	{
		return this.cadena; 	
	}
	public void set_cadena(String cadena){
		this.cadena=cadena; 
	}
	public void dibujar(String cadena){
		 int aux=cadena.length();
         int  aux2=1,i=1;
         String n1,n2; 
		for(int x=cadena.length();x<cadena.length();x++)
		{
       for(int j=1;j<cadena.length()*2+1;j++){
           if(j==aux){
        	   i++;
           n1=cadena.substring(i-1,i-1);    
           System.out.print(n1);
           System.out.print(" ");
            }}}}       