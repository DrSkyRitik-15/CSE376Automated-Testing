package multipl376usinfList;

public class mul {
	

	    // Method to generate the multiplication table for a number up to the given limit
	    public int[] mulTable(int number, int limit) {
	        int[] table = new int[limit];
	        for (int i = 0; i < limit; i++) {
	            table[i] = number * (i+1);
	        }
	        return table;
	    }
	

}
