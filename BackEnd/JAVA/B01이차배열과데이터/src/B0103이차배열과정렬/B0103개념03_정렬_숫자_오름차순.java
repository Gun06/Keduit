package B0103이차배열과정렬;

import java.util.Arrays;

public class B0103개념03_정렬_숫자_오름차순 {

	public static void main(String[] args) {
		  
	    /*
            [개념] 배열 숫자 오름차순 정렬
               (1) Arrays.sort();
               
            [1, 2, 6, 7, 9, 77]

	    */

	        int[] arr = {6, 7, 2, 1, 9, 77};

	        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));
	        

	}

}
