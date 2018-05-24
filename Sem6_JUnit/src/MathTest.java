import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MathTest {

	@Test
	public void rightTest() {
		try {
			int value = CTSMath.nrCifre(1234);
			assertEquals(4, value);
		} catch (ExceptionNrCifre e) {
			assertTrue(true);
		}
		
	}
	
	@Test(expected = ExceptionNrCifre.class) 
	public void exceptionErrorTest() throws ExceptionNrCifre {
		CTSMath.nrCifre(Integer.MAX_VALUE);
	}
	
	public static int nrCifreMethReferinta(int nr) {
		int nrCifre = 0;
		//caz particular
		if(nr == 0)
			return 1;
		
		while(nr!=0) {
			nrCifre ++;
			nr = nr/10;
		}
		return nrCifre;
	}
	
	@Category(SlowTest.class)
	@Test
	public void testCrossCheck() {
		try {
			int actualValue = CTSMath.nrCifre(13);
			int expectedValue = nrCifreMethReferinta(10);
			assertEquals("verif rezultat cu meth de referinta", 
					expectedValue, actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		}
	}

}
