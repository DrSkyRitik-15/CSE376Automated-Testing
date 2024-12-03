package package1;

public class jpp {

	 public String check(int a, int b, int c) {
	        
	        if (a == b && b == c) {
	            return "Equilateral";
	        }
	        if (a == b || b == c || a == c) {
	            return "Iso";
	        }
	        return "Scalene";
	    }

	}

