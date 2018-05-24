import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructorPantof {

	@Test
	public void testRight() {
		try {
			Pantof pantof = new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			//se verifica toate atributele obj pantof
			assertEquals("verif denumire","Ana Cori",pantof.getDenProdus());
			assertEquals("verif cantitate",10,pantof.getCantitate());
			assertEquals("verif culoare",ECuloare.ROSU,pantof.getCuloare());
			//pret este float (folosit si un epsilon=0.01)
			assertEquals("verif pret",429,pantof.getPret(),0.01);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			Pantof pantof = new Pantof("Ana Cori", -10, ECuloare.ROSU, 429);
			//1
			assertTrue(false);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//2 meth trebuie sa arunce exceptie pentru cant negativa
			assertTrue(true);
		}
	}
	
	@Test
	public void testExistence() {
		try {
			Pantof pantof = new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			//verif ca obj a fost creat
			assertNotNull(pantof);
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test(timeout = 10)
	public void testPerformance() throws ExceptionConstructor {
		Pantof pantof = new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
	}

}
