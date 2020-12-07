package ciprojecttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class algebraTest {

private Algebra _a = new Algebra();
	
	@Test
	public void testAdd() {
		try {
            assertEquals("Product value: ",6, _a.multiply(2,3),0);
        }
        catch (Exception e){

        }
	}

}
