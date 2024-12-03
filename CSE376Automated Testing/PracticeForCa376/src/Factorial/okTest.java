package Factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class okTest {
	ok nn=new ok();
	

	@Test
	void test() {
		assertEquals(3628800,nn.Check(10));
	}

}
