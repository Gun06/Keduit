package B0103이차배열과정렬;

import java.util.Arrays;
import java.util.Collections;

public class B0103개념04_정렬_숫자_내림차순 {

	public static void main(String[] args) {
		/*
	        [개념] 배열 숫자 내림차순 정렬
	           int는 내림차순을 할 수 없다.
	           직접 거꾸로 저장해야 한다.
	            
	        [77, 9, 7, 6, 2, 1]
	    */
	
		int[] arr = {6, 7, 2, 1, 9, 77};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// int 자료형은 내림차순 함수를 적용할수 없다. 아래와 같이 직접 뒤집어야 한다. 
		int [] arr2 = new int[arr.length];
		int last = arr2.length-1;
		for(int i = 0; i < arr.length; i++) {
			arr2[last] = arr[i];
			last -= 1;
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
