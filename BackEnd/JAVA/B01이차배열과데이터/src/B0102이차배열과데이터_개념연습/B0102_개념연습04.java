package B0102이차배열과데이터_개념연습;

import java.util.Arrays;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 재고 개수이다.

가장 매출이 높은 상품의 번호와 가격을 출력하시오.
단, 매출이 같은 경우 모두 출력하시오.
*/
/*
[출력예시]
10000
[1002, 5000, 2, 10000]
[1005, 5000, 2, 10000]
*/
public class B0102_개념연습04 {
	public static void main(String[] args) {
	    int[][] item = {
	                {1001, 500, 3, 1500},
	                {1002, 5000, 2 , 10000},
	                {1003, 4300, 2, 8600},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    		

	    		 int max = item[0][3];
	    		    for(int i = 1; i < item.length; i++){
	    		        
	    		        if(max <  item[i][3]){
	    		            max =  item[i][3];
	    		        }
	    		    }
	    		    System.out.println(max);

	    		    for(int i = 0; i < item.length; i++){
	    		        if( item[i][3] == max){
	    		           System.out.println(Arrays.toString(item[i]));
	    		        }
	    		    }
	    	    
	    		
	            
	}
}
