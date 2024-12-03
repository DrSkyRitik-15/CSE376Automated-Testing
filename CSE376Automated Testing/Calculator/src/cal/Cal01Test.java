package cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Cal01Test {

	
		Cal01 obj=new Cal01();
		int aa=10;
		int mm=10;
		int ss=5;
		int div=2;
			@Test
			void test() {
				assertEquals(aa,obj.add(5, 5));
				assertEquals(mm,obj.multiply(5,2));
				assertEquals(ss,obj.subtract(10,5));
				assertEquals(div,obj.divide(4,2));
				//fail("Not yet implemented");
			}


}
