package B0303메서드배열_개념연습;

import java.util.Arrays;
import java.util.Random;

public class B0303개념연습02 {

	public static void solution(int[] arr) {
		Random ran = new Random();
		int[] me = new int[arr.length];
		for(int i = 0; i < me.length; i++) {
			me[i] = ran.nextInt(4) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(me));
		
		int count = 0;
		for(int i = 0; i < me.length; i++) {
			if(arr[i] == me[i]) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		/*
         	[문제]
	            omr배열은 정답이다.
	            me배열에 랜덤숫자(1~4)를 5개 저장 후,
	            omr과 비교하여 정답개수를 출력해주는 함수를 만드시오.
	        [예시]
	            [1, 4, 3, 2, 1]
				[3, 4, 2, 2, 3]
				2
	    */

		int [] arr = {1, 4, 3, 2, 1};
		solution(arr);
	}
}
