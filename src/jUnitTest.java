
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class jUnitTest extends MainStringTest {

    @Test
    public void testIsReversed(){
        boolean res = MainStringTest.isReversed("Hello", null);
        assertFalse(res);
        res = MainStringTest.isReversed("Hello", "olleH");
        assertTrue(res);
        res = MainStringTest.isReversed(null, null);
        assertFalse(res);
        res = MainStringTest.isReversed("", "Hello");
        assertFalse(res);
        res = MainStringTest.isReversed("Hello", "");
        assertFalse(res);
    }

}
