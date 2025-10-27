package B0307리턴배열_개념;

import java.util.Arrays;
import java.util.Random;

public class B0307개념01_약수리턴배열 {	
	
	public static int[] getArrDivsor(int a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				
				count += 1;
			}
		}
		int arr[] = new int[count];
		int index = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				arr[index] = i;
				index += 1;
			}
		}
		return arr;
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
  			랜덤숫자(10~30) 의 변수를 저장한다.
	  		랜덤숫자의 약수를 배열로만들어서  반환하는 함수를 만드시오.
		 */		
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;		
		System.out.println(a);
		int[] c = getArrDivsor(a);
		System.out.println(Arrays.toString(c));
	}
}
