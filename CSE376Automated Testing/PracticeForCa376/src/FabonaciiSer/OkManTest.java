package FabonaciiSer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OkManTest {
	OkMan obj=new OkMan();
	int[] arr= {0, 1, 1, 2, 3};
	@Test
	void test() {
		assertArrayEquals(arr,obj.Check(5));
	}

}
