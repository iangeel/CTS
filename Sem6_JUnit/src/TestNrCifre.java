import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestNrCifre {

	@Test
	public void testRight() {
		try {
			int actualValue = CTSMath.nrCifre(12345);
			int expectedValue = 5;
			assertEquals("verif nr cifre", expectedValue, actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			int actualValue = CTSMath.nrCifre(-12345);
			assertTrue(false);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Test
	public void testExistence() {
		try {
			int actualValue = CTSMath.nrCifre(12345);
			//verif ptr int sa fie diferit de 0 nu de NULL
			assertNotEquals("verif ca rez este diferit de zero",0,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testLimiteExtremeMin() {
		try {
			int actualValue = CTSMath.nrCifre(0);
			assertEquals("verif si ptr cel mai mic nr",1,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testLimiteExtremeMax() {
		try {
			int actualValue = CTSMath.nrCifre(Integer.MAX_VALUE);
			//System.out.println(Integer.MAX_VALUE);
			assertEquals("verif si ptr cel mai mare nr",10,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	
	@Test
	public void testInverseRelantionship() {
		try {
			int actualValue = 0;
			actualValue = CTSMath.nrCifre(134);
			assertNotEquals("verif ca nu mai este 0",0,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
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
			int expectedValue = nrCifreMethReferinta(13);
			assertEquals("verif rezultat cu meth de referinta", 
					expectedValue, actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
