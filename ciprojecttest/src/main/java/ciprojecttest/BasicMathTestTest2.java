package ciprojecttest;
import static org.junit.Assert.*;

import org.junit.Test;

public class BasicMathTestTest2 {
	
	private BasicMath _bm = new BasicMath();
	
	@Test
	public void testTestAdd() {
		try {
            assertEquals("Sum value: ",5, _bm.add(2,3),0);
            assertEquals("Sum value: ",4, _bm.add(-3,7),0);
        }
        catch (Exception e){

        }
	}

	@Test
	public void testTestReturnLessNum() {
		try{
            assertEquals("Min Value: ", 2, _bm.returnLessNum(2,3),0);
            assertEquals("Min Value: ",-3, _bm.returnLessNum(-3,7),0);
        }
        catch (Exception e){

        }
	}

}
