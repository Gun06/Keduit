package A2002리스트와데이터_개념연습;

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
[1001, 1002, 1003, 1004]
[500, 1200, 4300, 2300]
[1, 0, 1, 1]
[500, 0, 4300, 2300]
*/
public class A2002개념연습11 {
	public static void main(String[] args) {
		int[] item	= {1001, 1002, 1003, 1004};
	    int[] price	= { 500, 1200, 4300, 2300};
	    int[] count	= {   3,    1,    2,    1};
	    int[] totalList = {1500, 1200, 8600, 2300};

	    int[] cancelList = {2, 1, 1, 0};



	    for(int i = 0; i < item.length; i++){
	        count[i] -= cancelList[i];
	        int a = cancelList[i] * price[i];
	        totalList[i] -= a;
	    }
	    
	    System.out.println(Arrays.toString(item));
	    System.out.println(Arrays.toString(price));
	    System.out.println(Arrays.toString(count));
	    System.out.println(Arrays.toString(totalList));
	}
}
