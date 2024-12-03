package multipl376usinfList;

public class stringCompair {
	public String withoutCase(String str1, String str2) {
		if (str1.equals(str2)) {
			return "true";
		} else {
			return "false";
		}
	}

	public String AnyCase(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			return "true";
		} else {
			return "false";
		}
	}
}
