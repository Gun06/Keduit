package A1601배열;

import java.util.Arrays;

/*

*/
public class A1601개념10배열의종류별초기값 {
	public static void main(String[] args) {
		
		int [] intArr = new int[4];
		double [] doubleArr = new double[4];
		boolean [] boolArr = new boolean[4];
		char [] charArr = new char[4];
		String[] strArr = new String[4];
		
		System.out.println(Arrays.toString(intArr));  // 0
		System.out.println(Arrays.toString(doubleArr)); // 0.0
		System.out.println(Arrays.toString(boolArr)); // false
		System.out.println(Arrays.toString(charArr)); // ''  (공백)
		System.out.println(Arrays.toString(strArr)); // null 
		
	}
}
