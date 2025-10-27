package B0103이차배열과정렬;

import java.util.Arrays;
import java.util.Collections;

public class B0103개념02_정렬_문자_내림차순 {

	public static void main(String[] args) {
		/*
	        [개념] 배열 문자열 내림차순 정렬
	            Arrays.sort( 1 , 2 );
	            
	            1번은 배열을 넣고,
	            2번은 식을 넣는다. 
	            
	            Arrays.sort(arr, (a , b)->{});
	            
	            () -> {} 이렇게 생긴문법을 람다라고한다. 
	            식을 해설하면, a 와 b는 각가 배열의 첫번째 값과 두번째 값이 되고 ,
	            서로 비교해서 return 값이 1 이면 큰쪽이 앞으로 오고, 
	            return 값이 -1 이면 작은쪽이 앞으로온다. 
	            이것을 자동으로 배열전체에 다해준다.
	
	            
	        [정자, 양재, 수서, 미금, 당곡]
	    */
	
	    String[] arr = {"미금", "당곡", "정자", "수서", "양재"};
	
	    // [내림 차순]
	    Arrays.sort(arr , (a , b)->{
	    	
	    	if(a.compareTo(b) < 0) {
	    		return 1;
	    	}else if(a.compareTo(b) > 0) {
	    		return -1;
	    	}else {
	    		return 0;	    		
	    	}
	    	
	    });
	    
	    System.out.println(Arrays.toString(arr));
	    
	 // [오름 차순] return -1 ,과 return 1을 조절하면된다. 
	    Arrays.sort(arr , (a , b)->{
	    	
	    	if(a.compareTo(b) < 0) {
	    		return -1;
	    	}else if(a.compareTo(b) > 0) {
	    		return 1;
	    	}else {
	    		return 0;	    		
	    	}
	    	
	    });
	    
	    System.out.println(Arrays.toString(arr));

	}

}
