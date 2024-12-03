package generator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evengenratorTest {
	evengenrator a=new evengenrator();

//	@Test
	int ar[]= {3,4,5,6};
	@Test
	void test() {
		assertEquals(4,a.findmax(new int[] {1,2,3,4}));
	}
	@Test
	void tes2t() {
		assertEquals(6,a.findmax(ar));
	}

}
