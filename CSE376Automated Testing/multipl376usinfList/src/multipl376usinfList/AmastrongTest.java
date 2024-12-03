package multipl376usinfList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmastrongTest {
	Amastrong obj = new Amastrong();

	@Test
	void test() {
		assertEquals(153, obj.check(153));
	}

	@Test
	void test1() {
		assertEquals(155, obj.check(155));
	}

}
