package OPen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	Email aa=new Email();
	
	String E1="AryanSingh@gmail.com";
	String P1="Dook123@";
	String E2="ritiksingh@gmail.com";
	String P2="Zoom123@";
	
	@Test
	void test() {
		assertEquals(true,aa.check(E1,P1));
	}
	@Test
	void test2() {
		assertEquals(true,aa.check(E2,P2));
	}

}
