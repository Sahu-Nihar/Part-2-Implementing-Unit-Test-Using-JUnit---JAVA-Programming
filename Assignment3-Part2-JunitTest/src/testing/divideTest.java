package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test1() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(100, 100);
		assertEquals(1, (int)output);
	}


	@Test
	public void test2() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(100, 1);
		assertEquals(1, (int)output);
	}
}
