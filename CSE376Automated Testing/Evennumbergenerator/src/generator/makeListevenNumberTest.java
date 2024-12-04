package generator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class makeListevenNumberTest {
	makeListevenNumber mm = new makeListevenNumber();
	
	ArrayList<Integer> aa= new ArrayList<>(Arrays.asList(2,4,6,8,10));
	@Test
	void test() {
		assertEquals(aa,mm.abc(10));
	}

}
