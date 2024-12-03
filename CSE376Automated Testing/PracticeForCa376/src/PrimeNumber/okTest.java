package PrimeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class okTest {
ok nn=new ok();
int aa[]= {2,3,5,7};
	@Test
	void test() {
		assertArrayEquals(aa,nn.check(10));
	}

}
