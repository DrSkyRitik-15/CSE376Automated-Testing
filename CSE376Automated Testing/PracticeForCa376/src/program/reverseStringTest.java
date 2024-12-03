package program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseStringTest {
reverseString obj=new reverseString();
	@Test
	void test() {
		assertEquals("mooZ",obj.check("Zoom"));
	}

}
