package testEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEquals {

	public int sumar (int a, int b){
		
		int suma= a+b;
		
		return suma;
		
		
	}
	
	
	@Test
	
	
	public void testEquals() {
		
		
		TestEquals test1= new TestEquals();
		
		int resultado=test1.sumar(1, 2);
		
		int esperado= 3;
		
		assertEquals(esperado, resultado);
	}

}
