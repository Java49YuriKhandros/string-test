package telran.string.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {
	@Test
	void testCharAt() {
		String hello = "Hello!";
		assertEquals('H',hello.charAt(0));
		assertEquals('l', hello.charAt(2));
		assertEquals('!', hello.charAt(5));
	}
	@Test
	void testCompareTo() {
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));
		assertEquals(1, "123459".compareTo("12345"));
		assertEquals(0, "Hello".compareTo("Hello"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(8, "9".compareToIgnoreCase("12345"));
		assertEquals(-4, "12345".compareToIgnoreCase("12349"));
		assertEquals(2, "12345yu".compareToIgnoreCase("12345"));
		assertEquals(0, "Hello".compareToIgnoreCase("HeLlO"));
		assertEquals(0, "Hello".compareToIgnoreCase("hello"));
		
		
	}
	@Test
	void testStartWith() {
		String hello = "Hello";
		assertTrue (hello.startsWith("He"));
		assertFalse(hello.startsWith("he"));
	}
	@Test
	void testEndWith() {
		String hello = "Hello";
		assertTrue (hello.endsWith("lo"));
		assertFalse(hello.endsWith("LO"));
	}
	@Test
	void testIndexOf() {
		//tested method indexOf(String str)
		String hello = "Hello";
		assertEquals(0, hello.indexOf("He"));
		assertEquals(2, hello.indexOf("llo"));
		assertEquals(4, hello.indexOf("o"));
	}
	@Test
	void testLastIndexOf() {
		//tested method lastIndexOf(int ch)
		String hello = "HHellooo";
		assertEquals(1, hello.lastIndexOf('H'));
		assertEquals(4, hello.lastIndexOf('l'));
		assertEquals(7, hello.lastIndexOf('o'));
	}
	@Test
	void testConcat() {
		
		String hello = "Hello";
		String world = " World";
		String helloWorld = "Hello World";
		assertEquals(helloWorld, hello.concat(world));
		assertEquals("Hello World!", helloWorld.concat("!"));
	}
	@Test
	void testContains() {
		String hello = "Hello";
		assertTrue(hello.contains(hello));
		
		assertTrue(hello.contains("H"));
		assertTrue(hello.contains("el"));
		assertFalse(hello.contains("h"));
		assertFalse(hello.contains("le"));
		assertFalse(hello.contains("elo"));
	}
}
