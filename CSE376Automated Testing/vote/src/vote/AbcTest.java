package vote;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbcTest {
	Abc obj=new Abc();
	
	

	@Test
	void test() {
		assertEquals(0,obj.joke(5));// cannot vote
	}
	@Test
	void test2() {
		assertEquals(1,obj.joke(22)); // can  vote
	}

}
