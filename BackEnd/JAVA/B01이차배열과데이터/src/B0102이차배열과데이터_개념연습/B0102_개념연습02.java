package B0102이차배열과데이터_개념연습;

import java.util.Arrays;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 판매 개수이다.
item과 price와 count 는 한 세트이다.
cancelList는 주문이 취소된 내역으로 
판매 개수와 상품 가격을 업데이트 하시오.
*/ 
/* 
[출력예시]
[1001, 500, 1, 500]
[1002, 1200, 0, 0]
[1003, 4300, 3, 12900]
[1004, 2300, 1, 2300]
[1005, 5000, 0, 0]

*/
public class B0102_개념연습02 {
	public static void main(String[] args) {
	    int[][] item = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    int[] cancelList = {2, 1, 0, 3, 2};



	    for(int i = 0; i < item.length; i++){
	        item[i][2] -= cancelList[i];
	        int a = cancelList[i] * item[i][1];
	        item[i][3] -= a;
	    }
	      for(int i = 0; i < item.length; i++){
	    	        System.out.println(Arrays.toString(item[i]));
	    	    }
	    		
	            
	}
}
