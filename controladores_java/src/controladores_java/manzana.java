package controladores_java;

public class manzana {
	 private String codigo;
	 private int tamanio;
	 public String color;
	public manzana(){
		this.tamanio=99;
		this.color="Azul";
		
	}
	 
	public String getCodigo() 
	{
		return codigo;
	}
	
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}
	
	public int getTamanio()
	{
		return tamanio;
	}
	
	public void setTamanio(int tamanio)
	{
		this.tamanio = tamanio;
	}
	public void show_inf(){
		System.out.println("codigo->"+this.codigo+" |color->"+this.color+"|Tamaño->"+this.int_to_string(this.tamanio));
	}
	private String int_to_string(int tam){
		switch (tam)
		{
		case 1: 
			return "PEQUEÑO";
			
		case 2: 
			return "MEDIANO";
			
		case 3: 
			return "GRANDE";
			default: 
				return "RAMAÑO DESCONICIDO";
		}
	}
	 
}
