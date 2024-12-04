package FabonaciiSer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factSumTest {
	factSum aa=new factSum();
	@Test
	void test() {
		assertEquals(20,aa.SumCheck(7));
	}

}
