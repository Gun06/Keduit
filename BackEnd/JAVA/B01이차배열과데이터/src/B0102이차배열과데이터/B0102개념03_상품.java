package B0102이차배열과데이터;

import java.util.Arrays;

/*
[문제]
item 은 번호 가격 판매개수이다. 

각각의 상품별 번호와 매출을 출력하시오.
*/
/*
[출력예시]
[1001, 500, 3] 1500
[1002, 1200, 1] 1200
[1003, 4300, 3] 12900
[1004, 2300, 4] 9200
[1005, 5000, 2] 10000
*/
public class B0102개념03_상품 {
	public static void main(String[] args) {

	    int[][] item = {
	        {1001, 500, 3},
	        {1002, 1200, 1},
	        {1003, 4300, 3},
	        {1004, 2300, 4},
	        {1005, 5000, 2},
	        };

	    for(int i = 0; i < item.length; i++){
	        int total = item[i][1] * item[i][2];
	        System.out.println(Arrays.toString(item[i]) + " " + total);
	    }
	}
}
