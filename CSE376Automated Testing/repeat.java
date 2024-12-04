package FabonaciiSer;

public class repeat {

	public int[] fact(int a) {

		int aa = 0;
		int b = 1;
		int[] aaa = new int[a];

		for (int i = 0; i < a; i++) {
			aaa[i] = aa;
			int c = aa + b;
			aa = b;
			b = c;
		}

		return aaa;
	}

}
