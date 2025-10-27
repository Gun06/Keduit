package A2002리스트와데이터_문제;

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
[1001, 1002, 1003, 1004]
[500, 1200, 4300, 2300]
[7, 7, 3, 3]
[3500, 8400, 12900, 6900]
*/
public class A2002문제10 {
	public static void main(String[] args) {
		int[] item 	  = {1001, 1002, 1003, 1004};
	    int[] price 	  = { 500, 1200, 4300, 2300};
	    int[] count 	  = {   3,    1,    2,    1};
	    int[] totalList = {1500, 1200, 8600, 2300};

	    int[] updateList = {4, 6, 1, 2};


	}
}
