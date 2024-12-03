package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jppTest {

	jpp aa=new jpp();

	@Test
	public void test1() {
        assertEquals("Equilateral", aa.check(3, 3, 3));
    }

    @Test
    public void test2() {
        assertEquals("Iso", aa.check(3, 3, 2));
    }

    @Test
    public void test3() {
        assertEquals("Scalene", aa.check(3, 4, 5));
    }
}
