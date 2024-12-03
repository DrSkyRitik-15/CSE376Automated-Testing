package EvenCheck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberTest {
EvenNumber sc=new EvenNumber();
String expt="Even";
String expt2="Odd";
String expt3="No";
	@Test
	void test() {
		assertEquals(expt,sc.Even(20));
		
	}
	@Test
	void test2() {
		assertEquals(expt2,sc.Even(3));
		
	}
	@Test
	void test3() {
		assertEquals(expt,sc.Even(44));
		
	}
	@Test
	void test4() {
		assertEquals(expt3,sc.Even(-1));
		
	}



}
