package controladores_java;

public class main {
	
	public static void  main(String[] args){
		manzana item1= new manzana();
		manzana item2= new manzana();
		manzana item3= new manzana();
		item1.color="verde";
		item2.color="roja";
		item1.setCodigo("001");
		item2.setCodigo("001");
		item1.setTamanio(2);
		item2.setTamanio(3);
		item1.show_inf();
		item2.show_inf();
		item3.show_inf();
	}

}
