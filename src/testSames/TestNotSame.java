package testSames;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNotSame {
		 

	 int i1 = 10;
	 int i2 = 10;
		 
		  
	 @Test
	public void intTest() throws Exception {
			  
		 assertNotSame(i1, i2);   
		 
		    
		  }

}
