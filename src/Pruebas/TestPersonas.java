package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Aplicacion.Personas;

class TestPersonas {

	Personas estacion = new Personas();
	
	/**@Test
	void test1() {
		try {
			 estacion.addPersona("Pedro", 22);
			 estacion.addPersona("Juan", 20);
			 estacion.edadMinima();
			 assertEquals(estacion.edadMinima(), 20);
		} catch (Exception e) {
			System.out.println("Excepcion");
		} 
	 
	}
	**/
	@Test
	void test2() {
		try {
			estacion.addPersona("Ana", 18);
			estacion.vaciar();
			estacion.edadMinima();
		} catch (Exception e) {
			
		}
		;
	}

}
