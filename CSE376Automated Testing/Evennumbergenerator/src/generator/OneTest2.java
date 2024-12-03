package generator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneTest2 {
	int []expt= {2,4,6,8,10};
	One a=new One();

	@Test
	void test() {
		assertArrayEquals(expt,a.Check(10),"ajsn");
		
	}

}
