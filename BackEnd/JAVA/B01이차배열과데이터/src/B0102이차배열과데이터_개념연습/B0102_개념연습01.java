package B0102이차배열과데이터_개념연습;

import java.util.Arrays;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 재고 개수이다.
item과 price와 count 는 한 세트이다.
오늘의 매출을 totalList  에 저장한후 출력하시오.
*/ 
/* 
[출력예시]
[1500, 1200, 12900, 9200, 10000]
*/
public class B0102_개념연습01 {
	public static void main(String[] args) {
	    int[][] item = {
	                {1001, 500, 3},
	                {1002, 1200, 1},
	                {1003, 4300, 3},
	                {1004, 2300, 4},
	                {1005, 5000, 2},
	                };

	            int[] totalList = new int[item.length];

	            for(int i = 0; i < item.length; i++){
	                int total = item[i][1] * item[i][2];
	                totalList[i] = total;
	            }
	            System.out.println(Arrays.toString(totalList));
	}
}
