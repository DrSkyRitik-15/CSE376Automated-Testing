package multipl376usinfList;

public class Amastrong {

	public int check(int a) {
		int sum = 0;
		while (a > 0) {
			int cut = a % 10;
			sum = sum + (cut * cut * cut);
			a = a / 10;

		}
		return sum;

	}

}
