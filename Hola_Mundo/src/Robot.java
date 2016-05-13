
public class Robot {
	String nombre;
	int edad;
	public Robot(){
		
	}
	public String get_nombre () { //accedido de afuera y pueda ser  modificado
	return this.nombre;//referencia
	}
   public void set_nombre(String nombre){//asignar la funcion  //pasa el parametro
	this.nombre=nombre;
}
   public int get_edad () { //accedido de afuera y pueda ser  modificado
		return this.edad;//referencia
		}
   public void set_edad(int edad){//asignar la funcion  pasa el parametro
		this.edad=edad;
}
}