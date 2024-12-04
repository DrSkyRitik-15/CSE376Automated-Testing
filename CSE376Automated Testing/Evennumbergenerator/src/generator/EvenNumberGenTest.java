package generator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberGenTest {
	EvenNumberGen aaa=new EvenNumberGen();
	
	int arr[]= {2,4,6,8,10};
	@Test
	void test() {
		assertArrayEquals(arr,aaa.okk(10));
	}
	

}
