package FabonaciiSer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class repeatTest {
	repeat aa= new repeat();
	
	int []a= {0,1,1,2,3,5,8};
	@Test
	void test() {
		assertArrayEquals(a,aa.fact(7));
	}

}
