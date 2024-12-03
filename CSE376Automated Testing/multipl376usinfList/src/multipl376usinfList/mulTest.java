package multipl376usinfList;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class mulTest {
	mul obj = new mul();
	int[] arr1 = { 1, 2, 3, 4, 5 };

	@Test
	void Oktest() {
		assertArrayEquals(arr1, obj.mulTable(1, 5));
	}

}
