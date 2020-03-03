package mx.tex.lab;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnderstandingAssertsApplicationTests {

	/*@Test
	void contextLoads() {	
	} */
	
	@Test
	public void whenCheckingExceptionMessage_thenEqual() {
		AnyClass ac = new AnyClass();
		
	    try {
	    	ac.methodThatShouldThrowException();
	        fail("Exception not thrown");
	    } catch (UnsupportedOperationException e) {
	        assertEquals("Operation Not Supported", e.getMessage());
	    }
	}

	@Test
	public void whenAssertEquality_thenEqual() {
	    String expected = "not today";
	    String actual = "Winter is coming";
	 
	    //assertEquals(expected, actual);
	    assertEquals(expected, actual, "failure - strings are not equal");
	}

	@Test
	public void whenAssertingArraysEquality_thenEqual() {
	    char[] expected = {'J','u','n','i','t'};
	    char[] actual = "Junit".toCharArray();
	     
	    assertArrayEquals(expected, actual);
	}

	@Test
	public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
	    int[] expected = null;
	    int[] actual = null;
	 
	    assertArrayEquals(expected, actual);
	}
	
	@Test
	public void whenAssertingNull_thenTrue() {
	    Object longclaw = null;
	     
	    assertNull(longclaw, "The longclaw should be null");
	    //if we want to assert that an object should not be null we can use the assertNotNull assertion
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
	    Object oathkeeper = new Object();
	    Object widowswall = new Object();
	 
	    assertNotSame(oathkeeper, widowswall);
	    // when we want to verify that two variables refer to the same object, we can use the assertSame assertion
	}

	@Test
	public void whenAssertingConditions_thenVerified() {
	    assertTrue(5 > 4, "5 is greater then 4");
	    assertFalse(5 > 6, "5 is not greater then 6");
	}
	
	@Test
	public void testAssertThatHasItems() {
	    assertThat(Arrays.asList("Harrenhal", "Dragonstone", "Winterfell")).contains("Winterfell", "Dragonstone");	
	    }

	
	@Test
	public void whenAssertingNull_thenFalse() {
		int one = 1;
		
		assertNotNull(one);
	}
	
	@Test 
	public void whenAssertingSameObject_thenSame() {
		Object door = new Object();
		
		assertSame(door, door);
	}
}
