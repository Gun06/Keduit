package B0101이차배열;

import java.util.Arrays;
import java.util.Random;

public class B0101개념02_이차배열인덱스 {

	public static void main(String[] args) {
		 /*
	        [문제]
	          	인덱스가 1인 열을 전부 출력하시오.
	        [예시]
	            
	    */
		
		int[][] darr = new int[2][3];
		darr[0][0] = 1;
		darr[0][1] = 2;
		darr[0][2] = 3;
		darr[1][0] = 4;
		darr[1][1] = 5;
		darr[1][2] = 6;
		
		
	
	    System.out.println(darr[1][0] + " " + darr[1][1] + " " + darr[1][2]);
	}

}
