
public class Figura {
	int altura;
	int ancho;
	public int get_altura(){
		return this.altura;
		
	}
	public int get_altura(int altura){
		return this.altura=altura;
		
	}
	public void set_altura(int altura){
		this.altura=altura; 
	}
	public int get_ancho(){
		return this.ancho;
		
	}
	public int get_ancho(int ancho){
		return this.ancho=ancho;
		
}
	public void set_ancho(int ancho){
		this.ancho=ancho; 
	}
	public void dibujar_figura ( int altura , int ancho){
		for (int i=0; i<altura; i++) //fila
		{
			for(int j=0; j<ancho;  j++){ //columna
		if ((i==0 || j==ancho-1) || (j==0 || i==altura-1))
			System.out.print( "* " );
			else
				System.out.print( "  " );
		}
		System.out.println(); 
		}
	}
}
