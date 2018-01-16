package testSames;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNotSame {
		 

		 
		  int i1 = 10;
		  int i2 = 10;
		 
		 
		  @Test
		  public void intTest() throws Exception {
			  
		    // if(i1 == i2)
		    assertNotSame(i1, i2);    // will pass
		 
		    
		  }

}
