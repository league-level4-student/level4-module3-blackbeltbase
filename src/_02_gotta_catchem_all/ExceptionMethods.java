package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double x, double y) {
		if(y==0) {
			throw new IllegalArgumentException();
		}
		return x/y;
	}
	String reverseString(String s) {
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		String reversed = "";
		for(int i = s.length()-1; i>=0;i--) {
			reversed+= s.charAt(i);
		}
		return reversed;
	}
}
