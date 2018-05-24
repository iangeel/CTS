import static org.junit.Assert.*;

import org.junit.Test;

public class TestMock {

	@Test
	public void testRight1() {
		//testare cu produs care nu este la reducere
		ProdusMock produs = new ProdusMock();
		produs.setOnSale(false);
		produs.setPrice(120);
		
		float expectedValue = 120;
		float actualValue = CTSMath.getPretProdus(produs);
		assertEquals(expectedValue, actualValue, 0.01);
	}
	
	@Test
	public void testRight2() {
		//testare cu produs care este la reducere cu pret <=100
		ProdusMock produs = new ProdusMock();
		produs.setOnSale(true);
		produs.setPrice(80);
		
		float expectedValue = 64;
		float actualValue = CTSMath.getPretProdus(produs);
		assertEquals(expectedValue, actualValue, 0.01);
	}

	@Test
	public void testRight3() {
		//testare cu produs care este la reducere cu pret >100
		ProdusMock produs = new ProdusMock();
		produs.setOnSale(true);
		produs.setPrice(120);
		
		float expectedValue = 70;
		float actualValue = CTSMath.getPretProdus(produs);
		assertEquals(expectedValue, actualValue, 0.01);
	}
}
