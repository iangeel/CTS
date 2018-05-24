import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetCuloare {

	@Test
	public void testInverse() {
		try {
			Pantof pantof = new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			pantof.setCuloare(ECuloare.ALB);
			assertNotEquals(ECuloare.NEGRU,pantof.getCuloare());
			assertNotEquals(ECuloare.ROSU,pantof.getCuloare());
			assertNotEquals(ECuloare.VERDE,pantof.getCuloare());
		} catch (ExceptionConstructor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
