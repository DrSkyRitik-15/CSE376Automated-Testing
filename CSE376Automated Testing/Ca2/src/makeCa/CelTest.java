package makeCa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CelTest {

	Cel cc=new Cel();
	@Test
	void test() {
		assertEquals(41,cc.change(5));
	}
	
	void test2() {
		assertEquals(180,cc.change(100));
	}
	
	

}
