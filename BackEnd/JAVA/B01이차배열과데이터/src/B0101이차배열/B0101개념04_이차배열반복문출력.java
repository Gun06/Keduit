package B0101이차배열;

import java.util.Arrays;

public class B0101개념04_이차배열반복문출력 {
	public static void main(String[] args) {
		
		int[][] darr = new int[2][3];
		darr[0][0] = 1;
		darr[0][1] = 2;
		darr[0][2] = 3;
		darr[1][0] = 4;
		darr[1][1] = 5;
		darr[1][2] = 6;
		
		
	  
		
		System.out.println(Arrays.toString(darr[0]));
		System.out.println(Arrays.toString(darr[1]));
		
		System.out.println();
		
		for(int i=0; i < 2; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
		System.out.println(darr.length);		// 행의 길이
		System.out.println(darr[0].length);	// 열의 길이
		System.out.println(darr[1].length);
	}
}
