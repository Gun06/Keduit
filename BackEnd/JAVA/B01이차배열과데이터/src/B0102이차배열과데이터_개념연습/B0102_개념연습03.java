package B0102이차배열과데이터_개념연습;

import java.util.Arrays;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 재고 개수이다.
item과 price와 count 는 한 세트이다.

updateList는 새로 입고된 상품으로 count리스트의
재고 수량을 증가시킨 후, totalList도 업데이트 하시오.
*/ 
/* 
[출력예시]
[1001, 500, 7, 3500]
[1002, 1200, 7, 8400]
[1003, 4300, 4, 17200]
[1004, 2300, 6, 13800]
[1005, 5000, 5, 25000]

*/
public class B0102_개념연습03 {
	public static void main(String[] args) {
	    int[][] item = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    		int[] updateList = {4, 6, 1, 2, 3};
	    		

	    	    for(int i = 0; i < item.length; i++){
	    	        item[i][2] += updateList[i];
	    	        int a = updateList[i] * item[i][1];
	    	        item[i][3] += a;
	    	    }
	    	    for(int i = 0; i < item.length; i++){
	    	        System.out.println(Arrays.toString(item[i]));
	    	    }
	    		
	            
	}
}
