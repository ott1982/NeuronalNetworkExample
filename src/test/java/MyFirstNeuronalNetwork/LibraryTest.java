/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyFirstNeuronalNetwork;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertEquals(1, classUnderTest.someLibraryMethod(1, 0)[0], 0);
		assertEquals(0, classUnderTest.someLibraryMethod(0, 0)[0], 0);
		assertEquals(1, classUnderTest.someLibraryMethod(0, 1)[0], 0);
		assertEquals(1, classUnderTest.someLibraryMethod(1, 1)[0], 0);
	}
}