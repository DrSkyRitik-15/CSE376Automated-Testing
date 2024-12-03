package Evenone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddProgramTest {
EvenOddProgram golo = new EvenOddProgram();
 boolean aa=true;
 boolean bb=false;
 @Test
	void test() {
	 assertEquals(aa,golo.oddOrEven(12));
	
	 
		//fail("Not yet implemented");
	}
 @Test
 void test1() {
	 assertEquals(aa,golo.oddOrEven(60));
 }
 @Test
 void oddTest() {
	 assertEquals(bb,golo.oddOrEven(15));
 }

}
