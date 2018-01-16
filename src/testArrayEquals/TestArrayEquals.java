package testArrayEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayEquals {

	@Test
	public void testArrayEquals() {
		
        
        
       
		// Este array es el que esperamos obtener como resultado
       String[] resultadoEsperado = {"hola", "adios", "hasta luego"};
		
		//Este array es el que sera devuelto por el metodo para ser testeado
       
       String[] resultadoObtenido = {"hola", "adios", "hasta luego"};
       assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}

}
