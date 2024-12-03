import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class okkTest {
	okk aa=new okk();

	@Test
	public void test1() {
        assertEquals("Equilateral", aa.check(3, 3, 3));
    }

    @Test
    public void test2 {
        assertEquals("Isosceles", aa.check(3, 3, 2));
    }

    @Test
    public void test3() {
        assertEquals("Scalene", aa.check(3, 4, 5));
    }
}
