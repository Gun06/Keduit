package B0103이차배열과정렬;

import java.util.Arrays;

public class B0103개념01_정렬_문자_오름차순 {

	public static void main(String[] args) {
		/*
	        [개념] 배열 문자열 오름차순 정렬
	            (1) Arrays.sort();
	            
	        [당곡, 미금, 수서, 양재, 정자]
	    */
	
	    String[] arr = {"미금", "당곡", "정자", "수서", "양재"};
	
	    Arrays.sort(arr);
	    
	    System.out.println(Arrays.toString(arr));
	}

}
