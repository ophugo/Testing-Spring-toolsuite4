package mx.tex.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		int x = 2;
		int y = 5;
		OtherClass occ = new OtherClass();
		occ.multiply(x, y);
		assertTrue(x < 1000, "its less than 1000");
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass oc = new OtherClass();
		
	    try {
	    	oc.multiply(1010, 9);
	    	fail("Exception not thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("X should be less than 1000", e.getMessage());
	    }
	}

}
