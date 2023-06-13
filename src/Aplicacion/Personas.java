package Aplicacion;

import java.util.HashMap;

public class Personas {

	private HashMap<String, Integer> listadoPersonas;
	//Este es el constructor de la clase personas
	public Personas() {
		listadoPersonas = new HashMap<>();
	}
	
	/**Este es el metodo vaciar el cual nos permitira vaciar
	 * nuestro hashMap cuando sea necesario**/
	public void vaciar(){
		listadoPersonas.clear(); //aqui vaciaremos todo el hashmap
	} 
	
	/**
	 * Este metodo nos permitira agregar personas al hashmap**/
	public void addPersona(String nombre, int edad) throws Exception {	
		if(edad < 0) {
			throw new Exception("Edad incorrecta");//si la edad es menor a 0 lanzara una excepcion
		}else if(listadoPersonas.containsKey(nombre)){
			throw new Exception("Ya existe una persona con el nombre "+nombre);//si el nombre coincide con el de otra persona expcepcion de nuevo
		}else{
			listadoPersonas.put(nombre, edad);//si todo va bien añadiremos la nueva persona al hashMap
		}
	}
	/**Este metodo nos permitira ver que edad es la minima en todo el hashmap**/
	public int edadMinima() throws Exception {
		if(listadoPersonas.isEmpty()) {
			throw new Exception("No hay personas");//si el hashmap esta vacio excepcion y syso
		}else {
			int minimo = Integer.MAX_VALUE;
			for(int edad : listadoPersonas.values()) {
				if(edad < minimo) {
					minimo = edad;//si se encuentra un valor menor al anterior cambiaremos el minimo
				}
			}
			return minimo;
		}
	}
	
}
