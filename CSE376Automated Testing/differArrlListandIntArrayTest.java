package generator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class differArrlListandIntArrayTest {
	differArrlListandIntArray a=new differArrlListandIntArray();
	
	int ar[]= {0,2,4,6,8,10};
	@Test
	void test() {
		assertArrayEquals(ar,a.Zoom(10));
	}

}
