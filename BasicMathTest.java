import org.junit.Ignore;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BasicMathTest(){
    private BasicMath _bm;

    @BeforeEach
    public void setUp() throws Exception{
        _bm = new BasicMath();
    }

    @AfterEach
    public void tearDown() throws Exception{
        _bm = null;
    }

    @Test
    public void testAdd(){

        try {
            assertEquals(5, _bm.add(2,3));
            assertEquals(4, _bm.add(-3,7));
        }
        catch (Exception e){

        }
    }

    @Test
    public void testReturnLessNum(){
        
        try{
            assertEquals(2, _bm.returnLessNum(2,3));
            assertEquals(-3, _bm.returnLessNum(-3,7));
        }
        catch (Exception e){

        }
    }
}