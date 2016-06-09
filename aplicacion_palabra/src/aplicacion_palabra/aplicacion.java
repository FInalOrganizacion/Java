package aplicacion_palabra;

public class aplicacion {
	private char vocales[]={'a','e','i','o','u'};
	private String cadena;
	private int num_vocales;
	

	public aplicacion(){
	}
	
	public aplicacion(String cadena){
		this.cadena=cadena;
	}
	
	public aplicacion(int num_vocales){
		this.num_vocales=num_vocales;
	}
	
	public aplicacion (String cadena, int num_vocales){
		this.cadena=cadena;
		this.num_vocales=num_vocales;
			
	}
	
	public String getCadena() {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public void show_inf(){
		  System.out.println(" Hay "+proceso()+" vocales");
	}
	
	public int proceso(){
		
		int aux=0;
		for(int c=0; c<this.cadena.length();c++)
        {
            for(int x=0;x<vocales.length;x++){
                if(this.cadena.charAt(c)== vocales[x])
                    aux+=1;
           }
        }
		return aux;
	}
}
