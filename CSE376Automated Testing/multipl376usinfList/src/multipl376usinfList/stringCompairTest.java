package multipl376usinfList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCompairTest {

	stringCompair obj = new stringCompair();

	@Test
	void test() {
		assertEquals("true", obj.withoutCase("Mango", "Mango"));
	}

	@Test
	void test2() {
		assertEquals("true", obj.withoutCase("Mango", "mAngo"));
	}

	@Test
	void testAnyCase() {
		assertEquals("true", obj.AnyCase("ZoOm", "zoom"));
	}

	@Test
	void testAnyCase2() {
		assertEquals("true", obj.AnyCase("ZoOm", "Doom"));
	}

}
